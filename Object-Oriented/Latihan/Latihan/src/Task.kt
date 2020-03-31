// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false
        get() {
            message("getter")
            return field
        }
        set(value) {
            message("setter")
            field = value;
        }

    private fun message(value: String) {
        println("Fungsi $value dipanggil")
    }

    fun toSleep() {
        println("$name, ${if (this.sleep) "sleep!" else "let's play!"}")
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}