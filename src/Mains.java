import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {

        Rectanger rectanger = new Rectanger();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập chiều rộng: ");
        double height = Double.parseDouble(sc.nextLine());
        rectanger.setWidth(width);
        rectanger.setHeight(height);
        System.out.println(rectanger.display());
        System.out.println("Area: " + rectanger.getArea());

    }
}
