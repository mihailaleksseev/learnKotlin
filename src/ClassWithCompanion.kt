class ClassWithCompanion {
    //вместо модификатора static необходимо использовать companion object
    companion object {
        var count = 0
    }

    init {
        count++
        println("Created $count instance of some class")
    }
}