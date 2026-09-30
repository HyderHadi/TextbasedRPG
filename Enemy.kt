class Enemy(
    val name: String,
    private var hp: Int,
    private var damage: Int,
    val xpReward: Int
) {
    
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
    
    fun getHp(): Int {
        return hp
    }
}