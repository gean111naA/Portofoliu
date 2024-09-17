package ro.siit.session7.oop;

public class Article {
    boolean isPublished;
    String title;
    String description;
    Author author;
    Rating rating = new Rating();

    void printArticle(){
        System.out.println(title + " by " + author.name + "(" + rating.stars + ")");
    }

    void rateArticle(float stars){
        if(stars<0){
            stars = 0;
        }
        if(stars > 5){
            stars = 5;
        }

        rating.stars += stars;
        rating.stars /=2;
    }
}
