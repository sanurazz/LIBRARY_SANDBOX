
import com.sun.source.tree.IfTree;
import java.util.*;

public class User {

    private int userId;
    private String userName;
    private int noOfBookIssued;
    private String Phone;
    private String Email;
    public List<Books> bk;

    //method 
    public User() {
    }

    public User(String Email, String Phone, int noOfBookIssued, int userId, String userName) {
        this.Email = Email;
        this.Phone = Phone;
        this.noOfBookIssued = noOfBookIssued;
        this.userId = userId;
        this.userName = userName;
        this.bk = new ArrayList<>();
    }

    
    public void addBook(Books book_1)
    {
        this.bk.add(book_1);
        System.out.println(this.userId + " " );
        for(Books book_itr: bk)
        {
            book_itr.getBook();
        }

    }

    public void setNoOfBookIssued(int noOfBookIssued) {
        this.noOfBookIssued = noOfBookIssued;
    }

    public int getNoOfBookIssued() {
        return noOfBookIssued;
    }
}
