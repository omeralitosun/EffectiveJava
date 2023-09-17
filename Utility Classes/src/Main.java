public class Main {
    public static void main(String[] args){

        // Usage
        UtilityClass.add("Ömer");
        AbstractClass.add("Ömer");
        Enum.add("Ömer");
        System.out.println("");

        // Create new object
        /* ERROR!! Cannot be new
         UtilityClass utilityClass = new UtilityClass();
         AbstractClass abstractClass = new AbstractClass();
         Enum enum = new Enum();
         */

        // Can create new AbstractChildClass
        AbstractClass abstractClass = new AbstractChildClass();
        abstractClass.add("Ömer");

    }
}
