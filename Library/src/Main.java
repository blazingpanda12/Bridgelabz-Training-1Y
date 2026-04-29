
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book(1, "Java Basics"));
        lib.addBook(new Book(2, "Data Structures"));

        lib.addMember(new Member(101, "Vishal"));

        lib.issueBook(1, 101);
        lib.showBooks();

        lib.returnBook(1, 101);
        lib.showBooks();
    }
}