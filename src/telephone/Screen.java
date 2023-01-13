package telephone;
import java.util.Scanner;

public class Screen {
    Scanner in = new Scanner(System.in);
    private double diagonal;
    private String pixel;
    public Screen(double diagonal, String pixel){
        this.diagonal = diagonal;
        this.pixel = pixel;
    }
    public Screen(double diagonal){
        this.diagonal = diagonal;
        this.pixel = "pixel";
    }
    public Screen(){
        this.diagonal=0;
        this.pixel = "pixel";
    }
    public void read(Scanner in){
        System.out.println("Введем информацию об экране");
        int p = 0;
        while (p == 0) {
            p = 1;
            System.out.print("Диагональ(дюйм): ");
            this.diagonal = in.nextDouble();
            try {
                if (diagonal < 0)
                    throw new Exception("Неправильные данные.");
            } catch (Exception e) {
                p = 0;
                System.out.println(e + "Попробуйте ввести информацию заново");
            }
        }
        System.out.print("Плотность пикселей(ppi): ");
        this.pixel=in.next();
    }
    public void display(){
        System.out.println("Информация об экране:");
        System.out.println("-диагональ:"+ diagonal);
        System.out.println("-плотность пикселей:"+ pixel);
    }
}
