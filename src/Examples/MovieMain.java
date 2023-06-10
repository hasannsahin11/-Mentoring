package Examples;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("James Bond", "Disney", "PG13");
        Movie movie1 = new Movie("Titanic", "Marvel");
        System.out.println("First movie is:");
        movie.print();
        System.out.println("Second movie is:");
        movie1.print();
    }
}
