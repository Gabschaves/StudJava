import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        double width,length,pricePerMeter,finalPrice,area;

        System.out.println("Put the value of width:");
        width= sc.nextDouble();
        System.out.println("Put the value of length:");
        length=sc.nextDouble();
        area= width * length;
        System.out.println("Put the value of Price per meter:");
        pricePerMeter=sc.nextDouble();
        finalPrice= pricePerMeter * area;
        System.out.printf("Area= %.2f%n",area);
        System.out.printf("Value= %.2f%n",finalPrice);

        sc.close();
    }
}
