import java.util.ArrayList;
import java.util.List;

class Library{
	// Library: Create a Library class to manage the library's collection
	// of books and users. It should include methods for adding, removing, and
	// searching for books,
	// as well as tracking user information, borrowing, and returning books.

	private List<Book> books;
	private List<User> users;


	Library(){
		books = new ArrayList<>();
        users = new ArrayList<>();
	}

	public void addBook(Book book){
		books.add(book);
	}

	public void removeBook(Book book){
		books.remove(book);
	}
}