package t_10_11_12_13_14_common_methods;

import java.util.Objects;

public class Book {

	private static int currentId = 0;

	protected int id;
	protected String ISBN;
	protected Author author;

	public Book(String ISBN, Author author) {
		this.id = ++currentId;
		this.ISBN = ISBN;
		this.author = author;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Book other = (Book) obj;
		if (this == other) {
			return true;
		}
		if (this.id != other.id || !this.ISBN.equals(other.ISBN) || this.author != other.author) {
			return false;
		}
		return true;

	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, ISBN, author);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Book: {id: ");
		sb.append(this.id);
		sb.append(", ISBN: ");
		sb.append(this.ISBN);
		sb.append(", author: ");
		sb.append(this.author.toString());
		sb.append("}");
		return sb.toString();
	}
}
