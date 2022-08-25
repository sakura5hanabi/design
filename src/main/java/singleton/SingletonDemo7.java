package singleton;

/**
 *  懒汉式-线程安全-静态内部类
 *
 *  采用类装载的机制保证线程安全
 *  优点：
 *  1、效率高
 */
public class SingletonDemo7 {

    private SingletonDemo7(){}

    static class SingletonStaticDemo7{
        private static final SingletonDemo7 INSTANCE = new SingletonDemo7();
    }

    public static SingletonDemo7 getInstance(){
        return SingletonStaticDemo7.INSTANCE;
    }

}
