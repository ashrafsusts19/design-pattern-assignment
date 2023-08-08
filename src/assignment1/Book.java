package assignment1;

public class Book implements BookOperations {
    private User user;
    private String title;
    private boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public void borrow(User user) {
        if (this.isBorrowed) {
            System.out.println("Book already borrowed by " + this.user.getName());
        } else {
            this.user = user;
            this.isBorrowed = true;
            System.out.println(user.getName() + " borrowed the book " + this.title);
        }
    }

    public void returnBook(User user) {
        if (this.isBorrowed && this.user.getID().equals(user.getID())) {
            this.isBorrowed = false;
            System.out.println(user.getName() + " returned the book " + this.title);
        } else {
            System.out.println(user.getName() + " did not borrow this book");
        }
    }
}