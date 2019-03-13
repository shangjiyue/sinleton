package com.shang.pattern.singleton.threadlocal;

/**
 * @Author sjy
 * @Create 2019-03-12 22:53
 * @Description TODO
 * @Version 1.0
 **/
public class ThreadLocalSingleton {
    private final static ThreadLocal<ThreadLocalSingleton> threadLocalSingleton =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {
    }

    private static ThreadLocalSingleton getInstance() {
        return threadLocalSingleton.get();
    }
}
