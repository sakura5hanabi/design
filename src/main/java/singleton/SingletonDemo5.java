package singleton;

/**
 * 懒汉式-线程不安全-同步代码块
 *
 */
public class SingletonDemo5 {

    private SingletonDemo5(){}

    private static SingletonDemo5 INSTANCE;

    public static SingletonDemo5 getINSTANCE() {
        if(INSTANCE == null){
            synchronized (SingletonDemo5.class){
                INSTANCE = new SingletonDemo5();
            }
        }
        return INSTANCE;
    }
}
