package singleton;

/**
 * 懒汉式-线程不安全
 *
 *
 *
 */
public class SingletonDemo3 {

    private SingletonDemo3(){}

    private static SingletonDemo3 INSTANCE;

    public static SingletonDemo3 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonDemo3();
        }
        return INSTANCE;
    }

}
