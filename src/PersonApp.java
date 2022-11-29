public class PersonApp {
    public static void main(String[] args) {

        /* Contoh Object dan Manipulation Field */

        var person1 = new Person("Adrian", "Bandung");
        person1.name = "Adrian";
        person1.address = "Bandung";
        //person.country = "Singapura"; // ERROR

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Bimo"); // Contoh Method

        Person person2 = new Person("Hernawan", "Cianjut");
        person2.name = "Hernawan";
        person2.sayHello("Pratama"); // Contoh Method

        Person person3;
        person3 = new Person("Herlino", "Jakarta");
        person3.name = "Herlino";
        person3.sayHello("Naizar"); // Contoh Method
    }
}
