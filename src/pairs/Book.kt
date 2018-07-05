package pairs

import java.util.*

const val MAX_NUMBER_BOOKS = 20

data class Book(val title: String, val author: String, val year: Int, var pages: Int = 0) {

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

fun Book.weigth(): Double = (pages * 1.5)

fun Book.tornPages(torn : Int) =  if (pages >= torn) pages -= torn else pages = 0

fun ClosedRange<Int>.random() =
        Random().nextInt((endInclusive + 1) - start) +  start


class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages((1..10).random())
    }
}

fun main(args: Array<String>) {
    val book = Book("Kotlin for Beginners", "Jose Naves", 2018)
    println(book)

    // val (title, author, year) = book.getAllBookInfo()
    val bookTitleAuthorYear = book.getAllBookInfo()

    println("Here is your book ${bookTitleAuthorYear.first} written by ${bookTitleAuthorYear.second} in ${bookTitleAuthorYear.third}")

    val otherBook = Book("Android Programming", "Stewart Phillips", 2015, 500)
    println("otherBook pages = ${otherBook.pages}")

    val puppy = Puppy()


    while (otherBook.pages > 0) {
        puppy.playWithBook(otherBook)
        println("${otherBook.pages} left in ${otherBook.title}")
    }

    println("Sad puppy, no more pages in ${book.title}. ")
}