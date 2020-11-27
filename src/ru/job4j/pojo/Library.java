package ru.job4j.pojo;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter1", 10);
        Book book2 = new Book("Clean code", 12);
        Book book3 = new Book("Thinking Java", 100);
        Book book4 = new Book("Mashine learning", 23);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        System.out.println("*** Printing all elements from array ***");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " : " + bk.getLists());
        }
        System.out.println("\n");

        System.out.println("*** replace books[0] and books[3] ***");
        Book buffer = books[0];
        books[0] = books[2];
        books[2] = buffer;
        System.out.println("\n");

        System.out.println("--- Printing all elements from array ---");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " : " + bk.getLists());
        }
        System.out.println("\n");

        System.out.println("=== Pringing all books with Clean Code! ===");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " : " + bk.getLists());
            }
        }
    }
}
