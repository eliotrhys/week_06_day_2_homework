import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> stock;

    public Library(String inputName, int inputCapacity){
        this.name = inputName;
        this.capacity = inputCapacity;
        this.stock = new ArrayList<>();
    }

    public int bookCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.stock.size() < 3 )
        {this.stock.add(book);}
        else
        {return;}
    }

    public Book takeBook(){
        return this.stock.remove(0);
    }

}
