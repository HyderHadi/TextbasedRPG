class Goblin : Enemy(
    name = "Goblin",
    hp = 200,
    damage = 21,
    // goblin xp reward needs to be back to 100(maybe) ... 200 is just for testing within the demo level
    xpReward = 200
) {
    fun dropDungeonKey(): Boolean {
        if (!isAlive()) {
            return true
        }
        return false
    }
}
