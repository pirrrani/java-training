import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Вариант 4, РИБО-05-21, Путенков Иван Олегович" + "\n");

        ArrayList<Passport> passports = new ArrayList<>();
        passports.add(new Passport("Задорнов Андрей Антонович", 445566,"сантехник", false));
        passports.add(new Passport("Ромов Иван Иванович", 112134,"директор", true));
        passports.add(new Passport("Вуйчич Юлия Аристарховна", 306306,"секретарь", false));
        passports.add(new Passport("Колобков Генадий Богданович", 333475,"уборщик", false));
        passports.add(new Passport("Иванов Владимир Владимирович", 767501,"охранник", true));

        Collections.sort(passports, Passport.PersonsNameComparator);
        System.out.println("Список сотрудников (сортировка по имени):");
        for(Passport p: passports){
            System.out.println(p.getName() + ", " + p.getNumber() + ", " + p.getJob() + ", " + p.isAccess());
        }
        System.out.println("\n");
        Collections.sort(passports, Passport.PersonsNumber);
        System.out.println("Список сотрудников (сортировка по номеру пропуска):");
        for(Passport p: passports){
            System.out.println(p.getName() + ", " + p.getNumber() + ", " + p.getJob() + ", " + p.isAccess());
        }

        boolean finish = false;
        while (!finish) {
            System.out.println("-----Добавление нового сотрудника-----");
            in.nextLine();
            int fn = 0; boolean k = false;
            while (fn == 0) {
                System.out.println("Введите ФИО:");
                String n = in.nextLine();
                System.out.println("Введите номер пропуска:");
                int num = Integer.parseInt(in.nextLine());
                System.out.println("Введите специальность:");
                String j = in.nextLine();
                System.out.println("Доступ разрешён/запрещён:");
                boolean a = in.nextBoolean();

                if (passports.size() != 0) {
                    ArrayList<Passport> copy = new ArrayList<Passport>(passports);
                    for (Passport p1 : copy) {
                        if (p1.getNumber() == num & Objects.equals(p1.getName(), n)) {
                            System.out.println("Сотрудник с таким ФИО и номером уже есть в списке. Введите данные заново!");
                            fn = 0;
                            break;
                        } else {
                            if (p1.getNumber() != num & !Objects.equals(p1.getName(), n)) {
                                fn += 1;
                            }
                        }
                        if (p1.getNumber() == num & !Objects.equals(p1.getName(), n)){
                            fn += 1;
                            Iterator<Passport> iter = passports.iterator();
                            while (iter.hasNext()) {
                                Passport p2 = iter.next();
                                if (Objects.equals(p2.getNumber(), num)) {
                                    iter.remove();
                                    k = true;
                                }
                            }
                        }
                    }
                }

                if (fn == passports.size() | k == true) {
                    passports.add(new Passport(n, num, j, a));
                    fn += 1;
                }

                Collections.sort(passports, Passport.PersonsNameComparator);
                System.out.println("Список сотрудников (сортировка по имени):");
                for(Passport p: passports){
                    System.out.println(p.getName() + ", " + p.getNumber() + ", " + p.getJob() + ", " + p.isAccess());
                }
                System.out.println("\n");
                Collections.sort(passports, Passport.PersonsNumber);
                System.out.println("Список сотрудников (сортировка по номеру пропуска):");
                for(Passport p: passports){
                    System.out.println(p.getName() + ", " + p.getNumber() + ", " + p.getJob() + ", " + p.isAccess());
                }
            }

            System.out.println("""
                        Завершить работу программы?
                        1 - продолжить работу
                        2 - завершить работу""");
            int fin = (int)in.nextInt();
            if (fin == 2){
                finish = true;
            }
            System.out.println("\n");
        }
    }
}