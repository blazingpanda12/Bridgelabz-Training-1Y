
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Transaction {
    private int bookId;
    private int memberId;
    private LocalDate issueDate;
    private LocalDate returnDate;
    private boolean returned = false;

    public Transaction(int bookId, int memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.issueDate = LocalDate.now();
    }

    public int getBookId() { return bookId; }

    public int getMemberId() { return memberId; }

    public boolean isReturned() { return returned; }

    public void returnBook() {
        this.returnDate = LocalDate.now();
        this.returned = true;
    }

    public int getDaysLate() {
        long days = ChronoUnit.DAYS.between(issueDate, returnDate);
        return (int)Math.max(0, days - 7); // 7 days free
    }
}