fun main(args: Array<String>) {

    //задание переменной
    var age: Int = 23

    //если нет ?, то переменная не может принимать null
    var height: Int? = null

    //задание константы
    val name: String = "Tom"

    //тип данных можно не указывать явно
    var surname = "Sawyer"

    //оператор if аналогичен java
    //оператор when работает несколько иначе
    val number = 5
    when (number) {
        null -> print("number is null")
        10 -> print("number is 10")
        else -> print("number in not null and 10")
    }

    //listOf неизменяемый и добавить элементы никак
    var items = listOf(2, 5, 12)

    items.forEach { i -> println(i) }

    items.forEachIndexed { index, i ->
        if (index % 2 == 0) {
            println("element $i with index $index кратен 2")
        }
    }

    //listOf неизменяемый и добавить элементы никак
    var itemsMutable = mutableListOf(2, 5, 12)
    itemsMutable.add(4)

    //тип данных Any позволяет хранить любые значения
    //однако типы можно не указывать явно
    //var user: Map<String, Any> = mapOf("name" to "Tom", "age" to 23, "isMarried" to false)
    var user = mutableMapOf("name" to "Tom", "age" to 23, "isMarried" to false)

    user.forEach { key, value -> println("$key -> $value") }
    user["city"] = "Berlin"

    printCities()

    //циклы
    for (i in 10 downTo 0 step 2) {
    }
    for (i in 0..10) {
    }

    //примеры работы с конструктором
    val rob = User()
    val bob = User("Bob")
    val alex = User("Alex", "Marley")
    val john = User("John", "Doe")

    //сеттеры и геттеры
    val antony = User("Antony", "Leroi")
    antony.login = "Empty"

    //Интерфейсы
    val userProvider = UserInfoProviderImpl()
    userProvider.printInfo(antony)

    //Можно реализовать вложенный класс
    val userInfo = object : UserInfo() {
        override fun printInfo(user: User) {
            super.printInfo(user)
            println("Переопределение прямо во вложенном классе")
        }

        override val db: String
            get() = "db переопределена во вложенном классе"
    }

    //Перечисления
    var animal = Animals.BEAR

    when(animal) {
        Animals.CAT -> println(animal.toLowerCaseAndCapitalise())
        Animals.LION -> println(animal.toLowerCaseAndCapitalise())
        else -> println("Другое животное")
    }

    //Изолированные классы
    val db = SealedDb.MongoDb(111, "connection_url")

    //возможно проверить создан ли объект на основе одного из родителей
    if(db is SealedDb.MongoDb) {
        db.getConnection()
    }

    //copy доступна только для изолированных классов
    //происходит полное копирование, однако чать параметров возможно переопределять
    val db_copy = db.copy(conn = "copy_connection_url")

}


fun printCities() {
    var cities = arrayOf("Moscow", "NY", "Tokyo")
    //для того, чтобы передать в vararg массив мы используем *
    printSome("cities", *cities)
    //мы можем указывать в какой параметр передвать принудительно, а не только порядком
    printSome(word = *arrayOf("Bread", "Milk"), header = "Food")
}

//vararg показыват, что мы можем принимать любое количество параметров
//= задает значение по умолчанию
fun printSome(header: String = "Something", vararg word: String) {
    print("$header: ")
    word.forEach { i -> print("$i ") }
    println("")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}