package four

interface Inspector {
    fun inspect(x: Int)
}

interface Painter {
    fun paint(y: Int)
}

interface Repairer {
    fun repair(z: Int)
}

class AutomobileDaug(val x: Int, val y: Int, val z: Int) : Inspector, Painter, Repairer {
    override fun paint(y: Int) {
        paint(y)
    }

    override fun inspect(x: Int) {
        inspect(x)
    }

    override fun repair(z: Int) {
        repair(z)
    }
}

class Automobile(i: Inspector) : Inspector by i

fun main(args: Array<String>) {
    val automobileDaug = AutomobileDaug(45, 78,7)
    Automobile(automobileDaug).inspect(45)

}