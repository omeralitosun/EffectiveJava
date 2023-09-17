public class UtilityClass {

    private UtilityClass(){
        throw new AssertionError();
    }

    public static void add(String name){
        System.out.println(name + " added. (UtilityClass)");
    }
}
