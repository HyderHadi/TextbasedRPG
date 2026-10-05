class Dwarf: Enemy(
    name = "Dwarf",
        hp = 338,
            damage = 35,
                xpReward = 30
) {
    fun dropGold(): Boolean {
        if(!isAlive()) {
            return true
        }
        return false
    }
}