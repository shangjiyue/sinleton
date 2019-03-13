package com.shang.pattern.singleton.hungry;

/**
 * @Author sjy
 * @Create 2019-03-11 23:20
 * @Description 饿汉式静态块单例
 * @Version 1.0
 **/
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungry;

    static{
        hungry = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungry;
    }
}
