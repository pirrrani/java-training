import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вариант 2, РИБО-05-21, Путенков Иван Олегович");
        System.out.print("Введите длительность вклада в месяцах:");
        int m = (int)in.nextInt();
        System.out.print("Введите годовой процент по вкладу:");
        float p = (float)in.nextFloat();
        System.out.print("Введите начальную сумму:");
        int s = (int)in.nextInt();
        System.out.println();

        float D = s * p / 100;
        System.out.println("Доход в месяц:" + D);
        for(int i = 0; i < m; i++){
            s += D;
        }
        System.out.print("Итоговая сумма:" + s);
    }
}