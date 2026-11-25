package Lab2;

public class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int publicationYear, int numberOfPages) {
        super(title, author, publicationYear);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getItemType() {
        return "Book";
    }

    @Override
    public String toString() {
        return "Book[title=" + getTitle() +
                ", author=" + getAuthor() +
                ", publicationYear=" + getPublicationYear() +
                ", numberOfPages=" + numberOfPages + "]";
    }
}
