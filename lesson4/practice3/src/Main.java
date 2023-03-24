import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Вариант 3, РИБО-05-21, Путенков Иван Олегович");

        ArrayList<Hospital> worker = new ArrayList<>();
        worker.add(new Hospital("Иванов Иван Иванович", "терапевт", 345, 15, true));
        worker.add(new Hospital("Антонов Антон Антонович", "хирург",5, 20, true));
        worker.add(new Hospital("Юрьев Юрий Аристархович", "офтальмолог",65, 10, false));

        Collections.sort(worker);
        System.out.println("Список врачей:");
        for(Hospital h: worker){
            System.out.println(h.getName() + ", " + h.getJob() + ", " + h.getNumber() + ", " + h.getMonth() + ", " + h.isCertification());
        }

        boolean finish = false;
        while (!finish) {
            System.out.println("""
                    1 - добавить данные нового врача
                    2 - изменить флаг о прохождении аттестации""");
            int f = (int) in.nextInt();
            in.nextLine();

            if (f == 1) {
                int fn = 0;
                while (fn == 0) {
                    System.out.println("Введите ФИО:");
                    String n = in.nextLine();
                    System.out.println("Введите специальность:");
                    String j = in.nextLine();
                    System.out.println("Введите порядковый номер:");
                    int num = in.nextInt();
                    if (num <= 0){
                        num = 1;
                    }
                    System.out.println("Введите кол-во рабочих смен в месяц:");
                    int m = in.nextInt();
                    if (m <= 0){
                        m = 10;
                    }
                    System.out.println("Прохождение аттестации:");
                    boolean c = in.nextBoolean();

                    if (worker.size() != 0) {
                        ArrayList<Hospital> copy = new ArrayList<Hospital>(worker);
                        for (Hospital h : copy) {
                            if (Objects.equals(h.getNumber(), num)) {
                                System.out.println("Врач с таким порядковым номером уже есть в списке");
                                in.nextLine();
                                fn = 0;
                                break;
                            } else {
                                fn += 1;
                            }
                        }
                    }

                    if (fn == worker.size() | worker.size() == 0) {
                        worker.add(new Hospital(n, j, num, m, c));
                        fn += 1;
                    }
                }

                System.out.println("Врач добавлен в список:");
                Collections.sort(worker);
                for (Hospital h : worker) {
                    System.out.println(h.getName() + ", " + h.getJob() + ", " + h.getNumber() + ", " + h.getMonth() + ", " + h.isCertification());
                }
                System.out.println("\n");

                System.out.println("""
                        Завершить работу программы?
                        1 - продолжить работу
                        2 - завершить работу""");
                int fin = (int) in.nextInt();
                if (fin == 2) {
                    finish = true;
                }
                System.out.println("\n");
            }

            if (f == 2){
                System.out.println("Введите порядковый номер врача, у которого вы хотите изменить флаг о прохождении аттестации:");
                int num = in.nextInt();
                System.out.println("Введите флаг о прохождении аттестации:");
                boolean c = in.nextBoolean();
                Iterator<Hospital> iter = worker.iterator();
                while (iter.hasNext()){
                    Hospital h = iter.next();
                    if (h.getNumber() == num){
                        h.setCertification(c);
                    }
                }

                System.out.println("Флаг о прохождении аттестации изменён:");
                Collections.sort(worker);
                for (Hospital h : worker) {
                    System.out.println(h.getName() + ", " + h.getJob() + ", " + h.getNumber() + ", " + h.getMonth() + ", " + h.isCertification());
                }
                System.out.println("\n");

                System.out.println("""
                        Завершить работу программы?
                        1 - продолжить работу
                        2 - завершить работу""");
                int fin = (int) in.nextInt();
                if (fin == 2) {
                    finish = true;
                }
                System.out.println("\n");
            }
        }
    }
}