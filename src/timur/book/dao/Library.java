package timur.book.dao;

import timur.book.model.Book;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
    }

    public boolean addBook(Book book) {
        if (books.length == size) {
            return false;
        }
        books[size] = book;
        size++;
        return true;
    }

    public Book removeBookByTitle(String title) {
        Book victim = findBookByTitle(title);
        if (victim != null)
        {
            System.out.println("\nRemoving book " + victim.getTitle());
            books[helperInt(title)] = books[size-1];
            books[size - 1] = null;
            size--;
            System.out.println(title + " removed from the library");
            return victim;
        }
        System.out.println("Book" + title + "couldn't be found");
        return null;
    }


    public Book findBookByTitle(String title) {
        return helperBook(title);
    }


    private int helperInt(String title){
        for (int i = 0; i < size; i++) {
            if (title.equals(books[i].getTitle())){
                return i;
            }
        }
        return 0;
    }

    private Book helperBook(String title){
        for (int i = 0; i < size; i++) {
            if (title.equals(books[i].getTitle())){
                return books[i];
            }
        }
        return null;
    }


    public Book updateBook(String author, String newAuthor) {
        for (int i = 0; i < size; i++) {
            if (author.equals(books[i].getAuthor())) {
                books[i].setAuthor(newAuthor);
                return books[i];
            }
        }
        return null;
    }

    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println("\n" + books[i]);
        }
    }

    public int getSize() {
        return size;
    }

    public void allBooksByAuthor(String author) {
        System.out.println("All books written by " + author + ": ");
        for (int i = 0; i < size; i++) {
            if (author.equals(books[i].getAuthor())) {
                System.out.println("\n" + books[i]);
            }
        }
    }

    public void publishedFromYear(int year) {
        System.out.println("All books published after: " + year);
        for (int i = 0; i < size; i++) {
            if (books[i].getOrigDatePublished() > year) {
                System.out.println("\n" + books[i]);
            }
        }
    }

    public void publishedInRange(int fromYear, int toYear) {
        System.out.println("All books published between years " + fromYear + " and " + toYear);
        for (int i = 0; i < size; i++) {
            if (books[i].getOrigDatePublished() > fromYear && books[i].getOrigDatePublished() < toYear) {
                System.out.println("\n" + books[i]);
            }
        }
    }


}



