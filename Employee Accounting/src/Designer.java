public class Designer extends Employee {
    private int workedDays;
    private double rate;

    Designer(int id, String name, int age, int salary, String gender, double rate, int workedDays) {
        super(id, name, age, salary, gender);
        this.rate = rate;
        this.workedDays = workedDays;
    }

    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }

    public int getWorkedDays() {
        return workedDays;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public double salary() {
        return super.salary() + rate * workedDays;
    }

    @Override
    public String toString() {
        return super.toString() + ", position: designer, worked days in this month: " + workedDays + ", rate per day: " + rate;
    }
}