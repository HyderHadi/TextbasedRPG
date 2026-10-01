class Player(
    name: String,
    hp: Int,
    damage: Int,
    // private val inventory: Inventory
): Character(name, hp, damage) {
    private var xp: Int = 0
    
    fun incrementXp(xpReward: Int) {
        xp = xp + xpReward
    }
    
    fun getXp(): Int {
        return xp
    }
}