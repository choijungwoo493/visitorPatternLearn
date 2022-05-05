public class Nobel implements Book{

    long BookId;
    int price;

    public Nobel(long bookId, int price) {
        BookId = bookId;
        this.price = price;
    }

    public long getBookId() {
        return BookId;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String accept(Coupon coupon) {
        return coupon.discount(this);
    }
}
