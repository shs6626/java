package class1;

public class Movie1 {

  public static void main(String[] args) {

    Movie movie = new Movie();
    movie.title = "인셉션";
    movie.review = "인생";

    Movie movie1 = new Movie();
    movie1.title = "about time";
    movie1.review = "good";

    Movie[] movies = new Movie[]{movie, movie};

    for (Movie i : movies) {
      System.out.println(i + " " + i.review);

    }



  }

}
