package by.htp.books.entity;

public class Book {
	
	private int year;
	private String title;
	private Author author;
	
	public Book()
	{
		
	}
	
	public Book(String title, Author author, int year)
	{
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public Author getAuthor()
	{
		return author;
	}
	
	public void setAuthor(Author author)
	{
		this.author = author;
	}

}
