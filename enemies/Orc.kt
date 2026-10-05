class Orc: Enemy(
    name = "Orc",
        hp = 260,
            damage = 27,
                xpReward = 20
) {
    fun dropHammer(): Boolean {
        if(!isAlive()) {
            return true
        }
        return false
    }
}