import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class Scan {

    private Scanner in = new Scanner(System.in);
    public String getInputString(String text) {
        System.out.println(text);
        String s = in.nextLine();
        while (s.equals("")) {
            System.out.println("Недопустимое значение!");
            System.out.println(text);
            s = in.nextLine();
        }
        return s;
    }
    public int getInputInt(String text) {
        System.out.println(text);
        int i = in.nextInt();
        return i;
    }


}
