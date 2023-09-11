public class Main {
    public static void main(String[] args){

        // Telescope Pattern usage
        TelescopePatternExample telescopeObject =
                new TelescopePatternExample("Req param1","Req param2","Optional param1");

        /*----------------------------------------------------------*/

        // Java Beans Pattern usage
        JavaBeansPatternExample javaBeansObject =
                new JavaBeansPatternExample("Req param1", "Req param2");

        javaBeansObject.setOptionalParameter1("Optional param1");

        /*----------------------------------------------------------*/

        // Builder Design Pattern usage
        BuilderDesignExample builderObject = new BuilderDesignExample
                .Builder("Req param1","Req param2")
                .optionalParam1("Optional param1")
                .build();

        /*----------------------------------------------------------*/
    }
}
