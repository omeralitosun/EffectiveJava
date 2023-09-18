public class DependencyInjection {

    private final ExampleClass exampleClass;

    public DependencyInjection(ExampleClass exampleClass){

        this.exampleClass = exampleClass;
    }

    public void printName(){
        System.out.println(exampleClass.getName());
    }
}
