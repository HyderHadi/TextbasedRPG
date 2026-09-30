class Player(
    private val name: String,
    private var hp: Int,
    private var damage: Int,
    // private val inventory: Inventory
) {
    
    init {
        require(hp >= 0) {
            "Zero HP or less is not allowed"
        }
    }
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
}