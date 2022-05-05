public class Manga implements Book{

    long bookId;

    int price;

    public long getBookId() {
        return bookId;
    }

    public int getPrice() {
        return price;
    }

    public Manga(long bookId, int price) {
        this.bookId = bookId;
        this.price = price;
    }

    @Override
    public String accept(Coupon coupon) {
        return  coupon.discount(this);

    }
}
