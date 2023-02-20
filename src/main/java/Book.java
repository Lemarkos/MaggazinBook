import java.util.Objects;

public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("printing " + getName());
    }

    static void printBooks(Printable[] printable){
        for (Printable i : printable){
            if (i instanceof Book){
                i.print();
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
