package telephone;
import telephone.Current_state;
import telephone.Dimensions;
import telephone.System_t;
import telephone.Screen;
import telephone.General_data;
import java.util.Scanner;

public class Telephone {
    Current_state current_state;
    Dimensions dimensions;
    System_t system_t;
    Screen screen;
    General_data general_data;
    Scanner in = new Scanner(System.in);
    public Telephone(Current_state current_state, Dimensions dimensions, System_t system_t, Screen screen, General_data general_data){
        this.current_state = current_state;
        this.dimensions = dimensions;
        this.system_t = system_t;
        this.screen = screen;
        this.general_data = general_data;
    }
    public Telephone(Current_state current_state){
        this.current_state = current_state;
    }
    public Telephone(){

    }
    public void read(Scanner in){
        current_state.read(in);
        dimensions.read(in);
        system_t.read(in);
        screen.read(in);
        general_data.read(in);
    }
    public void display(){
        current_state.display();
        dimensions.display();
        system_t.display();
        screen.display();
        general_data.display();
    }
    public void zaryad() {
        int p = 0, charge1 = 0;
        while (p == 0) {
            p = 1;
            System.out.print("Сколько стало процентов заряда на телефоне?");
            charge1 = in.nextInt();
            try {
                if (current_state.getCharge() < 0)
                    throw new Exception("Процент заряда меньше 0");
                if (current_state.getCharge() > 100)
                    throw new Exception("Процент заряда больше 100");
            }
            catch (Exception e) {
                p = 0;
                System.out.println(e+"Попробуйте ввести информацию заново");
            }
        }
        current_state.setCharge(charge1);
    }
    public void change(){
        int p = 0, i = 0, j = 0, k = 0;
        int memory1 = current_state.getMemory();
        String card1 = system_t.getCard();
        while (p == 0) {
            p = 1;
            System.out.println("Изменения с объемом памяти связаны с:");
            System.out.println("1.Изменением состояния карты памяти");
            System.out.println("2.Изменением объема информации");
            i = in.nextInt();
            try {
                if (i < 1)
                    throw new Exception("Неправильные данные");
                if (i > 2)
                    throw new Exception("Неправильные данные");
            } catch (Exception e) {
                p = 0;
                System.out.println(e + "Попробуйте выбрать действие заново");
            }
        }
        if (i == 1) {
            p = 0;
            while (p == 0) {
                p = 1;
                System.out.println("1.Карту памяти ставят в телефон");
                System.out.println("2.Карту памяти убирают из телефона");
                j = in.nextInt();
                try {
                    if (j < 1)
                        throw new Exception("Неправильные данные");
                    if (j > 2)
                        throw new Exception("Неправильные данные");
                } catch (Exception e) {
                    p = 0;
                    System.out.println("Попробуйте выбрать действие заново");
                }
            }
            p = 0;
            while (p == 0) {
                p = 1;
                System.out.print("Какой объем памяти у карты?");
                k = in.nextInt();
                try {
                    if (k < 0)
                        throw new Exception("Неправильные данные");
                    ;
                } catch (Exception e) {
                    p = 0;
                    System.out.println(e + "Попробуйте ввести информацию заново");
                }
            }
            if (j == 1) {
                if (card1.equals("no")==true) {
                    memory1 += k;
                    current_state.setMemory(memory1);
                    system_t.setCard("yes");
                }
                else
                    System.out.println("Карта или уже находится в телефоне, или информация о ней неверна");
            }
            if (j == 2) {
                if (card1.equals("yes")==true) {
                    memory1 -= k;
                    current_state.setMemory(memory1);
                    system_t.setCard("no");
                }
                else
                    System.out.println("Карты или нет в телефоне, или информация о ней неверна");
            }
        }
        if (i == 2) {
            p = 0;
            while (p == 0) {
                p = 1;
                System.out.println("1.В телефон добавляют информацию");
                System.out.println("2.Из телефона удаляют информацию");
                j = in.nextInt();
                try {
                    if (j < 1)
                        throw new Exception("Неправильные данные");
                    if (j > 2)
                        throw new Exception("Неправильные данные");
                } catch (Exception e) {
                    p = 0;
                    System.out.println("Попробуйте выбрать действие заново");
                }
            }
            p = 0;
            while (p == 0) {
                p = 1;
                System.out.print("Какой объем памяти добавили или удалили?");
                k = in.nextInt();
                try {
                    if (k < 0)
                        throw new Exception("Неправильные данные");
                } catch (Exception e) {
                    p = 0;
                    System.out.println("Попробуйте ввести информацию заново");
                }
            }
            if (j == 1) {
                memory1 -= k;
                current_state.setMemory(memory1);
            }
            if (j == 2) {
                memory1 += k;
                current_state.setMemory(memory1);
            }
        }
    }
}
