package assignment1;

/*
In this scenario we have an online library system. There are different
types of users: Student and Staff, and two different operations that can be performed
on books: Borrow and Return.
 */


/*
Single Responsibility Principle: Each class has a single responsibility.
    1) The User interface and its implementers Student and Staff are responsible for user-related
        information.
    2) The Book class is responsible for book-related operations.
Open-Closed Principle: The system is open for extension, new type of users can be added without
    modifying the existing classes.
    1) For instance, a Librarian class can be added extending the User interface. Adding a
        librarian class will not affect any other User classes, it will also not affect
        the Book class or BookOperation Interface because their responsiblities are not affected
        by the implementation of a new type of user
Liskov Substitution Principle: The User interface allows any object that implements User to be
    substituted wherever a User is expected. No operation performed by the Student or Staff violates
    the substitution principle
Interface Segregation Principle: The User and BookOperations interfaces are client-specific and
    contain only the methods that the clients (Student, Staff, Book) need.
Dependency Inversion Principle: The Book class depends on the User interface, which is an abstraction,
    rather than depending on concrete classes like Student and Staff. This makes the system more
    flexible and less coupled.

 */

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Software Architecture");
        User student1 = new Student();
        student1.setDetails("Asif", "2001908221");
        User staff1 = new Staff();
        staff1.setDetails("Kamrul", "3001990213");


        book1.borrow(staff1);
        book1.borrow(student1);
        book1.returnBook(staff1);
        book1.borrow(student1);
        book1.returnBook(student1);


    }
}

