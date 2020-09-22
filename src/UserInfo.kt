open class UserInfo : UserInfoProviderImpl() {

    override val db
        get() = "DB connected successfully"

    override val info: String
        get() {
            TODO()
        }
}