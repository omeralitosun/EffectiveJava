public class JavaBeansPatternExample {

    // Required parameters
    private String requiredParameter1;
    private String requiredParameter2;

    // Optional parameters
    private String optionalParameter1;
    private String optionalParameter2;

    public JavaBeansPatternExample(String requiredParameter1, String requiredParameter2) {
        this.requiredParameter1 = requiredParameter1;
        this.requiredParameter2 = requiredParameter2;
    }

    public void setOptionalParameter1(String optionalParameter1) {
        this.optionalParameter1 = optionalParameter1;
    }

    public void setOptionalParameter2(String optionalParameter2) {
        this.optionalParameter2 = optionalParameter2;
    }
}
