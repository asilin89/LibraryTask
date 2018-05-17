package by.htp.books.logic;

import by.htp.books.entity.Author;
import by.htp.books.entity.Book;
import by.htp.books.entity.Catalog;

public class Librarian {
	
	
	//����� ������ ���� �� �����
	public void printCatalog(Catalog catalog)
	{
		Book[] books = catalog.getBooks();
		
		for(Book book: books)
		{
			System.out.println(book.getTitle() + "===" + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + "===" 
					+ book.getYear());
		}
	}
	
	//����� ���������� �� ����� ����� �� �����
	public void printBookInfo(Book book)
	{
		System.out.println("Here is the book information: ");
		System.out.println("Book title: " + book.getTitle());
		System.out.println("Author: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
		System.out.println("Year: " + book.getYear());
	}
	
	//����� ����� �� ������, �������� � ���� ������� (���������: ���� �����).
	public void printBookByParameters(Author author, String title, int year)
	{
		System.out.println();
	}
	
	//����� ���� ���� ������ ������ (���������: ������ ���� ���� ���� �����)
	public void printCatalogByAuthor(Author author)
	{
			System.out.println(author.getBook().getTitle());
	}
}
