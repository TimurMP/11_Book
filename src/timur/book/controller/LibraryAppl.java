package timur.book.controller;

import timur.book.dao.Library;
import timur.book.model.Book;

public class LibraryAppl {
    public static void main(String[] args) {

        Library lib = new Library(10);
        lib.addBook(new Book("9780385199575", "The Stand", "Stephen King", 1978,
                2011, "Thriller", "123", "English", "Paperback"));
        lib.addBook(new Book("5412365987412", "The Green Mile", "Stephen King", 1978,
                2011, "Mystery", "111", "English", "Paperback"));
        lib.addBook(new Book("2136459785212", "Digital Fortress", "Dan Brown", 1998,
                2004, "Novels", "14", "English", "Hard Cover"));
        lib.addBook(new Book("0123254523214", "It", "Stephen King", 1986,
                2011, "Horror", "13", "English", "E-book"));
        lib.addBook(new Book("1235212366554", "11/22/63", "Stephen King", 2011,
                2015, "Fiction", "123", "English", "Paperback"));

        System.out.println("Books amount:");
        System.out.println(lib.getSize());
        System.out.println("\nAll books in the shelves:");
        lib.printBooks();
        lib.removeBookByTitle("It");
        System.out.println("\nNew Books amount after removal:");
        System.out.println(lib.getSize());
        System.out.println("\nUpdating Book's author");
        lib.updateBook("Stephen King","Richard Bachman");
//        System.out.println(lib.findBookByTitle("The Stand"));
        System.out.println("Book with updated author:\n");
        System.out.println(lib.findBookByTitle("The Stand"));
        System.out.println("\n\n\n------------------");
        lib.allBooksByAuthor("Stephen King");
        System.out.println("\n");
        lib.publishedFromYear(1990);
        System.out.println("\n");
        lib.publishedInRange(1980, 1990);











    }
}
