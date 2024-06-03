package Library;

public class EBook extends Book{
    private String fileSize;
    private String fileFormat;
    public EBook(){

    }

    public EBook(String fileSize, String fileFormat) {
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
    }

    public EBook(String codeBook, String title, String author, String publishingYear, String genre, String fileSize, String fileFormat) {
        super(codeBook, title, author, publishingYear, genre);
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
    }

    public EBook(String code, String title, String author, String publishingYear) {
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "fileSize='" + fileSize + '\'' +
                ", fileFormat='" + fileFormat + '\'' +
                ", codeBook='" + codeBook + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingYear='" + publishingYear + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
