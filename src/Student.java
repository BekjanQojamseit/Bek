public class Student extends Person
{
    private double gpa;
    private static final double stipend = 36660.00;

    @Override
    public String toString()
    {
        return "Student: " + super.toString();
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public double getGpa()
    {
        return gpa;
    }

    public Student()
    {
        super();
    }

    public Student(String name, String surname, double gpa)
    {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getPaymentAmount()
    {
        return (gpa > 2.67) ? stipend : 0;
    }
}