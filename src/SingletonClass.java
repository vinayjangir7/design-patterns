public class SingletonClass {
    private static SingletonClass singletonInstance;

    private SingletonClass() {
        /* Not a utility class*/
    }

    public static synchronized SingletonClass getSingletonInstance() {
                if (singletonInstance == null) {
                    singletonInstance = new SingletonClass();
                }
        return singletonInstance;
    }
}
