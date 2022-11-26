//2. Вывести все простые числа от 1 до 1000
package HomeWork;


public class HW01_EX02 {
    public static void main(String[] args) {
        int hilim = 100;
        //известно, что 2 - простое, оно исключение из метода,
        //поэтому выведем вручную:
        System.out.println("2");
        for (int i = 2; i <= hilim; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    break;
                }
                if (j == i-1) {
                    System.out.println(i);
                }
            }
        }
            
    }
}
