public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i%2==0)
                continue;
            System.out.print(i+")");
            System.out.println("Hello world!");
        }
    }
}