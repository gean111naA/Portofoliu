package ro.siit.session7.oop;

public class ArticleManagementSystem {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author();
        authors[0].name = "Ion Cristoiu";

        authors[1] = new Author();
        authors[1].name = "Orice";

        Article[] articles = new Article[3];

        articles[0] = new Article();
        articles[0].title = "Dezbatere electorala";
        articles[0].author = authors[0];
        articles[1] = new Article();
        articles[2] = new Article();

        articles[0].printArticle();

        articles[0].rateArticle(4);

        articles[0].printArticle();

        articles[0].author = authors[1];

        articles[0].rateArticle(5);
        articles[0].printArticle();

    }
}
