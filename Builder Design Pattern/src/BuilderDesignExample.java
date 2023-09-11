public class BuilderDesignExample {

    // Required parameters
    private String requiredParameter1;
    private String requiredParameter2;

    // Optional parameters
    private String optionalParameter1;
    private String optionalParameter2;

    public static class Builder{
        // Required parameters
        private String requiredParameter1;
        private String requiredParameter2;

        // Optional parameters
        private String optionalParameter1;
        private String optionalParameter2;

        public Builder(String requiredParameter1,String requiredParameter2){
            this.requiredParameter1 = requiredParameter1;
            this.requiredParameter2 = requiredParameter2;
        }

        public Builder optionalParam1(String optionalParameter1){
            this.optionalParameter1 = optionalParameter1;
            return this;
        }
        public Builder optionalParam2(String optionalParameter2){
            this.optionalParameter2 = optionalParameter2;
            return this;
        }
        public BuilderDesignExample build(){
            return new BuilderDesignExample(this);
        }
    }

    public BuilderDesignExample(Builder builder){
        this.requiredParameter1 = builder.requiredParameter1;
        this.requiredParameter2 = builder.requiredParameter2;
        this.optionalParameter1 = builder.optionalParameter1;
        this.requiredParameter2 = builder.optionalParameter2;
    }
}
