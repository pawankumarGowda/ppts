package Model;

public final class SingletonJava {
    private static final SingletonJava INSTANCE = new SingletonJava();
    private SingletonJava(){}
    public String property;

    public static SingletonJava getInstance(){
        return INSTANCE;
    }
}
