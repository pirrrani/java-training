import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Вариант 2, РИБО-05-21, Путенков Иван Олегович");

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Panasonic", "X252325ZMD","white", false));
        phones.add(new Phone("Samsung S10", "XYZ123456789","black", true));
        phones.add(new Phone("Iphone X", "ASIOS77777QWRT","red", true));

        System.out.println("Список телефонов:");
        for(Phone p: phones){
            System.out.println(p.getModel() + ", " + p.getNumber() + ", " + p.getColor() + ", " + p.isType());
        }

        boolean finish = false;
        while (!finish) {
            System.out.println("""
                    1 - добавить новый телефон в список
                    2 - удаление телефона по его серийному номеру
                    3 - удаление всех телефонов из списка""" + "\n");
            int f = (int)in.nextInt();
            in.nextLine();

            if (f == 1) {
                int fn = 0;
                while (fn == 0) {
                    System.out.println("Введите название телефона:");
                    String m = in.nextLine();
                    System.out.println("Введите серийный номер:");
                    String n = in.nextLine();
                    System.out.println("Введите цвет:");
                    String c = in.nextLine();
                    System.out.println("Телефон мобильный или нет:");
                    boolean b = in.nextBoolean();

                    if (phones.size() != 0) {
                        ArrayList<Phone> copy = new ArrayList<Phone>(phones);
                        for (Phone p : copy) {
                            if (Objects.equals(p.getNumber(), n)) {
                                System.out.println("Телефон с таким номером уже есть в списке. Введите данные заново!");
                                fn = 0;
                                break;
                            } else {
                                fn += 1;
                            }
                        }
                    }

                    if (fn == phones.size() | phones.size() == 0) {
                        phones.add(new Phone(m, n, c, b));
                        fn += 1;
                    }
                }

                System.out.println("Телефон добавлен в список:");
                for (Phone p : phones) {
                    System.out.println(p.getModel() + ", " + p.getNumber() + ", " + p.getColor() + ", " + p.isType());
                }
                System.out.println("\n");

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

            if (f == 2) {
                System.out.println("Введите номер:");
                String n = in.nextLine();
                Iterator<Phone> iter = phones.iterator();
                while (iter.hasNext()) {
                    Phone p = iter.next();
                    if (Objects.equals(p.getNumber(), n)) {
                        iter.remove();
                    }
                }
                System.out.println("Телефон удалён из списка:");
                for (Phone p : phones) {
                    System.out.println(p.getModel() + ", " + p.getNumber() + ", " + p.getColor() + ", " + p.isType());
                }
                System.out.println("\n");

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

            if (f == 3){
                Iterator<Phone> iter = phones.iterator();
                while (iter.hasNext()) {
                    Phone p = iter.next();
                    iter.remove();
                }
                System.out.println("Все телефоны удалены из списка");
                System.out.println("\n");

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
}
