public interface List {
    public void a();
    public void b();
    public default void c(){
        System.out.println("A default");
    }
}


class MyList implements List {

    @Override
    public void a() {
    }

    @Override
    public void b() {
   }

}