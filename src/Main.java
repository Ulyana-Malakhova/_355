import telephone.Current_state;
import telephone.Dimensions;
import telephone.System_t;
import telephone.Screen;
import telephone.General_data;
import telephone.Telephone;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Current_state current_state = new Current_state(0, 0, "internet");
        Dimensions dimensions = new Dimensions(0, 0, 0, 0);
        System_t system_t = new System_t("opersystem", 0, "card");
        Screen screen = new Screen(0, "pixel");
        General_data general_data = new General_data("country", "model", 0);
        int object = 0, c, d = 0, p, i;
        System.out.println("Вы хотите работать 1 - с одномерным массивом, 2 - с двумерным массивом, 3 - с одним объектом");
        object = in.nextInt();
        if (object == 1) {
            Telephone spisok1[] = new Telephone[2];
            for (i = 0; i < 2; i++) {
                spisok1[i] = new Telephone(current_state, dimensions, system_t, screen, general_data);
                spisok1[i].read(in);
                spisok1[i].display();
            }
            int ext = 0, w = 0;
            while (ext == 0) {
                System.out.println("Выберите с каким объектом хотите работать");
                w = in.nextInt();
                w--;
                System.out.println("Выберите действие, которое хотите совершить:");
                System.out.println("1.Вывод информации");
                System.out.println("2.Зарядить телефон");
                System.out.println("3.Изменить данные памяти");
                System.out.println("4.Ввод новых данных");
                System.out.println("5.Выход");
                d = in.nextInt();
                if (d == 1)
                    spisok1[w].display();
                if (d == 2) {
                    spisok1[w].zaryad();
                }
                if (d == 3)
                    spisok1[w].change();
                if (d == 4) {
                    spisok1[w].read(in);
                    spisok1[w].display();
                }
                if (d == 5) {
                    System.out.print("Вы действительно хотите выйти? (1-Да,2-Нет):");
                    p = in.nextInt();
                    if (p == 1)
                        System.exit(0);
                }
            }
        }
        if (object == 2) {
            int j, k, g;
            Telephone[][] spisok2 = new Telephone[2][2];
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    spisok2[i][j] = new Telephone(current_state, dimensions, system_t, screen, general_data);
                    spisok2[i][j].read(in);
                    spisok2[i][j].display();
                }
            }
            int ext = 0;
            while (ext == 0) {
                System.out.println("Выберите с каким объектом хотите работать");
                i = in.nextInt();
                i--;
                k = i / 2;
                if (k == 1)
                    i = i - 2;
                j = i % 2;
                System.out.println("Выберите действие, которое хотите совершить:");
                System.out.println("1.Вывод информации");
                System.out.println("2.Зарядить телефон");
                System.out.println("3.Изменить данные памяти");
                System.out.println("4.Ввод новых данных");
                System.out.println("5.Выход");
                d = in.nextInt();
                if (d == 1)
                    spisok2[i][j].display();
                if (d == 2) {
                    spisok2[i][j].zaryad();
                }
                if (d == 3)
                    spisok2[i][j].change();
                if (d == 4) {
                    spisok2[i][j].read(in);
                    spisok2[i][j].display();
                }
                if (d == 5) {
                    System.out.print("Вы действительно хотите выйти? (1-Да,2-Нет):");
                    p = in.nextInt();
                    if (p == 1)
                        System.exit(0);
                }
            }
        }
        if (object == 3) {
            Telephone spisok = new Telephone(current_state, dimensions, system_t, screen, general_data);
            spisok.read(in);
            spisok.display();
            int ext = 0;
            while (ext == 0) {
                System.out.println("Выберите действие, которое хотите совершить:");
                System.out.println("1.Вывод информации");
                System.out.println("2.Зарядить телефон");
                System.out.println("3.Изменить данные памяти");
                System.out.println("4.Ввод новых данных");
                System.out.println("5.Выход");
                d = in.nextInt();
                if (d == 1)
                    spisok.display();
                if (d == 2) {
                    spisok.zaryad();
                }
                if (d == 3)
                    spisok.change();
                if (d == 4) {
                    spisok.read(in);
                    spisok.display();
                }
                if (d == 5) {
                    System.out.print("Вы действительно хотите выйти? (1-Да,2-Нет):");
                    p = in.nextInt();
                    if (p == 1)
                        System.exit(0);
                }
            }
        }
    }
}


