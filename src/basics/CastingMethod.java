package basics;

public class CastingMethod {

    public static void main(String[] args) {

        double price = 100.00;
        double finalPrice = price + 18;  // Implicit casting

        System.out.println(finalPrice);

        int p = 100;
        int fp = p + (int) 18.15; // Explicit CAsting
        System.out.println(fp);
    }
}
