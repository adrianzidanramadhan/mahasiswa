public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super();
        setName(name);
        setSalary(salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bonus: " + bonus);
    }
}
