import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library1;
    Book thesunalsorises;
    Book sausagerollbook;
    Book harrypotter;
    Book theartofwar;

    @Before
    public void before(){
        library1 = new Library("Baconfield Library", 3);
        thesunalsorises = new Book();
        sausagerollbook = new Book();
        harrypotter = new Book();
        theartofwar = new Book();
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library1.bookCount());
    }

    @Test
    public void libraryAddsBook(){
        library1.addBook(thesunalsorises);
        assertEquals(1, library1.bookCount());
    }

    @Test
    public void libraryIsFull(){
        library1.addBook(thesunalsorises);
        library1.addBook(sausagerollbook);
        library1.addBook(harrypotter);
        library1.addBook(theartofwar);
        assertEquals(3, library1.bookCount());
    }

    @Test
    public void canTakeBookFromShelf(){
        library1.addBook(theartofwar);
        Book thisBook = library1.takeBook();
        assertEquals(thisBook, theartofwar);
    }

}
