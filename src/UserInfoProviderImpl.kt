// : означает имплементацию
class UserInfoProviderImpl : UserInfoProviderInterface, DbConnection {

    //Методы можно реализовывать в интерфейсах
    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Метод был переопределен")

    }
}