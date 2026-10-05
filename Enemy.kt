open class Enemy(
    name: String,
    hp: Int,
    damage: Int,
    val xpReward: Int
): Character(name, hp, damage) {
    
    fun giveXpRewardUponDeath(player: Player) {
        if(!isAlive()) {
            player.incrementXp(xpReward)
        }
    }
}