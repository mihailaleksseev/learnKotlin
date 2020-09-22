//по умолчанию везде указан модификатор доступа public, прописывать его не нужно
//internal, модификатор доступа только внутри пакета
//private аналогичен java
//protected аналогичен java

class User(var firstName: String = "Rob", var secondName: String = "Swanson") {

    //через set указываем конструктор
    var login: String? = null
        set(value) {
            if (value == "Empty")
                field = "Default"
            else
                field = value
            println("Значение переменной: $field")
        }
        get() {
            val loginField = field ?: "Не задан"
            println("Вызван getter переменной login, значение $loginField")
            return loginField
        }

    fun printUser() {
        println("first name $firstName, second name $secondName, login $login")
    }
}


/*

//В круглых скобках после названия класса указывается конструктор и его параметры
//там же возможно указать значения по умолчанию, код аналогичен User3
class User4(var firstName: String = "Rob", var secondName: String = "Swanson") {

}

class User3(var firstName: String, var secondName: String) {

    //возможно объявить конструктор по умолчанию, который будет вызван, если в
    //объект не переданы данные, например val rob = User()
    constructor(): this("Rob", "Swanson") {
        println("Конструктор сработал")
    }

    //конструктор возможно переопредлеять
    constructor(firstName: String): this( firstName,"Swanson") {
        println("Конструктор сработал")
    }

}





//объявление переменных в конструкторе эквивалентно объявлению в User1
class User2(var firstName: String, var secondName: String) {

}

class Use1(firstNameIncome: String, secondNameIncome: String) {
    var firstName: String
    var secondName: String

    //функция вызывающаяся при инициализации объекта, скорее всего до конструктора
    init {
        firstName = firstNameIncome
        secondName = secondNameIncome
    }
}
*/