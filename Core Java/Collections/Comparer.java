

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Book implements Comparable<Book> {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.title.compareTo(otherBook.title);
    }

    @Override
    public String toString() {
        return "{" + title + ", " + author + ", " + publicationYear + "}";
    }
}

class AuthorCompare implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.author.compareTo(book2.author);
    }
}

class YearCompare implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Integer.compare(book1.publicationYear, book2.publicationYear);
    }
}

class Comparer {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));

        System.out.println("Original Book List:\n" + books);
        Collections.sort(books);
        System.out.println("\nBook List sorted based on title:\n" + books);

        Collections.sort(books, new AuthorCompare());
        System.out.println("\nBook List sorted based on author:\n" + books);

        Collections.sort(books, new YearCompare());
        System.out.println("\nBook List sorted based on publication year:\n" + books);
    }
}
