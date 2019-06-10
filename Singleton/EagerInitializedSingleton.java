package Singleton;

/**
 * If your singleton class is not using a lot of resources, this is the approach
 * to use. But in most of the scenarios, Singleton classes are created for
 * resources such as File System, Database connections etc and we should avoid
 * the instantiation until unlessclient calls the getInstancemethod. Also this
 * method doesn’t provide any options for exception handling.
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstace() {
        return instance;
    }
}