package peaksoft;

public class Pigeon implements Bird {
    public void getInfo() {
        System.out.println("This is Pigeon!");
    }

    @Override
    public String toString() {
        return "Pigeon{}";
    }
}
