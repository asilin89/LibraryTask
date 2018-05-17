package by.htp.books.logic;

import by.htp.books.entity.Author;
import by.htp.books.entity.Book;
import by.htp.books.entity.Catalog;

public class Librarian {
	
	
	//вывод списка книг на экран
	public void printCatalog(Catalog catalog)
	{
		Book[] books = catalog.getBooks();
		
		for(Book book: books)
		{
			System.out.println(book.getTitle() + "===" + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + "===" 
					+ book.getYear());
		}
	}
	
	//вывод информации об одной книге на экран
	public void printBookInfo(Book book)
	{
		System.out.println("Here is the book information: ");
		System.out.println("Book title: " + book.getTitle());
		System.out.println("Author: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
		System.out.println("Year: " + book.getYear());
	}
	
	//поиск книги по автору, названию и году издания (результат: одна книга).
	public void printBookByParameters(Author author, String title, int year)
	{
		System.out.println();
	}
	
	//поиск всех книг одного автора (результат: список книг либо одна книга)
	public void printCatalogByAuthor(Author author)
	{
			System.out.println(author.getBook().getTitle());
	}
}
