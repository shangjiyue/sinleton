package com.shang.pattern.singleton.hungry;

/**
 * @Author sjy
 * @Create 2019-03-11 23:13
 * @Description 饿汉式单例
 * @Version 1.0
 **/
//它是在类加载的时候就立刻初始化，并且创建单利模式
    //优点：没有加任何的锁、执行效率比较高
    //在用的体验上来说，比懒汉式更好

    //缺点：类加载的时候就初始化，不管你用还是不用，我都占着空间
    //浪费了内存，可能站着茅坑不拉屎

    //绝对线程安全，在县城还有出现以前就已经实例化了，不可能存在访问的安全问题
public class HungrySingleton {
    //先静态、后动态
    //先属性、后方法
    //线上后下

    private static final HungrySingleton hungry = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getinstance(){
        return hungry;
    }
}
