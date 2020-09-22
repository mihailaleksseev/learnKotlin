// : означает имплементацию
// open - означает что класс может быть унаследован
open class UserInfoProviderImpl() : UserInfoProviderInterface, DbConnection {

    open val db = "DB Connected"

    override val info: String
        get() {
            TODO()
        }

    //Методы можно реализовывать в интерфейсах
    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Метод был переопределен")

    }
}