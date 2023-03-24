public class Hospital implements Comparable<Hospital>{
    private String name;
    private String job;
    private int number; //положительное
    private int month; //положительное
    private boolean certification;

    public Hospital(String name, String job, int number, int month, boolean certification) {
        this.name = name;
        this.job = job;
        this.number = number;
        this.month = month;
        this.certification = certification;
    }

    public int compareTo(Hospital o){
        return name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
            this.month = month;
    }

    public boolean isCertification() {
        return certification;
    }

    public void setCertification(boolean certification) {
        this.certification = certification;
    }
}
