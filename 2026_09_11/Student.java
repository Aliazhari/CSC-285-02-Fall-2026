public class Student extends Person {

    int id;
    double gpa;
    public Student(String name, int age, int id, double gpa) {
        super(name, age);
        this.id = id;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return  super.toString() + ", id=" + id + ", gpa=" + gpa + "]";
    }

    
}
