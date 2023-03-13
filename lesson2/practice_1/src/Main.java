import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Вариант 1, РИБО-05-21, Путенков Иван Олегович");

        System.out.println("Легковая машина(1)/Грузовая машина(2):");
        int f = Integer.parseInt(in.nextLine());
        System.out.println("Введите название машины:");
        String b = in.nextLine();
        in.nextLine();
        System.out.println("Введите год выпуска:");
        int y = in.nextInt();
        System.out.println("Введите цену:");
        int p = in.nextInt();
        System.out.println("Введите скорость:");
        int s = in.nextInt();

        if (f == 1) {
            System.out.println("Введите количество пассажирских мест:");
            int n = in.nextInt();
            in.nextLine();
            System.out.println("Наличие детского сидения(Есть/Нет):");
            String child_seat = in.nextLine();
            Light vehicle = new Light(b, y, p, s, n, child_seat);
            vehicle.setBrand(b);
            vehicle.setYear(y);
            vehicle.setPrice(p);
            vehicle.setSpeed(s);
            System.out.println(vehicle.toString());
        }

        if (f == 2) {
            System.out.println("Наличие спального места(Есть/Нет):");
            in.nextLine();
            String sl_place = in.nextLine();
            Heavy vehicle = new Heavy(b, y, p, s, sl_place);
            vehicle.setBrand(b);
            vehicle.setYear(y);
            vehicle.setPrice(p);
            vehicle.setSpeed(s);
            System.out.println(vehicle.toString());
        }
    }
}