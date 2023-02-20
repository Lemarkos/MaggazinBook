
public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("printing " + getName());
    }

    static void printMagazines(Printable[] printable){
        for (Printable i : printable){
            if (i instanceof Magazine){
                i.print();
            }
        }
    }



    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
}
