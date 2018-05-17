package by.htp.books.run;

import by.htp.books.entity.Author;
import by.htp.books.entity.Book;
import by.htp.books.entity.Catalog;
import by.htp.books.logic.Librarian;

public class MainApp {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
	Author a1 = new Author("John", "Smith", 1965);
	Author a2 = new Author("Michael", "Green", 1961);
	Author a3 = new Author("Joshua", "King", 1954);
	Author a4 = new Author("Anthony", "Duran", 1977);
	Author a5 = new Author("Casey", "McGregor", 1980);
	
	Book book1 = new Book("Hello World!", a1, 1994);
	Book book2 = new Book("One day in San Francisco", a2, 2002);
	Book book3 = new Book("Brain Games", a3, 2004);
	Book book4 = new Book("Football", a4, 2011);
	Book book5 = new Book("Lovely love", a5, 2001);
	
	Catalog catalog = new Catalog(5);
	
	catalog.addBook(book1);
	catalog.addBook(book2);
	catalog.addBook(book3);
	catalog.addBook(book4);
	catalog.addBook(book5);
	
	Librarian lib = new Librarian();
	
	//lib.printCatalog(catalog);
	//lib.printBookInfo(book5);
	lib.printCatalogByAuthor(a2);

}
	}
