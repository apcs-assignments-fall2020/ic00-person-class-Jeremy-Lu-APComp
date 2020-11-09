public class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Jeremy", "Lu");
        p1.setFName("Steve");
        p1.setLName("Stevenson");
        System.out.println(p1);
        p1.doSomething(); //
        Person p2 = new Person();
        System.out.println(p2);
    }
}
