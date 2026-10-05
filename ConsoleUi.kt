abstract class ConsoleUi(
    private val gameCoordinator: GameCoordinator,
    private val level: Level
) {
    
    private var command: String = ""
    abstract fun startLevel()
}