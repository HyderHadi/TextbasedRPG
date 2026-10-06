class Player(
    name: String,
    // hp = xp * 3(arbitrary number and operation)
    hp: Int = 100 * 3,
    // damage = xp / 4(arbitrary number and operation)
    damage: Int = 100 / 4,
    val inventory: MutableList<String> = mutableListOf(),
    private var xp: Int = 100,
    private var playerLevel: Int = 1
) : Character(name, hp, damage) {


    fun incrementXp(xpReward: Int) {
        xp = xp + xpReward
    }

    fun levelUpPlayerOnXp(): Player {
        return when {
            // level 2
            xp >= 300 -> {
                Player(
                    name = name,
                    hp = getHp() * 2,
                    damage = getDamage() * 2,
                    xp = getXp(),
                    playerLevel = 2
                )
            }
            // remove the else bracnh later when you add only fixed amount of levels like in an enum
            else -> {
                Player(
                    name = name,
                    hp = getHp() * 1,
                    damage = getDamage() * 1
                )
            }
        }
    }

    fun getXp(): Int {
        return xp
    }

    fun getPlayerLevel(): Int {
        return playerLevel
    }
}
