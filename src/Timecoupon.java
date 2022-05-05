public class Timecoupon implements Coupon{

    public String sale(Book... arg){
        StringBuilder sb = new StringBuilder();

        for (Book book: arg) {
            sb.append(book.accept(this));

        }

    }


    @Override
    public String discount(Book book) {
        
    }
}
