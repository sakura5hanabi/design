package singleton;

/**
 * 饿汉式-静态变量
 *
 * 构造器私有化，防止外部创建
 * 在类的内部静态代码块中创建对象
 * 向外暴露获取内部对象的静态公共方法
 *
 * 优缺点与饿汉式-静态常量一致
 */
public class SingletonDemo2 {

    private SingletonDemo2(){}

    private static SingletonDemo2 INSTANCE;

    static{
        INSTANCE = new SingletonDemo2();
    }

    public static SingletonDemo2 getInstance(){
        return INSTANCE;
    }

}
