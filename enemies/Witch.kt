class Witch: Enemy(
    name = "Witch",
        hp = 439,
            damage = 46,
                xpReward = 40
) {
    fun dropStaffOfOrigination(): Boolean {
        if(!isAlive()) {
            return true
        }
        return false
    }
}