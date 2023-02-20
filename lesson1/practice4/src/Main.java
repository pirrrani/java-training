import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вариант 4, РИБО-05-21, Путенков Иван Олегович");
        System.out.print("Введите длительность вклада в месяцах:");
        int m = (int)in.nextInt();
        System.out.print("Введите месячный процент по вкладу:");
        float p = (float)in.nextFloat();
        System.out.print("Введите начальную сумму:");
        int s = (int)in.nextInt();
        System.out.println();

        float D = s * p / 100;
        System.out.println("Доход в месяц:" + D);
        int i = 0;
        while(i < m){
            s += D;
            i += 1;
        }
        System.out.print("Итоговая сумма:" + s);
    }
}