import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите начальное значение (значение должно быть трёхзначным):");
        String s = in.next();
        System.out.print("Введите конечное значение (значение должно быть трёхзначным):");
        String f = in.next();
        int length = s.length();
        if (length != 3){
            System.out.print("Начальное значение не является трёхзначным.");
            System.exit(0);
        }
        length = f.length();
        if (length != 3){
            System.out.print("Конечное значение не является трёхзначным.");
            System.exit(0);
        }
        System.out.println();

        int si = Integer.parseInt(s);
        int fi = Integer.parseInt(f);
        String resnch = "";
        String resch = "";
        for(int i = si; i <= fi; i++){
            if (i % 2 == 0){
                resch += i;
                if ((i != fi) & (i != fi - 1)){
                    resch += "," + " ";
                }
            } else{
                resnch += i;
                if ((i != fi) & (i != fi - 1)){
                    resnch += "," + " ";
                }
            }
        }

        System.out.println("Чётные числа:" + resch);
        System.out.println("Нечётные числа:" + resnch);
    }
}