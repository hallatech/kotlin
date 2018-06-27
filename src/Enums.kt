enum class DogGroups {
    HOUNDS, TERRIERS, WORKING, UTILITY, GUNDOGS, TOYS
}

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

enum class Size {
    SMALL, MEDIUM, LARGE
}
enum class Planets(
    val sequence: Int, val size: Size, val color: Color
) {
    SUN(0, Size.LARGE, Color.YELLOW),
    EARTH(4, Size.MEDIUM, Color.BLUE),
    PLUTO(10, Size.SMALL, Color.YELLOW);

    fun inhabitable() = (sequence == 4)
    fun weather() = when {
        (sequence < 4) -> "too hot"
        (sequence == 4) -> "just right"
        (sequence > 4) -> "too cold"
        else -> "unknown"
    }
}

fun main(args: Array<String>) {
    println("There are many breeds of dog but they all fall into only ${DogGroups.values().size} groups:")
    DogGroups.values().forEach { println(it.name) }
    println("Can we live anywhere in space?")
    Planets.values().forEach({
        println("${it.name} is ${it.size} and ${it.color}. " +
                "It is ${it.inhabitable()}ly inhabitable because its ${it.weather()}!")
    })
}