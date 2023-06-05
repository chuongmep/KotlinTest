fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    print("Hello")
    var car = arrayOf("BMW", "Audi", "Benz")
    for (i in car) {
        println(i)
    }
    var st = 1
    while (st <= 10) {
        println(st)
        st++
    }
    var st1 = 1

}