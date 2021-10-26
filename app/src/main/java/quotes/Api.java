package quotes;

public class Api {

    private String quoteAuthor;
    private String quoteText;

    public Api(String quoteAuthor, String quoteText) {
        this.quoteAuthor = quoteAuthor;
        this.quoteText = quoteText;
    }


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

    public String toString() {
        return
                "author: " + quoteAuthor + "\n" +
                        "Quote:" + quoteText;
    }
}
