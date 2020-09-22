// в интерфейсах можно реализовывать методы
// в интерфейсах можно объявлять поля, но не можем задавать значения
interface UserInfoProviderInterface {

    val info: String
    fun printInfo(user: User) {
        println("Метод был вызван")
        user.printUser()
    }
}