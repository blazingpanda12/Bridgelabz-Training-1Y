
public class Member {
    private int id;
    private String name;
    private int booksIssued = 0;
    private final int LIMIT = 3;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }

    public boolean canIssue() {
        return booksIssued < LIMIT;
    }

    public void issueOne() {
        booksIssued++;
    }

    public void returnOne() {
        booksIssued--;
    }

    public double calculateFine(int daysLate) {
        return daysLate * 10; // ₹10 per day
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}