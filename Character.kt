abstract class Character(
    val name: String,
    private var hp: Int,
    private var damage: Int
) {


    fun isAlive(): Boolean = hp > 0

    fun attack(character: Character) {
        if(isAlive()) {
            character.getDamaged(damage)
        }
    }

    fun getDamaged(damageAmount: Int) {
        hp = hp - damageAmount
    }

    fun getHp(): Int {
        return hp
    }

    fun getDamage(): Int {
        return damage
    }
}
