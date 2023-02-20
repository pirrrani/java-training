import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вариант 5, РИБО-05-21, Путенков Иван Олегович");
        System.out.print("Введите порядковый номер дня недели:");
        int n = in.nextInt();
        if (n > 7){
            System.out.print("Некорректный порядковый номер.");
            System.exit(0);
        }
        switch(n){
            case 1, 2, 3, 4:
                System.out.print("Продолжительность работы в секундах:" + (8 * 3600));
                break;
            case 6, 7:
                System.out.print("Выходной!");
                break;
            case 5:
                System.out.print("Продолжительность работы в секундах:" + (6 * 3600));
                break;
        }
    }
}