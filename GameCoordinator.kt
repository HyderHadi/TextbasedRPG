abstract class GameCoordinator(
    private val level: Level
) {    
    abstract fun parseCommand(command: String): String
    
    fun pauseGameEffect() {
        Thread.sleep(1500)
    }
}

