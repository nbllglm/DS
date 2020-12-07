package com.gz.design.singleton;

public class SingleTonTest {
    public static void main(String[] args) {
//        SingleTon2 singleTon2 = SingleTon2.getInstance();
//        SingleTon2 singleTon22 = SingleTon2.getInstance();
//        System.out.println(singleTon2 == singleTon22);
//        task1 task1 = new task1();
//        Thread thread = new Thread(task1);
//        thread.start();
//        Thread thread1 = new Thread(task1);
//        thread1.start();
//        Thread thread2 = new Thread(task1);
//        thread2.start();
        SingleTon7.getInstance();
    }

}

/**
 * 优点：饿汉式，在类装载时完成了实例化，避免了线程同步问题
 * 缺点：没有达到懒加载的效果，如果从未使用过这个实例，则会造成内存的浪费
 * 会造成内存浪费
 */
class SingleTon1 {
    private final static SingleTon1 instance = new SingleTon1();

    private SingleTon1() {
    }

    public static SingleTon1 getInstance() {
        return instance;
    }

}

/**
 * 跟第一种一样就是把实例化放在了静态代码块中
 */
class SingleTon2 {
    private final static SingleTon2 instance;

    static {
        instance = new SingleTon2();
    }

    private SingleTon2() {
    }

    public static SingleTon2 getInstance() {
        return instance;
    }

}

/**
 *  懒汉式
 * 优点 懒加载
 * 缺点 线程不同步，只能单线程用
 * 不推荐
 */
class SingleTon3 {
    private static SingleTon3 instance;

    private SingleTon3() {
    }

    public static SingleTon3 getInstance() {
        if (instance == null) {
            instance = new SingleTon3();
        }
        return instance;
    }
}

/**
 * 缺点 效率太低，每次getinstance都要进行同步，方法进行同步效率太低
 * 不推荐
 */
class SingleTon4 {
    private static SingleTon4 instance;

    private SingleTon4() {
    }

    public static synchronized SingleTon4 getInstance() {
        if (instance == null) {
            instance = new SingleTon4();
        }
        return instance;
    }
}

/**
 * 缺点 线程不安全，效率比上一种高
 * 不推荐
 */
class SingleTon5 {
    private static SingleTon5 instance;

    private SingleTon5() {
    }

    public static SingleTon5 getInstance() {
        if (instance == null) {
            synchronized (SingleTon5.class) {
                instance = new SingleTon5();
            }
        }
        return instance;
    }
}

/**
 * 双重检查-利用锁
 * 优点线程安全，延迟加载，效率高
 */
class SingleTon6 {
    private static volatile SingleTon6 instance;

    private SingleTon6() {
    }

    public static SingleTon6 getInstance() {
        if (instance == null) {
            synchronized (SingleTon6.class) {
                if (instance == null) {
                    instance = new SingleTon6();
                }
            }
        }
        return instance;
    }
}

/**
 * 静态内部类写法-利用类加载机制
 * 线程安全，延迟加载，效率高
 */
class SingleTon7 {
    public SingleTon7() {
    }

    private static class SingleTon7inStance {
        private static final SingleTon7 INSTANCE = new SingleTon7();
    }

    public static SingleTon7 getInstance() {
        System.out.println(SingleTon7inStance.class.getClassLoader());
        return SingleTon7inStance.INSTANCE;
    }
}

/**
 *
 */
enum SingleTon8 {
    INSTANCE;

    public void method() {
        System.out.println("asd");
    }
}