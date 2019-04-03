class SceneTitle extends Phaser.Scene {
    constructor() {
        super({ key: "SceneTitle" });
    }
    
    preload() {
        this.load.image("btnPlay",
                        "assets/images/sprBtnPlay.png");    
    }
    
    create() {
        this.btnPlay = this.add.sprite(
            this.game.config.width * 0.5,
            this.game.config.height * 0.5,
            "btnPlay"
        );
        this.btnPlay.setInteractive();
        
        this.btnPlay.on("pointerdown", function() {
            this.scene.start("SceneMain");        
        }, this);
    }
}