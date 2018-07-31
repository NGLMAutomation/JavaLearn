import java.util.Scanner;

class XCopy {

    public static void main (String[] args) {
        Scan s = new Scan();
        int orig = s.getInputInt("Введите число:");
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);

    }

    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
