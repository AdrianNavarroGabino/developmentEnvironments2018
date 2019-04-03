class SceneGameOver extends Phaser.Scene {
    constructor() {
        super({ key: "SceneGameOver" });
    }
    
    create() {
        this.gameOverText = this.add.text(
            this.game.config.width * 0.5,
            this.game.config.height * 0.5,
            "Game Over",
            {
                fontFamily: 'Arial',
                fontSize: 40,
                color: '#888888'
            }
        );
        
        this.scoreText = this.add.text(
            this.game.config.width * 0.5,
            this.game.config.height * 0.5 + 50,
            "Your score: " + localStorage.getItem('score'),
            {
                fontFamily: 'Arial',
                fontSize: 25,
                color: '#ff0000'
            }
        );
        
        this.highScoreText = this.add.text(
            this.game.config.width * 0.5,
            this.game.config.height * 0.5 + 100,
            "High score: " + localStorage.getItem('highScore'),
            {
                fontFamily: 'Arial',
                fontSize: 25,
                color: '#0000ff'
            }
        );
        
        this.gameOverText.setOrigin(0.5, 0.5);
        this.scoreText.setOrigin(0.5, 0.5);
        this.highScoreText.setOrigin(0.5, 0.5);
    }
    
    update() {
        if (this.input.activePointer.isDown ||
            this.input.pointer1.isDown)
                this.scene.start('SceneTitle');
    }
}
