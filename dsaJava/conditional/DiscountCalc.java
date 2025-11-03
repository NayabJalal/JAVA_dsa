package conditional;
//Calculate Discount Of Product
public class DiscountCalc {
    public static void main(String[] args) {
        System.out.println("The Discount of the product as per Original Price = "+ discountCalculator(1000,4));

    }
    static double discountCalculator(int price,  double discount){
        return (double)price - (price * (discount/100));
    }
}
