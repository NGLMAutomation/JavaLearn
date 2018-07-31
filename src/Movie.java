public class Movie {
    String title;
    String genre;
    int rating;
    int views = 0;
    void playIt() {
        System.out.println("Проигрывание фильма");
        views = views +1;
    }

}
