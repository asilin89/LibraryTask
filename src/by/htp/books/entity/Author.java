package by.htp.books.entity;

public class Author {

	private String firstName;
	private String lastName;
	private int birthDay;
	private Book book;
	
	public Author()
	{
		
	}
	
	public Author(String firstName, String lastName, int birthDay)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public int getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(int birthDay) 
	{
		this.birthDay = birthDay;
	}
	
	public Book getBook()
	{
		return book;
	}
	
	public void setBook(Book book)
	{
		this.book = book;
	}
}
