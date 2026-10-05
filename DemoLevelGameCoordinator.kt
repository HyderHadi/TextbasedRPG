class DemoLevelGameCoordinator(
    private val demoLevel: DemoLevel
): GameCoordinator(demoLevel) {
    
    override fun parseCommand(command: String): String {
        when(command.lowercase()) {
            "attack" -> {
                demoLevel.player.attack(demoLevel.enemy)
                demoLevel.enemy.attack(demoLevel.player)
                pauseGameEffect()
                if(!demoLevel.player.isAlive()) {
                    return "You Lost, Your HP is ${demoLevel.player.getHp()}"
                } else if(!demoLevel.enemy.isAlive()) {
                    return "You Won the ${demoLevel.enemy.name} is dead."
                } else {
                    return """
                        ${demoLevel.player.name} attacked and the ${demoLevel.enemy.name} HP is ${demoLevel.enemy.getHp()}
                        ${demoLevel.enemy.name} attacked and ${demoLevel.player.name} HP is ${demoLevel.player.getHp()}
                    """.trimIndent()
                }
            }
            "exit" -> {
                return "Bye Bye\n\n"
            }
            else -> {
                return "Invalid Command\n\n"
            }
        }
    }
}