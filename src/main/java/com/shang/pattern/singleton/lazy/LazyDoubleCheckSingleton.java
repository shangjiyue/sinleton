package com.shang.pattern.singleton.lazy;

/**
 * @Author sjy
 * @Create 2019-03-11 23:24
 * @Description 懒汉式双重锁单例
 * @Version 1.0
 **/
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy;

    private LazyDoubleCheckSingleton() {
    }

    private static LazyDoubleCheckSingleton getInstance() {
        //先判断lazyDoubleCheckSingleton是否为空
        if (null == lazy) {
            //如果为空则同步下面的代码
            synchronized (LazyDoubleCheckSingleton.class) {
                //同步代码块中，如果lazyDoubleCheckSingleton为空，则创建实例
                if (null == lazy) {
                    lazy = new LazyDoubleCheckSingleton();
                    return lazy;
                }
            }
        }
        return lazy;
    }
}
