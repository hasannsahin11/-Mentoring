package Examples;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG-13";
    }
    public void print(){
        System.out.println(this.title);
        System.out.println(this.studio);
        System.out.println(this.rating);
    }
}
