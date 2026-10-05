class ConsoleUi(
    private val demoLevelgameCoordinator: DemoLevelGameCoordinator,
    private val demoLevel: DemoLevel
) {
    
    private var command: String = ""
    
    
    fun startLevel() {
        demoLevelgameCoordinator.pauseGameEffect()
        println("You stepped into an abandoned cave ...")
        demoLevelgameCoordinator.pauseGameEffect()
        println(". . .\n")
        println("An angry troll is looking at ya, and more than ready to fight")

        while(command != "exit") {
            println("1. Attack\n2. Exit")
            print("Type an action: ")
            command = readln()
            println(demoLevelgameCoordinator.parseCommand(command))
        }
    }
}