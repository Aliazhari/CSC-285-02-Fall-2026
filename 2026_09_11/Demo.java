public class Demo {
    
    public static void print(Person s) {
        System.out.println(s.toString());
        ((Student)s).dancing();
    }

  
    public static void main(String[] args) {
        Person s1 = new Student("Bob", 10, 12, 3);
        s1.dancing();
        Employee e1 = new Employee("Jim", 30, 23, 75000);
        print(s1);
        // print(e1);
    }
}
