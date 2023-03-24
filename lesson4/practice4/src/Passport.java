import java.util.Comparator;

public class Passport implements Comparable<Passport>{
    private String name;
    private int number;
    private String job;
    private boolean access;

    public Passport(String name, int number, String job, boolean access) {
        this.name = name;
        this.number = number;
        this.job = job;
        this.access = access;
    }

    public static Comparator<Passport> PersonsNameComparator = new Comparator<Passport>(){
        public int compare(Passport p1, Passport p2){
            String Persname1 = p1.getName().toUpperCase();
            String Persname2 = p2.getName().toUpperCase();
            return Persname1.compareTo(Persname2);
        }
    };

    public static Comparator<Passport> PersonsNumber = new Comparator<Passport>(){
        public int compare(Passport p1, Passport p2){
            int num1 = p1.getNumber();
            int num2 = p2.getNumber();
            return num1 - num2;
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    @Override
    public int compareTo(Passport o) {
        return 0;
    }
}
