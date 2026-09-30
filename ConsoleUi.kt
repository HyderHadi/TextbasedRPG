class ConsoleUi {
    
    private var command: String = ""
    
    fun createPlayerCharacter(): Player {
        println("Type Your Name: ")
        val name = readln()
        val player = Player(
            name,
                hp = 100,
                    damage = 24
        )
        return player
    }
    
    
    
    fun startMainUi(
        player: Player,
        enemy: Enemy
    ) {
        Thread.sleep(2000)
        println("You stepped into an abandoned cave ...")
        Thread.sleep(1000)
        println(". . .\n")
        println("An angry troll is looking at ya, and more than ready to fight")

        while(command != "exit") {
            println("1. Attack\n2. Exit")
            print("Type an action: ")
            command = readln()
            
            when(command.lowercase()) {
                "attack" -> {
                    player.attack(enemy)
                    println("${player.name} Attacked the ${enemy.name}\n")
                    println("${enemy.name}'s HP is ${enemy.getHp()}\n")
                    Thread.sleep(2000)
                    enemy.attack(player)
                    println("${enemy.name} Attacked the ${player.name}\n")
                    println("${player.name}'s HP is ${player.getHp()}\n")
                    if(!enemy.isAlive()) {
                        println("You won\n")
                        enemy.giveXpRewardUponDeath(player)
                        println("You earned ${enemy.xpReward} XP, your XP is ${player.getXp()}/100")
                        return
                    } else if(!player.isAlive()) {
                        println("You lost\n")
                        return 
                    }

                }
                "exit" -> {
                    return
                }
                else -> {
                    println("Error")
                }
            }
        }
    }
}