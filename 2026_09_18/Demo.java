import java.util.Comparator;

public class Demo {
    
    public static <T> void print(T item) {
        System.out.println(item);
    }

    

  
    public static void main(String[] args) {

        Fingerprint fp = new Fingerprint("aabbssr34hhsujsls");
        
        Student<String, Integer> s1 = new Student<>("123", "Bob", 19, 3.5);
         Student<String, Integer> s2 = new Student<>("S124", "Rashmi", 20, 3.1);
         Student<Fingerprint, String> s3 = new Student<>(fp, "Rashmi", "20", 3.1);


         Comparator<Student> c = ( o1,  o2) -> {
        return o1.getName().compareTo(o2.getName());
     };

     if (c.compare(s1, s2) > 0)
        System.out.println("s1 > s2");
    }
}

      

   

