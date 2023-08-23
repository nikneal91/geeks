package concept;


import lombok.*;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Test {
    int f1();
}

interface BooksConsumer<T extends Book> {

    default void printBookObject(T book) {
        System.out.println("BookConsumer Object" + book.toString());
    }

    static void printBook(Book book) {
        System.out.println("BookConsumer " + book.toString());
    }

    static boolean bookTest(Book book) {
        return book.getName().equals("My Book");
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Book {
    private String name;
    private Long id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }



}


@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
class ExtendedBook extends Book {
    private String uniqueCode;

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    @Override
    public String toString() {
        return "ExxBook{" +
                "name='" + this.getName() + '\'' +
                ", id=" + this.getId() + "unique code " + uniqueCode +
                '}';
    }
}



class OptionalExtended<T> {
    private Optional<T> optional;

    public OptionalExtended(Optional<T> optional) {
        this.optional = optional;
    }

    public T ifPresentOrElse(T value) {
        return ifPresentOrElse(this.optional,value);
    }

    public T ifPresentOrElse(Optional<T> optional,T value) {
        return optional.isPresent() ? optional.get() : value;
    }
}

public class Apple implements  BooksConsumer {

    //private String name = "Apple";

    public static void main(String... args) {
        Test t =() -> 2*2;
        Book book = new Book();
        book.setId(1L);
        book.setName("My Book");
        Book b2 = new Book("Second book",2L);
        System.out.println(t.f1());
        ExtendedBook exBk = new ExtendedBook();
        exBk.setUniqueCode("UnqCOde");
        exBk.setId(3L);
        exBk.setName("Extended book with additional parameters");


        Supplier<Stream<Book>> testData =  ()->Stream.of(b2,book);

        BooksConsumer bk = new Apple();
        BooksConsumer<ExtendedBook> exBkConsum = new Apple();


        Consumer<List<Book>> printBooksOjbect = (books) -> {
            books.forEach(bk::printBookObject);
        };



        Consumer<List<Book>> printBooks = (books) -> {
          books.forEach(BooksConsumer::printBook);
        };


        Consumer<Book> bkconsume =  bk::printBookObject;

        Consumer<ExtendedBook> exbkconsu = exBkConsum::printBookObject;

        printBooks.accept(Arrays.asList(book,b2));

        printBooks.accept(testData.get().collect(Collectors.toList()));


        System.out.println("Check below");
        printBooksOjbect.accept(Arrays.asList(exBk));
        System.out.println("Check Above");

        List<Book> booksLists = Arrays.asList(book,b2);

        Function<Book,ExtendedBook> extendBook = (bookinput)-> {
            ExtendedBook bkk = new ExtendedBook();
            bkk.setName(bookinput.getName());
            bkk.setId(bookinput.getId());
            bkk.setUniqueCode("UniqueCode");
            return bkk;
        };


       List<ExtendedBook> extBooksList =  booksLists.stream().map(extendBook).collect(Collectors.toList());

        System.out.println("Accepted");
        exbkconsu.accept(extBooksList.get(0));

        Predicate<Book> bookTest = (bookName) -> bookName.getName().equals("My Book");


        Predicate<Book> bookTestList2 = BooksConsumer::bookTest;


        System.out.println(bookTest.test(b2));
        System.out.println(bookTest.test(book));


        System.out.println("Not matching all " + booksLists.stream().allMatch(bookTest));
        System.out.println("Matching one " + booksLists.stream().anyMatch(bookTestList2));


        printBooksOjbect.accept(Arrays.asList(book,b2));

        OptionalExtended<Integer> value = new OptionalExtended(Optional.ofNullable(new Integer(15)));
        System.out.println(value.ifPresentOrElse(new Integer(20)));

        Optional<Integer> newOptional = Optional.of(3);
        value.ifPresentOrElse(newOptional,4);


        System.out.println("Print book names");
        testData.get().map( (booked)-> booked.getName()).forEach(System.out::println);

    //    printBook.accept(b2);
     //   printBook.accept(book);

    }

}

