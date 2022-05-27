package timur.book.controller;

import timur.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("9780385199575", "The Stand", "Stephen King", 1978,
                2011, "Thriller", "123", "English", "Paperback");
        books[1] = new Book("The Green Mile", "Stephen King", "Mystery");
        books[2] = new Book("Digital Fortress", "Dan Brown", 1998, 2004);


        books[0].printBookInfo();
        books[1].printBookInfo(books[1].getTitle(), books[1].getAuthor(), books[1].getGenre());
        System.out.println();
        books[2].printBookInfo(books[2].getTitle(), books[2].getAuthor(), yearsPassedBeforeRepublish(books[2].getOrigDatePublished()
                , books[2].getDatePublished()));

        listAllBooks(books);


    }


    public static void listAllBooks(Book[] books) {
        System.out.println("\n---------------------------");
        System.out.println("|  Books in the Library:   |");
        System.out.println("---------------------------");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getTitle() + " by " + books[i].getAuthor() + ".");

        }
    }

    public static int yearsPassedBeforeRepublish(int origDatePublished, int datePublished) {
        int years = datePublished - origDatePublished;
        return years;
    }
}
