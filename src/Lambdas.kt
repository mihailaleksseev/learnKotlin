class Lambdas {

    fun filterList(list: List<String>, filter: (String) -> Boolean) {
        list.forEach { el ->
            if (filter(el))
                println(el)
        }
    }

    //В качестве значения поля можно указывать функцию
    val filter: (String) -> Boolean = {
        it.startsWith("P")
    }

    fun callFilterList() {
        var list = listOf("Java", "Go", "Rust")
        filterList(list, filter)
    }
}