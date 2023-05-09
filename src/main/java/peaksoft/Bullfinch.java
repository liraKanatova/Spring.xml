package peaksoft;

public class Bullfinch implements Bird {
    public void getInfo() {
        System.out.println("This is Bullfinch!");
    }

    @Override
    public String toString() {
        return "Bullfinch{}";
    }
}
