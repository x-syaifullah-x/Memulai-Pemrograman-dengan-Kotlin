fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>(
            "type" to ("Motorcycle"),
            "maxSpeed" to("230Km/s"),
            "maxTank" to ("10Ltr")
    )

    // TODO 2
    val type = "Type:"
    val maxSpeed = "Maximal Speed:"
    val maxTank = "Maximal Tank:"

    // TODO 3
    println("Vehicle")
    println("$type ${vehicle["type"]}")
    println("$maxSpeed ${vehicle["maxSpeed"]}")
    println("$maxTank ${vehicle["maxTank"]}")

}