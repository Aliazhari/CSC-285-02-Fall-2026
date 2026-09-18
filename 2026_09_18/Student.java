class Student <T, S> implements Comparable <Object>{

    private T id;
    private String name;
    private S age;
    private double gpa;
    private int yearStudy;

    private static int count = 0;

    public Student(T id, String name, S age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        yearStudy = 10;
        count++;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public S getAge() {
        return age;
    }

    public void setAge(S age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public int compareTo(Object otherStudent) {

        if (yearStudy > ((Student)otherStudent).getYearStudy())
            return 1;

        if (yearStudy < ((Student)otherStudent).getYearStudy())
            return -1;
        return 0;
    
    }

    public int getYearStudy() {
        return yearStudy;
    }

    public void setYearStudy(int yearStudy) {
        this.yearStudy = yearStudy;
    }

    

    
}