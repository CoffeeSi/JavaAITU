package Assignment_3_3.Task7;

public class Programmer {
    private int salary = 1000;

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary > this.salary ? salary : this.salary;
    }
}
