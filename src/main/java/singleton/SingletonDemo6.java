package singleton;

/**
 * 懒汉式-线程安全-双重检查
 *
 *
 */
public class SingletonDemo6 {

    private SingletonDemo6(){}

    private volatile static SingletonDemo6 INSTANCE;

    public static SingletonDemo6 getINSTANCE() {
        if(INSTANCE == null){
            synchronized (SingletonDemo6.class){
                if(INSTANCE == null){
                    return INSTANCE;
                }
            }
        }
        return INSTANCE;
    }
}
