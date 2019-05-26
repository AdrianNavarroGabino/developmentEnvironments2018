class SceneTitle extends Phaser.Scene {
    
    constructor() {
        super({ key: "SceneTitle" });
    }
    
    create() {
        this.titleText = this.add.text(
            this.game.config.width * 0.5,
            this.game.config.height * 0.5,
            "Space Asteroids",
            {
                fontFamily: 'Arial',
                fontSize: 35,
                color: '#FFFFFF'
            }
        );
        
        this.touchTheScreenText = this.add.text(
            this.game.config.width * 0.5,
            this.game.config.height * 0.5 + 37,
            "Touch the screen to start",
            {
                fontFamily: 'Arial',
                fontSize: 23,
                color: '#FFFF00'
            }
        );
        
        this.input.on("pointerdown", function() {
            this.scene.start("SceneMain");
        }, this);
        
        this.cameras.add(0, 0, this.game.width, this.game.height).setBackgroundColor('rgba(0, 0, 0, 1)');
        
        this.titleText.setOrigin(0.5, 0.5);
        this.touchTheScreenText.setOrigin(0.5, 0.5);
    }
}