package telephone;
import java.util.Scanner;

public class General_data {
    Scanner in = new Scanner(System.in);
    private String country;
    private String model;
    private int year;
    public General_data(String country, String model, int year){
        this.country = country;
        this.model = model;
        this.year = year;
    }
    public General_data(String model){
        this.model = model;
        this.country = "country";
        this.year = 0;
    }
    public General_data(){
        this.model="model";
        this.country = "country";
        this.year = 0;
    }
    public void read(Scanner in){
        int p = 0;
        System.out.println("Введем информацию об общих данных");
        System.out.print("Страна-производитель: ");
        this.country=in.next();
        System.out.print("Модель: ");
        this.model=in.next();
        while (p == 0) {
            p = 1;
            System.out.print("Год выпуска: ");
            this.year = in.nextInt();
            try {
                if (year < 1876)
                    throw new Exception("Неверная информация, в этом году еще не было телефонов.");
                if (year > 2023)
                    throw new Exception("Неверная информация, этот год еще не наступил.");
            } catch (Exception e) {
                p = 0;
                System.out.println(e + "Попробуйте ввести информацию заново");
            }
        }
    }
    public void display(){
        System.out.println("Общие данные:");
        System.out.println("-страна-производитель:"+ country);
        System.out.println("-модель:"+ model);
        System.out.println("-год выпуска:"+ year);
    }
}
