

public class Book extends Media {
	
	private String author;
	private String title;
	private int pages;

	public Book(String auth, String titl, int pag) {
		author = auth;
		title = titl;
		pages = pag;
	}


	@Override
	public String toString() {
		return "Book - Author=" + author + ", Title=" + title + ", Pages=" + pages;
	}


	public String getAuthor() {
		return author;
	}


	public String getTitle() {
		return title;
	}


	public int getPages() {
		return pages;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (pages != other.pages)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
