fun characterCreationDialog(): String {
    print("Type your name: ")
    val name: String = readln()
    return name
}

fun levelPickerDialog(): LevelOption {
    println("1. Demo Level\n2. Adventure 1")
    print("Choose a level(Type a number): ")
    val choice: Int? = readln().toIntOrNull()
    println("\n")
    return when(choice) {
        1 -> LevelOption.DemoLevel
        2 -> LevelOption.AdventureOne
        else -> levelPickerDialog()
    }
}

fun levelPicker(levelOption: LevelOption) {
    
    when(levelOption) {
        LevelOption.DemoLevel -> {
            val playerName = characterCreationDialog()
            val demoLevel = DemoLevel(name = "Demo Level", playerName)
            val demoLevelgameCoordinator = DemoLevelGameCoordinator(demoLevel)
            val ui = DemoLevelConsoleUi(
                demoLevelgameCoordinator, demoLevel
            )
            
            ui.startLevel()
        }
        LevelOption.AdventureOne -> { }
    }
}




fun main() {
    val mapChoice = levelPickerDialog()
    levelPicker(mapChoice)
}

enum class LevelOption {
    DemoLevel,
    AdventureOne
}