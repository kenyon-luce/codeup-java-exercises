public class Person {
    public String firstName;
    public String lastName;

    public static void main(String[] arg){
        Person ken = new Person();
        System.out.println(ken);

        ken.firstName = "Kenyon";
        ken.lastName = "Luce";

        System.out.println("ken.firstName = " + ken.firstName);
        System.out.println("ken.lastName = " + ken.lastName);
    }
}
