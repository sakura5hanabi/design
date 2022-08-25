package singleton;

/**
 * 懒汉式-线程安全-同步方法
 *
 * 缺点：
 * 1、效率过低
 */
public class SingletonDemo4 {

    private SingletonDemo4() {
    }

    private static SingletonDemo4 INSTANCE;

    public static synchronized SingletonDemo4 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonDemo4();
        }
        return INSTANCE;
    }


}
