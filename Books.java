
import java.util.Date;

public class Books {

    private int bookId;
    private String bookName;
    private Date dateOfIssue;
    private String writter;

    public Books() {

    }

    public Books(int bookId, String bookName, Date dateOfIssue, String writter) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.dateOfIssue = dateOfIssue;
        this.writter = writter;
    }

    public void getBook() {
        System.out.println(bookId + " " + bookName + " " + dateOfIssue + " " + writter);
    }
    public int getId()
    {
        return this.bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public String getWritter() {
        return writter;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public void setWritter(String writter) {
        this.writter = writter;
    }

}
