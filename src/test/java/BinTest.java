import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinTest {

    Bin myBin;
    Library library1;
    Book thesunalsorises;
    Book harrypotter;
    Book theartofwar;
    Book sausagerollbook;

    @Before
    public void before(){
        myBin = new Bin();
        library1 = new Library("Bacon Library", 3);
        harrypotter = new Book();
        theartofwar = new Book();
        sausagerollbook = new Book();
        thesunalsorises = new Book();
    }

    @Test
    public void binStartsEmpty(){
        assertEquals(0, myBin.bookCount());
    }

    @Test
    public void canAddBookToBin(){
        myBin.addBook(theartofwar);
        assertEquals(1, myBin.bookCount());
    }

    @Test
    public void binHasCapacity(){
        myBin.addBook(theartofwar);
        myBin.addBook(harrypotter);
        myBin.addBook(sausagerollbook);
        myBin.addBook(thesunalsorises);
        assertEquals(3, myBin.bookCount());
    }

    @Test
    public void canThrowBookInBin(){
        library1.addBook(thesunalsorises);
        library1.addBook(harrypotter);
        library1.takeBook();
        myBin.binBook(library1);
        assertEquals(1, myBin.bookCount());
    }

}
