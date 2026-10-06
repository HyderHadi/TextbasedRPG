class DemoLevelGameCoordinator(
    private val demoLevel: DemoLevel
): GameCoordinator(demoLevel) {

    override fun parseCommand(command: String): String {
        when(command.lowercase()) {
            "attack" -> {
                demoLevel.player.attack(demoLevel.goblin)
                demoLevel.goblin.attack(demoLevel.player)
                pauseGameEffect()
                if(!demoLevel.player.isAlive()) {
                    return "You Lost, Your HP is ${demoLevel.player.getHp()}"
                } else if(!demoLevel.goblin.isAlive()) {
                    demoLevel.goblin.giveXpRewardUponDeath(demoLevel.player)
                    val updatedPlayer = demoLevel.player.levelUpPlayerOnXp()
                    demoLevel.player = updatedPlayer
                    return """
                    You Won the ${demoLevel.goblin.name} is dead
                    You leveled up to ${demoLevel.player.getPlayerLevel()}

                    Your stats:
                        xp: ${demoLevel.player.getXp()}
                        HP: ${demoLevel.player.getHp()}
                        damage: ${demoLevel.player.getDamage()}
                    """.trimIndent()
                } else {
                    return """
                        ${demoLevel.player.name} attacked and the ${demoLevel.goblin.name} HP is ${demoLevel.goblin.getHp()}
                        ${demoLevel.goblin.name} attacked and ${demoLevel.player.name} HP is ${demoLevel.player.getHp()}
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
