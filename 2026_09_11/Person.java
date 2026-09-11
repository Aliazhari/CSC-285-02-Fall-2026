public abstract class Person  {
   private String name;
   private int age;
  
   public Person() {

   }
public Person(String name, int age) {
    this.name = name;
    this.age = age;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}

@Override
public String toString() {

    return name + "  " + age;

}

 public void dancing() {
        System.out.println("Person dances");
    }
  


public static void main(String[] blahblah) {

    Student p1 = new Student("Bob", 20, 1234, 3.5);
    System.out.println(p1);
    Person p2 = new Student("Jim", 19, 2345, 4.0);

}
}