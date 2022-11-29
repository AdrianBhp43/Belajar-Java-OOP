public class Person {

    /* Contoh Field */

   String name;
   String address;
   final String country = "Indonesia";

    /* Contoh Constructor */
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

   /* Contoh Untuk Menampilkan Method di Console */
   void sayHello(String paramName){
       System.out.println("Hello " + paramName + ", My Name is " + name);
   }
}
