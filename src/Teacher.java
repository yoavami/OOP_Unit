public class Teacher extends Person
{
    private double salary;

    public Teacher()
    {
        super();
        salary = 0;
    }

    public Teacher(String id, String n, String bd, int s)
    {
        super(id, n, bd);
        setSalary(s);
    }
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        if(salary < 0)
            throw new IllegalArgumentException("Invalid salary for teacher " + super.getSalary());
    }

    public String toString() {
        String ans = super.toString();
        return ans.substring(0, ans.length() - 1) +
                ", salary: " + salary + "\n";
    }

}