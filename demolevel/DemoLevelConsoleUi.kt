class DemoLevelConsoleUi(
    private val demoLevelgameCoordinator: DemoLevelGameCoordinator,
    private val demoLevel: DemoLevel
): ConsoleUi(demoLevelgameCoordinator, demoLevel) {

    private var command: String = ""


    override fun startLevel() {
        demoLevelgameCoordinator.pauseGameEffect()
        println("You stepped into an abandoned cave ...")
        demoLevelgameCoordinator.pauseGameEffect()
        println(". . .\n")
        println("An angry ${demoLevel.goblin.name} is looking at ya, and more than ready to fight")

        while(command != "exit") {
            println("1. Attack\n2. Exit")
            print("Type an action: ")
            command = readln()
            println(demoLevelgameCoordinator.parseCommand(command))
            if(demoLevelgameCoordinator.parseCommand(command) == "You Lost, Your HP is ${demoLevel.player.getHp()}") {
                break;
            }
        }
    }
}
