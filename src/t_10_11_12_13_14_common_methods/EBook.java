package t_10_11_12_13_14_common_methods;

import java.util.Objects;

public class EBook extends Book {

	private String url;

	public EBook(String ISBN, Author author, String url) {
		super(ISBN, author);
		this.url = url;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		EBook eBook = (EBook) o;
		return Objects.equals(url, eBook.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), url);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("EBook: {id: ");
		sb.append(this.id);
		sb.append(", ISBN: ");
		sb.append(this.ISBN);
		sb.append(", URL: ");
		sb.append(this.url);
		sb.append(", author: ");
		sb.append(this.author.toString());
		sb.append("}");
		return sb.toString();
	}
}
