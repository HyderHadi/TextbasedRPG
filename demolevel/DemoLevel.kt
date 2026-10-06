class DemoLevel(
    name: String,
    val playerName: String
): Level(name) {


    // a single enemy
    val goblin = Goblin()

    // the player
    var player = Player(playerName)
}
