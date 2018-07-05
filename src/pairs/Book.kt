package pairs

const val MAX_NUMBER_BOOKS = 20

data class Book(val title: String, val author: String, val year: Int) {

    companion object {
        const val BASE_URL = "http://josenaves.com/api/"
    }

    fun getTitleAndAuthor() : Pair<String, String> = title to author

    fun getAllBookInfo(): Triple<String, String, Int> = Triple(title, author, year)

    fun canBorrow(hasBooks: Int) : Boolean {
        return (hasBooks < MAX_NUMBER_BOOKS)
    }

    fun printUrl() {
        println("$BASE_URL/$title.html")
    }
}

fun main(args: Array<String>) {
    val book = Book("Kotlin for Beginners", "Jose Naves", 2018)
    println(book)

    // val (title, author, year) = book.getAllBookInfo()
    val bookTitleAuthorYear = book.getAllBookInfo()

    println("Here is your book ${bookTitleAuthorYear.first} written by ${bookTitleAuthorYear.second} in ${bookTitleAuthorYear.third}")
}