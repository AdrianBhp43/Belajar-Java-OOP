public class PersonApp {
    public static void main(String[] args) {

        /* Contoh Object */

        var person = new Person();
        person.name = "Adrian";
        person.address = "Bandung";
        //person.country = "Tidak Bisa Diubah";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
    }
}
