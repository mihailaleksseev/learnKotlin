//изолированные классы похожи на перечисленя,
//однако в них храняться целые классы данных
sealed class SealedDb {
    data class MySQL(val id: Int, val conn:String): SealedDb() {

        val metaInfo: String
            get() {
                return "meta inf"
            }
        fun getConnection() {
            println("Connection successfully")
        }
    }
    data class MongoDb(val id: Int, val conn:String): SealedDb() {
        fun getConnection() {
            println("Connection successfully")
        }
    }
    //функции можно прописывать и за пределами класса
    data class PostgreSQL(val id: Int, val conn:String, val isDone: Boolean): SealedDb()

    object Help : SealedDb() {
        val conn = "Connection done"
    }
}

val SealedDb.MongoDb.metaInfo: String
    // данная запись аналогична return "mongo meta info"
    get() = "mongo meta info"

fun SealedDb.PostgreSQL.getConnection() {
    println("Connection successfully id is $id connection url is $conn")
}