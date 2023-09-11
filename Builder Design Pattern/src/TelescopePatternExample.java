public class TelescopePatternExample {

    // Required parameters
    private String requiredParameter1;
    private String requiredParameter2;

    // Optional parameters
    private String optionalParameter1;
    private String optionalParameter2;

    public TelescopePatternExample(String requiredParameter1, String requiredParameter2) {
        this.requiredParameter1 = requiredParameter1;
        this.requiredParameter2 = requiredParameter2;
    }

    public TelescopePatternExample(String requiredParameter1, String requiredParameter2, String optionalParameter1) {
        this.requiredParameter1 = requiredParameter1;
        this.requiredParameter2 = requiredParameter2;
        this.optionalParameter1 = optionalParameter1;
    }

    public TelescopePatternExample(String requiredParameter1, String requiredParameter2, String optionalParameter1, String optionalParameter2) {
        this.requiredParameter1 = requiredParameter1;
        this.requiredParameter2 = requiredParameter2;
        this.optionalParameter1 = optionalParameter1;
        this.optionalParameter2 = optionalParameter2;
    }
}
