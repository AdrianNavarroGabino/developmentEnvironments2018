var config = {
    type: Phaser.AUTO,
    width: 370,
    height: 550,
    backgroundColor: "#FFFFFF",
    physics: {
        default: "arcade",
        arcade: {
            gravity: { x: 0, y: 1200 } //Cuanto más alta la y, más rápido cae
        }
    },
    scene: [
        SceneTitle,
        SceneMain,
        SceneGameOver
    ]
};

var game = new Phaser.Game(config);
