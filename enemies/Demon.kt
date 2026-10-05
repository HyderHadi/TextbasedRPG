class Demon: Enemy(
    name = "Demon",
        hp = 571,
            damage = 60,
                xpReward = 100
) {
    fun dropSkullOfGuldan(): Boolean {
        if(!isAlive()) {
            return true
        }
        return false
    }
}