package quotes;




public class Quote {


   private String author;
    private   String text;
    private String quoteAuthor;

    public String getQuoteAuthor() {
        return quoteAuthor;
    }

    public void setQuoteAuthor(String quoteAuthor) {
        this.quoteAuthor = quoteAuthor;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    private   String quoteText;


    public Quote( String author1, String text1) {

        this.quoteAuthor = author1;
        this.quoteText = text1;
    }




    public Quote( String author, String text, String random) {

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


    public String toStringTwo() {
        return
                "author: " + quoteAuthor + "\n" +
                        "Quote:" + quoteText;
    }


}
