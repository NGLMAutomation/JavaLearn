import javafx.beans.binding.When;

public class BeerSong {
    public static void main (String[] args) {
        int BeerNum = 99;
        String word;

        while (BeerNum > 0) {
            if (BeerNum % 10 < 5) {
                word = "бутылки на столе"; // для 9 8 7 6 5
            }
            else {
                word = "бутылок на столе"; // для 4 3 2
            }

            if (BeerNum % 10 == 1) {
                word = "бутылка на столе";
            }
            if (BeerNum % 10 == 0) {
                word = "бутылок на столе";
            }
            System.out.println(BeerNum + " " + word);
            System.out.println(BeerNum + " " + word);
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            BeerNum = BeerNum - 1;

            }
            System.out.println("Нет больше бутылок на столе");
        }
    }

