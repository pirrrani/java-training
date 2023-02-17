import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вычисление площади и периметра прямоугольника.");
        System.out.print("Введите сторону 'a' прямоугольника:");
        float a = in.nextInt();
        System.out.print("Введите сторону 'b' прямоугольника:");
        float b = in.nextInt();
        float S, P;
        S = a * b;
        P = 2 * (a + b);
        System.out.println("Площадь прямоугольника: " + S);
        System.out.println("Периметр прямоугольника: " + P);
        System.out.println();

        System.out.println("Вычисление площади и периметра треугольника.");
        System.out.print("Введите сторону 'a' треугольника:");
        a = in.nextInt();
        System.out.print("Введите сторону 'b' треугольника:");
        b = in.nextInt();
        System.out.print("Введите сторону 'c' треугольника:");
        float c = in.nextInt();
        float Pp;
        double Sq;
        Pp = (a + b + c) / 2;
        Sq = Pp * (Pp - a) * (Pp - b) * (Pp - c);
        System.out.println("Площадь треугольника: " + Math.sqrt(Sq));
        P = a + b + c;
        System.out.println("Периметр треугольника: " + P);
    }
}