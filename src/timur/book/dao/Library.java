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
        for (int i = 0; i < size; i++) {
            if (title.equals(books[i].getTitle())) {
                Book victim = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }


    public Book findBookByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (title.equals(books[i].getTitle())) {

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


}



