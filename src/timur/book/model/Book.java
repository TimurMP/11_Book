package timur.book.model;

public class Book {

    private String isbn;
    private String title;
    private String author;
    private int origDatePublished;
    private int datePublished;
    private String genre;
    private String format;
    private String language = "English";


    //In case when full info on book is needed, for example in a library's DB.
    public Book(String isbn, String title, String author,
                int origDatePublished, int datePublished,
                String genre, String edition, String language, String format) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.origDatePublished = origDatePublished;
        if (datePublished > 1900) {
            this.datePublished = datePublished;
        }
        this.genre = genre;
        this.format = format;
        this.language = language;
    }

    //In case just basic info on book is needed. For a reader for example.
    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    //Tracks editions publishing frequencies in a book store for example.
    public Book(String title, String author, int origDatePublished, int datePublished) {
        this.title = title;
        this.author = author;
        this.origDatePublished = origDatePublished;
        this.datePublished = datePublished;
    }

    public void printBookInfo() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nGenre: " + genre
                + "\nLanguage: " + language + "\nDate Published: " + datePublished
                + "\nFirst time Published: " + origDatePublished + "\nFormat: " + format + "\nISBN: " + isbn);
    }

    public void printBookInfo(String title, String author, String genre) {
        System.out.println("\nTitle: " + title + "\nAuthor: " + author + "\nGenre: " + genre);
    }


    public void printBookInfo(String title, String author, int yearsPassedBeforeRepublish) {
        System.out.println(title + " by " + author + " has been re-published in "
                + yearsPassedBeforeRepublish + " years after it's original release.");

    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public int getOrigDatePublished() {
        return origDatePublished;
    }


    public int getDatePublished() {
        return datePublished;
    }

    public String getGenre() {
        return genre;
    }


}

