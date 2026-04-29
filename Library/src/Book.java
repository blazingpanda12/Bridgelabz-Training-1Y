
public class Book {
    private int id;
    private String title;
    private boolean issued;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.issued = false;
    }

    public int getId() { return id; }

    public boolean isIssued() { return issued; }

    public void issue() { issued = true; }

    public void returnBook() { issued = false; }

    @Override
    public String toString() {
        return id + " - " + title + (issued ? " (Issued)" : " (Available)");
    }
}