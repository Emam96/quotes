package quotes;


import java.io.Reader;

public class Quote {


   private String author;
    private   String text;


    public Quote(  String author, String text) {

        this.author = author;
        this.text = text;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }






    @Override
    public String toString() {
        return
                "author: " + author + "\n" +
                "Quote:" + text;
    }



}