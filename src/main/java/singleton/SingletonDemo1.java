package singleton;

/**
 * 饿汉式-静态常量
 * 构造器私有化，防止外部创建
 * 在类的内部创建对象
 * 向外暴露获取内部对象的静态公共方法
 *
 * 优点：
 * 1、写法简单；类加载时完成实例化，避免线程同步
 *
 * 缺点：
 * 1、类加载时就完成实例化，没有达到懒加载的效果，可能造成内存的浪费
 *
 */
public class SingletonDemo1 {

    private SingletonDemo1() {
    }

    private static final SingletonDemo1 INSTANCE = new SingletonDemo1();

    public static SingletonDemo1 getInstance() {
        return INSTANCE;
    }

}
