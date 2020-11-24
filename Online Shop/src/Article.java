public class Article {

    private int articleNumber;
    private float price;

    public Article(int articleNumber, float price){
        setArticleNumber(articleNumber);
        setPrice(price);
    }

    public float getPrice(){
        return price;
    }

    public void setArticleNumber(int articleNumber) {
        if (articleNumber == 0) return;
        this.articleNumber = articleNumber;
    }

    public void setPrice(float price) {
        if (price == 0) return;
        this.price = price;
    }
}
