var score;
var scoreText;

class SceneMain extends Phaser.Scene {
    
    constructor() {
        super({ key: "SceneMain" });
    }
    
    preload() {
        this.load.image("background",
                       "assets/images/bg.png");
        
        this.load.image("ship",
                        "assets/images/spaceship.png");
        
        this.load.image("asteroid",
                        "assets/images/asteroid.png");
    }
    
    create() {
        this.background = this.add.tileSprite(
            this.game.config.width * 0.5,
            this.game.config.height * 0.5,
            this.game.config.width,
            this.game.config.height,
            "background"
        );
        
        this.ship = this.physics.add.sprite(
                            this.game.config.width * 0.5,
                            this.game.config.height * 0.5 + 220,
                            'ship');
            
        this.left = this.input.keyboard.addKey(
            Phaser.Input.Keyboard.KeyCodes.LEFT);
        
        this.right = this.input.keyboard.addKey(
            Phaser.Input.Keyboard.KeyCodes.RIGHT);
        
        this.asteroids = this.add.group();
        this.createAsteroidTimer = this.time.addEvent({
            delay: 1000,
            callback: this.createAsteroid,
            repeat: -1,
            callbackScope: this
        });
        
        this.gameOver = false;
        
        score = 0;
        scoreText = this.add.text(20, 20, score, {
            fontFamily: 'Arial',
            fontSize: 40,
            color: '#ffffff' 
        });
        
        this.input.on('pointermove', function (pointer) {

            //  Keep the paddle within the game
            this.ship.x = Phaser.Math.Clamp(pointer.x, 52, 748);

        }, this);
    }
    
    update() {
        if(!this.gameOver &&
          this.physics.overlap(this.ship,
                              this.asteroids)) {
            this.setGameOver();
        }
        else if(!this.gameOver) {
            this.background.tilePositionY--;
            
            if(this.left.isDown &&
              this.ship.x > this.ship.width / 2) {
                this.ship.x -= 4;
            }
            
            if(this.right.isDown &&
              this.ship.x < this.game.config.width - this.ship.width / 2) {
                this.ship.x += 4;
            }
        }
    }
    
    createAsteroid() {
        this.asteroids.children.each(function(asteroid) {
            if(asteroid.y > 550) {
                asteroid.destroy();
                score++;
            }
        });
        
        var asteroid = this.physics.add.sprite(
                                            Math.random() *
                                            (this.game.config.width - 50) +
                                            25,
                                            0, 'asteroid');
        
        this.asteroids.add(asteroid);
        asteroid.setVelocityY(150);
        
        scoreText.text = score;
    }
    
    setGameOver() {
        this.gameOver = true;
        this.asteroids.children.each(function(asteroid) {
            asteroid.setVelocityY(0);
        });
        this.ship.setVelocityX(0);
        this.createAsteroidTimer.destroy();
        
        this.time.addEvent({
            delay: 5000,
            callback: this.moveToGameOver,
            callbackScope: this
        });
        
        localStorage.setItem('score', score);
        if (localStorage.getItem('highScore') === null ||
            score > localStorage.getItem('highScore'))
                localStorage.setItem('highScore', score); 
    }
    
    moveToGameOver() {
        this.scene.start("SceneGameOver");
    }
}