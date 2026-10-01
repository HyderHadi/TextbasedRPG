class DemoLevel(
    name: String,
    val playerName: String
): Level(name) {
    
    
    // a single enemy
    val enemy = Enemy(
        "Troll",
            50,
                35,
                    15
    )
    
    // the player
    val player = Player(
        playerName,
            hp = 100,
                damage = 30
    )
}