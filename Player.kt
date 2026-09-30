class Player(
    val name: String,
    private var hp: Int,
    private var damage: Int,
    // private val inventory: Inventory
) {
    private var xp: Int = 0
    fun isAlive(): Boolean = hp > 0
    
    fun attack(enemy: Enemy) {
        if(isAlive()) {
            enemy.getDamaged(damage)
        }
    }
    
    fun getDamaged(damageAmount: Int) {
        hp = hp - damageAmount
    }
    
    fun incrementXp(xpReward: Int) {
        xp = xp + xpReward
    }
    
    fun getHp(): Int {
        return hp
    }
    
    fun getXp(): Int {
        return xp
    }
}