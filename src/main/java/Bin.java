import java.util.ArrayList;

public class Bin {

    private ArrayList<Book> contents;
    private int capacity;

    public Bin(){
        this.contents = new ArrayList<>();
        this.capacity = 3;
    }


    public int bookCount() {
        return this.contents.size();
    }

    public void addBook(Book book) {
        if (this.contents.size() < 3)
        {this.contents.add(book);}
        else
        {return;}
    }

    public void binBook(Library library){
        if(bookCount() < this.capacity) {
        Book book = library.takeBook();
        addBook(book);
        }
    }
}
