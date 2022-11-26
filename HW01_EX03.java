//Реализовать простой калькулятор
package HomeWork;
import java.util.Scanner;


public class HW01_EX03 {
    public static void main(String[] args) {
        //Scanner in_3 = new Scanner(System.in);
        System.out.print("Выберите тип операции. 1 - сложение. 2 - вычитание. 3 - умножение. 4 - деление. \n");
        //double oper = in_3.nextInt();
        double oper = double_int();

        Scanner in_1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num_1 = in_1.nextInt();

        Scanner in_2 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        double num_2 = in_2.nextInt();

        double result = 0;

        if (oper == 1) {
            result = num_1 + num_2;
            printed(result);
        }
        if (oper == 2) {
            result = num_1 - num_2;
            printed(result);
        }
        if (oper == 3) {
            result = num_1 * num_2;
            printed(result);
        }
        if (oper == 4) {
            result = num_1 / num_2;
            printed(result);
        }
        else {
            System.out.println("Некорректный выбор типа операции");
        }
    }
    
    public static void printed(double result) {
        System.out.print("Результат равен: ");
        System.out.println(result);
    }


    static double double_int() {
        Scanner get_value = new Scanner(System.in);
        int input_value = 0;
        boolean input_ok = false;
        while (input_ok != true) {
            System.out.printf("Введите целое число: ");
            String input = get_value.nextLine();
            try{
                input_value = (int) Double.parseDouble(input);
                input_ok = true;
                } catch (Exception e) {
                    System.out.println("Ошибка ввода, попробуйте еще раз");
                }
        }
        get_value.close();
        return input_value;
    }
}
