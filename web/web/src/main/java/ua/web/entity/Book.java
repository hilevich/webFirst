package ua.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_book")
	private int idBook; 
	
	@Column (name = "name_book")
	private String nameBook;
	
	@Column (name = "number_page")
	private int numberPage;
	
	@Column (name = "name_autor")
	private String nameAutor;

	public Book() {
		super();
	}

	public Book(String nameBook, int numberPage, String nameAutor) {
		super();
		this.nameBook = nameBook;
		this.numberPage = numberPage;
		this.nameAutor = nameAutor;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public int getNumberPage() {
		return numberPage;
	}

	public void setNumberPage(int numberPage) {
		this.numberPage = numberPage;
	}

	public String getNameAutor() {
		return nameAutor;
	}

	public void setNameAutor(String nameAutor) {
		this.nameAutor = nameAutor;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", nameBook=" + nameBook + ", numberPage=" + numberPage + ", nameAutor="
				+ nameAutor + "]";
	}
	
	
}
