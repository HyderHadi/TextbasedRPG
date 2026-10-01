class DemoLevelGameCoordinator(
    private val demoLevel: DemoLevel
): GameCoordinator(demoLevel) {
    
    override fun parseCommand(command: String): String {
        when(command.lowercase()) {
            "attack" -> {
                demoLevel.player.attack(demoLevel.enemy)
                demoLevel.enemy.attack(demoLevel.player)
                demoLevel.pauseGameEffect()
                return """
                    ${demoLevel.player.name} attacked and the ${demoLevel.enemy.name} HP is ${demoLevel.enemy.getHp()}
                    ${demoLevel.enemy.name} attacked and the ${demoLevel.player.name} HP is ${demoLevel.player.getHp()}
                """.trimIndent()
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