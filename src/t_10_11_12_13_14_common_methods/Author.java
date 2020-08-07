package t_10_11_12_13_14_common_methods;

import java.util.Set;

public class Author {

	private static int currentId = 0;

	private int id;
	private String name;
	private String surname;

	private Set<Book> books;

	public Author(String name, String surname) {
		this.id = ++currentId;
		this.name = name;
		this.surname = surname;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Author: {id: ");
		sb.append(this.id);
		sb.append(", name: ");
		sb.append(this.name);
		sb.append(", surname: ");
		sb.append(this.surname);
		sb.append("}");
		return sb.toString();
	}
}
