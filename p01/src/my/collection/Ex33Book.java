package my.collection;

public class Ex33Book implements Comparable<Ex33Book> {

	private String bookName;
	private String authorName;
	private double bookPrice;

	public Ex33Book(String bookName, String authorName, double bookPrice) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "[bookName=" + bookName + ", authorName=" + authorName + ", bookPrice=" + bookPrice + "]";
	}

	@Override
	public int compareTo(Ex33Book o) {
		int result = (int) (this.bookPrice - o.bookPrice);
		if (result != 0) {
			return result;
		} else {
			result = this.bookName.compareTo(o.bookName);
			return result;
		}
	}

}
