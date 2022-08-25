package singleton;

/**
 *  懒汉式-线程安全-枚举
 *
 *  优点：
 *  1、防止反序列化重新创建对象
 */
public enum SingletonDemo8 {

    INSTANCE;

}
