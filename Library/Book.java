package Library;

public class Book {
    protected String codeBook;
    protected String title;
    protected String author;
    protected String publishingYear;
    protected String genre;

    public Book() {
    }

    public Book(String codeBook, String title, String author, String publishingYear, String genre) {
        this.codeBook = codeBook;
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.genre = genre;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "codeBook='" + codeBook + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
