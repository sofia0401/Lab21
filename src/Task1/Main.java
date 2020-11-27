package Task1;

public class Main {
    void exceptionDemo() {
        double x = 2.0 / 0.0;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Main exception1 = new Main();
        exception1.exceptionDemo();
    }
}
