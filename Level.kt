abstract class Level(
    val name: String
) {
    fun pauseGameEffect() {
        Thread.sleep(1500)
    }
    
}