


fun main() {
    
    val ui = ConsoleUi()
    
    val player = ui.createPlayerCharacter()
    
    val enemy = Enemy("Troll", 50, 60, 15)
    
    ui.startMainUi(player, enemy)
    
}