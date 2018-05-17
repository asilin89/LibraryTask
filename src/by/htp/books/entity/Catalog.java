package by.htp.books.entity;

public class Catalog {

	private Book[] books;
	private int lastIndex;
	
	public Catalog(int size)
	{
		this.books = new Book[size];
	}
	
	public Book[] getBooks()
	{
		return books;
	}
	
	public void addBook(Book book)
	{
		books[lastIndex] = book;
		lastIndex++;
	}
}
