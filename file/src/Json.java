public class Json {


    public static void main(String[] args) {
        Person p = new Person("youd", 1);
    }
}


class Person {
    String name;
    Integer id;

    public Person(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
}
