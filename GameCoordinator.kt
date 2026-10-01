abstract class GameCoordinator(
    private val level: Level
) {    
    abstract fun parseCommand(command: String): String
}

