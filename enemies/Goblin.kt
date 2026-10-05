class Goblin: Enemy(
    name = "Goblin",
        hp = 200,
            damage = 21,
                xpReward = 10
) {
    fun dropDungeonKey(): Boolean {
        if(!isAlive()) {
            return true
        }
        return false
    }
}