public class MyFirstApp {

    public static void main (String[] args) {
        System.out.print("Я управляю");
        System.out.println(" миром");

        int x = 3;
        String mane = "Knife";
        x = x * 14;
        System.out.println("x равен " + x);
        double d = Math.random();

        while (x > 12) {
            x = x - 1;
            System.out.println(x);
        }

        for (int c = 0; c < 10; c = c + 1) {
            System.out.println("Now c is equal: " + c);
        }
    }

    public static void NKr (String[] args) {
        int x = 3;
        String mane = "Knife";
        x = x * 17;
        System.out.println("x равен " + x);
        double d = Math.random();
    }

}
