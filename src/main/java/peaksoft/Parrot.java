package peaksoft;

public class Parrot implements Bird {
    public void getInfo() {
        System.out.println("This is Parrot!");
    }

    @Override
    public String toString() {
        return "Parrot{}";
    }
}
