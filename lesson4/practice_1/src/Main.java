import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<Car> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota", 2010, "с888тн"));
        vehicles.add(new Car("Lada", 2003, "м736он"));
        vehicles.add(new Car("Mitsubishi", 2013, "к388ар"));

        System.out.println("Список машин:");
        for(Car c: vehicles){
            System.out.println(c.getMarka() + ", " + c.getYear() + ", " + c.getNumber());
        }

        boolean finish = false;
        while (!finish) {
            System.out.println("""
                    1 - добавить новый автомобиль в список
                    2 - удаление автомобиля по его номеру
                    3 - удаление всех автомобилей из списка""" + "\n");
            int f = Integer.parseInt(in.nextLine());

            if (f == 1) {
                int fn = 0;
                while (fn == 0) {
                    System.out.println("Введите название марки автомобиля:");
                    String m = in.nextLine();
                    System.out.println("Введите год выпуска:");
                    int y = Integer.parseInt(in.nextLine());
                    System.out.println("Введите номер:");
                    String n = in.nextLine();

                    if (vehicles.size() != 0) {
                        ArrayList<Car> copy = new ArrayList<Car>(vehicles);
                        for (Car c : copy) {
                            if (Objects.equals(c.getNumber(), n)) {
                                System.out.println("Машина с таким номером уже есть в списке. Введите данные заново!");
                                fn = 0;
                                break;
                            } else {
                                fn += 1;
                            }
                        }
                    }

                    if (fn == vehicles.size() | vehicles.size() == 0){
                        vehicles.add(new Car(m, y, n));
                        fn += 1;
                    }
                }

                System.out.println("Машина добавлена в список:");
                for (Car c : vehicles) {
                    System.out.println(c.getMarka() + ", " + c.getYear() + ", " + c.getNumber());
                }
                System.out.println("\n");

                System.out.println("""
                        Завершить работу программы?
                        1 - продолжить работу
                        2 - завершить работу""");
                int fin = Integer.parseInt(in.nextLine());
                if (fin == 2){
                    finish = true;
                }
                System.out.println("\n");
            }

            if (f == 2) {
                System.out.println("Введите номер:");
                String n = in.nextLine();
                Iterator<Car> iter = vehicles.iterator();
                while (iter.hasNext()) {
                    Car c = iter.next();
                    if (Objects.equals(c.getNumber(), n)) {
                        iter.remove();
                    }
                }
                System.out.println("Машина удалена из списка:");
                for (Car c : vehicles) {
                    System.out.println(c.getMarka() + ", " + c.getYear() + ", " + c.getNumber());
                }
                System.out.println("\n");

                System.out.println("""
                        Завершить работу программы?
                        1 - продолжить работу
                        2 - завершить работу""");
                int fin = Integer.parseInt(in.nextLine());
                if (fin == 2){
                    finish = true;
                }
                System.out.println("\n");
            }

            if (f == 3){
                Iterator<Car> iter = vehicles.iterator();
                while (iter.hasNext()) {
                    Car c = iter.next();
                    iter.remove();
                }
                System.out.println("Все машины удалены из списка");
                System.out.println("\n");

                System.out.println("""
                        Завершить работу программы?
                        1 - продолжить работу
                        2 - завершить работу""");
                int fin = Integer.parseInt(in.nextLine());
                if (fin == 2){
                    finish = true;
                }
                System.out.println("\n");
            }
        }
    }
}