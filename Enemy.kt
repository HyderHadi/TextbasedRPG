class Enemy(
    private val name: String,
    private var hp: Int,
    private var damage: Int,
    private val xpReward: Int
) {
    
    init {
        require(hp >= 0) {
            "Zero HP or less is not allowed"
        }
    }
    
    fun isAlive(): Boolean = hp > 0
    
    fun getDamaged(damageAmount: Int) {
        hp = hp - damageAmount
    }
    
    fun attack(player: Player) {
        if(isAlive()) {
            player.getDamaged(damage)
        }
    }
    
    fun giveXpRewardUponDeath(player: Player) {
        if(!isAlive()) {
            player.incrementXp(xpReward)
        }
    }
}