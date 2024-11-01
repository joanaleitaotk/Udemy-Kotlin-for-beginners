class Book(val title: String, val author: String, val publicationYear: Int, var price: Double) {

    override fun toString(): String {
        return "Book(title='$title', author='$author', publicationYear=$publicationYear, price=$price)"
    }
}

data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {

}

fun main() {
    val book = Book("Super Book", "John Doe", 2017, 99.99)
    val book2 = Book("Super Book", "John Doe", 2017, 99.99)
    val dataBook = DataBook("Super Book", "John Doe", 2017, 99.99)
    val dataBook2 = DataBook("Super Book", "John Doe", 2017, 99.99)
    val dataBook3 = dataBook.copy(price = 10.00)

    val(title, author, year, price) = dataBook
    val set = hashSetOf(dataBook, dataBook2, dataBook3) // hashSetOf is a function that creates a hash set does not duplicate
    println(set)

    println(book)
    println(dataBook)
    println (dataBook3)
    println(author)

    println(book.equals(book2))
    println(dataBook.equals(dataBook2))
}