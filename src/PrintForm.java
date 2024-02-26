import java.util.Locale;

public class PrintForm {
    public static void main(String[] args) {

        String product1= "computer";
        String product2= "office desk";
        int age = 30;
        int code= 5290;
        char gender= 'F';
        double price1= 2100.0;
        double price2= 650.50;
        double measure= 53.234567;

        System.out.println("Products:");

        System.out.print(product1 + ",Which price is $");
        System.out.printf("%.2f%n", price1);

        System.out.print(product2 + ",Which price is $");
        System.out.printf("%.2f%n", price2);

        System.out.println();

        System.out.println("Record:" + age + " years old, code " + code + " and gender: " + gender);

        System.out.println();

        System.out.print("Measure with eight decimal places: ");
        System.out.printf("%.8f%n",measure);

        System.out.print("Rounded(three decimal places): ");
        System.out.printf("%.3f%n",measure);

        Locale.setDefault(Locale.US);
        System.out.print("US decimal places: ");
        System.out.printf("%.3f%n",measure);

    }
}
