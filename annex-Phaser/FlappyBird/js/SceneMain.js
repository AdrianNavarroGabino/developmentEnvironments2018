class SceneMain extends Phaser.Scene {
    constructor() {
        super({ key: "SceneMain" });
    }
    
    preload() {
        this.load.image("background",
                        "assets/images/bg.jpeg");
        
        this.load.spritesheet("bird",
                              "assets/images/bird_spritesheet.png",
                              {frameWidth: 43, frameHeight: 30, endFrame: 2});
        
        this.load.image("pipe_segment",
                        "assets/images/pipe_segment.png");
        
        this.load.audio('point',
                        'assets/sound/sfx_point.wav');
        this.load.audio('die',
                        'assets/sound/sfx_die.wav');
    }
    
    create() {
        this.background = this.add.tileSprite(
            this.game.config.width * 0.5,
            this.game.config.height * 0.5,
            this.game.config.width,
            this.game.config.height,
            "background"
        );
        
        this.bird = this.physics.add.sprite(
            this.game.config.width * 0.5,
            this.game.config.height * 0.5,
            "bird"
        );
        
        var animation = {
            key: 'fly',
            frames: this.anims.generateFrameNumbers(
                'bird',
                {start: 0, end: 2}
            ),
            frameRate: 10,
            repeat: -1
        };
        
        this.anims.create(animation);
        this.bird.anims.play('fly');
        
        this.spaceBar = this.input.keyboard.addKey(
            Phaser.Input.Keyboard.KeyCodes.SPACE);
        
        this.pipeSegments = this.add.group();
        this.createPipeTimer = this.time.addEvent({
            delay: 2000,
            callback: this.createPipe,
            repeat: -1,
            callbackScope: this
        });
        
        this.gameOver = false;
        
        this.score = 0;
        this.scoreText = this.add.text(20, 500, this.score, {
            fontFamily: 'Arial',
            fontSize: 40,
            color: '#ffffff' 
        });
        
        this.pointSound = this.sound.add('point');
        this.dieSound = this.sound.add('die');
    }
    
    update() {
        if (!this.gameOver &&
            (this.bird.y < 0 ||
             this.bird.y > 460 ||
             this.physics.overlap(this.bird,
                                  this.pipeSegments))
           ) {
            this.setGameOver();
        }
        else if(!this.gameOver)
        {
            this.background.tilePositionX++;

            if(this.spaceBar.isDown ||
               this.input.activePointer.isDown ||
               this.input.pointer1.isDown)
                this.bird.setVelocityY(-350);
        }
    }
    
    createPipe() {
        // Check pipes
        this.pipeSegments.children.each(function(pipe) {
            if (pipe.x < -50)
                pipe.destroy();
        });
        
        // Create new full pipe with a gap of 3 positions
        var gap = Math.floor(Math.random()*4 + 1);
        for (var i = 0; i < 8; i++) {
            if (i != gap && i != gap+1 && i != gap+2) {
                this.createPipeSegment(370, i*55 + 20);
            }
        }
        
        this.pointSound.play();
        this.score++;
        this.scoreText.text = this.score;
    }
    
    createPipeSegment(x, y) {
        var pipeSegment = this.physics.add.sprite(x, y,
                                                  'pipe_segment'); 
        pipeSegment.body.setAllowGravity(false);
        this.pipeSegments.add(pipeSegment);
        pipeSegment.setVelocityX(-150);
    }
    
    setGameOver() {
        this.gameOver = true;
        this.dieSound.play();
        this.pipeSegments.children.each(function(pipe) {
            pipe.setVelocityX(0);
        });
        this.createPipeTimer.destroy();
        
        this.time.addEvent({
            delay: 5000,
            callback: this.moveToGameOver,
            callbackScope: this
        });
        
        localStorage.setItem('score', this.score);
        if (localStorage.getItem('highScore') === null ||
            this.score > localStorage.getItem('highScore'))
                localStorage.setItem('highScore', this.score); 
    }
    
    moveToGameOver() {
        this.scene.start("SceneGameOver");
    }
}