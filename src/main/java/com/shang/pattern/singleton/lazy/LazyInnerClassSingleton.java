package com.shang.pattern.singleton.lazy;

/**
 * @Author sjy
 * @Create 2019-03-11 23:33
 * @Description 内部类懒汉式单例
 * @Version 1.0
 **/
//懒汉式单例


//这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
//完美地屏蔽了这两个缺点
//最牛逼的代理模式的实现方式
public class LazyInnerClassSingleton {
    //默认使用LazyInnerClassSingleton的时候，会先初始化内部类
    //如果没有使用的话，内部类是不加载的
    private LazyInnerClassSingleton() {
        if (null != LazyHolder.LAZY) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //每一个关键字都不是多余的
    //static 是为了使单利的空间共享
    //final 保证这个方法不会被重写、重载
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    //默认不加载
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
