fun characterCreationDialog(): String {
    print("Type your name: ")
    val name: String = readln()
    return name
}


fun main() {
    val playerName = characterCreationDialog()
    val demoLevel = DemoLevel(name = "Generic Level", playerName)
    val demoLevelgameCoordinator = DemoLevelGameCoordinator(demoLevel)
    val ui = ConsoleUi(
        demoLevelgameCoordinator, demoLevel
    )
    
    ui.startLevel()
    
}