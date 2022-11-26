// 1. Вычислить n-ое треугольного число
//    (сумма чисел от 1 до n)
package HomeWork;
import java.util.Scanner;


public class HW01_EX01{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int hilim = 0;
        boolean input_ok = false;
        while (input_ok == false){
            System.out.printf("Введите целое число: ");
            String input = scan.nextLine();
            try{
                hilim = Integer.parseInt(input);
                input_ok = true;
                } catch (Exception e) {
                    System.out.println("Ошибка ввода, попробуйте еще раз");
                }
        }
        scan.close();

        int result = 0;
        result = (int) triangle_num(hilim);
        System.out.printf("Результат: %d", result);
    }


    static double triangle_num(int n) {
        if(n==1)return 1;
        return n + triangle_num(n-1);
    }
}
