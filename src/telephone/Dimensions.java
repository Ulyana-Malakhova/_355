package telephone;
import java.util.Scanner;

public class Dimensions {
    Scanner in = new Scanner(System.in);
    private int width;
    private int height;
    private int thickness;
    private int weight;
    public Dimensions(int width, int height, int thickness, int weight){
        this.width = width;
        this.height = height;
        this.thickness = thickness;
        this.weight = weight;
    }
    public Dimensions(int weight){
        this.weight = weight;
        this.thickness = 0;
        this.height = 0;
        this.width = 0;
    }
    public Dimensions(){
        this.weight = 0;
        this.thickness = 0;
        this.height = 0;
        this.width = 0;
    }
    public void read(Scanner in){
        System.out.println("Введем информацию о параметрах телефона");
        int p = 0;
        while (p == 0) {
            p = 1;
            System.out.print("Ширина(мм): ");
            this.width = in.nextInt();
            try {
                if (width < 40)
                    throw new Exception("Неправильные данные.");
            } catch (Exception e) {
                p = 0;
                System.out.println(e + "Попробуйте ввести информацию заново");
            }
        }
        p = 0;
        while (p == 0) {
            p = 1;
            System.out.print("Высота(мм): ");
            this.height = in.nextInt();
            try {
                if (height < 90)
                    throw new Exception("Неправильные данные.");
            } catch (Exception e) {
                p = 0;
                System.out.println(e + "Попробуйте ввести информацию заново");
            }
        }
        p = 0;
        while (p == 0) {
            p = 1;
            System.out.print("Толщина(мм): ");
            this.thickness = in.nextInt();
            try {
                if (thickness < 7)
                    throw new Exception("Неправильные данные.");
            } catch (Exception e) {
                p = 0;
                System.out.println("Попробуйте ввести информацию заново");
            }
        }
        p = 0;
        while (p == 0) {
            p = 1;
            System.out.print("Вес(в граммах): ");
            this.weight = in.nextInt();
            try {
                if (weight < 32)
                    throw new Exception("Неправильные данные.");
            }
            catch (Exception e) {
                p = 0;
                System.out.println(e+"Попробуйте ввести информацию заново");
            }
        }
    }
    public void display(){
        System.out.println("Параметры:");
        System.out.println("-ширина:"+ width);
        System.out.println("-высота:"+ height);
        System.out.println("-толщина:"+ thickness);
        System.out.println("-вес:"+ weight);
    }
}
