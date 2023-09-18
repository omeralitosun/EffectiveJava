public class Main {
    public static void main(String[] args){

        // Dependency Injection usage
        DependencyInjection dependencyInjection = new DependencyInjection(new ExampleClass("Example1"));

        dependencyInjection.printName();
    }
}
