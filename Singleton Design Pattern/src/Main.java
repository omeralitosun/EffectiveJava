public class Main {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                }catch (Exception e){

                }

                System.out.println("Lazy :" + LazySingleton.getInstance().hashCode());
                System.out.println("Eager :" + EagerSingleton.getInstance().hashCode());
                System.out.println("Enum :" + EnumSingleton.INSTANCE.hashCode());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Lazy :" + LazySingleton.getInstance().hashCode());
                System.out.println("Eager :" + EagerSingleton.getInstance().hashCode());
                System.out.println("Enum :" + EnumSingleton.INSTANCE.hashCode());
            }
        }).start();
    }
}
