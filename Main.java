
import java.util.Scanner;
import java.util.Date;

class Main {

    public static void main(String[] args) {

        User ur = new User("sanu@gmail.com", "+91 7462834121", 1, 2100021, "SAANURAAJ");

        for (int i = 0; i < 3; i++) {
            Books bk = new Books(123 + i, "HC Verma" + i, new Date(), "HC Verma" + i);
           // bk.getBook();
            ur.addBook(bk);
        }

        int noOfBooks = ur.getNoOfBookIssued();
        if(noOfBooks== 5)
        {

          System.out.println("Books cannot be issues as User reached to the maximum limit");
        }
        else
        {
            ur.setNoOfBookIssued(noOfBooks + 1);
        }
        System.out.println("sanu" + ur.getNoOfBookIssued());

    }

}
