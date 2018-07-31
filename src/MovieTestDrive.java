

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как Прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;


        Movie two = new Movie();
        two.title = "Потерянные в офисе";
        two.genre = "Документальный";
        two.rating = 15;
        System.out.println(two.views);
        two.playIt();
        System.out.println(two.views);


        Movie three = new Movie();
        three.views = 1;
        three.rating = one.rating + two.rating;
        System.out.println(three.rating);
    }
}