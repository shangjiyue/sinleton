package com.shang.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @Author sjy
 * @Create 2019-03-12 22:36
 * @Description 序列化单例
 * @Version 1.0
 **/
//反序列化时导致单例破坏
public class SeriableSingleton implements Serializable {
    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换成一个IO流，写入到其他地方(可以使磁盘、网络IO)
    //内存中状态给永久保存下来了

    //反序列化
    //将已经持久化的字节码内容，转换成IO流
    //通过IO流的读取，进而将读取的内容转换为java对象
    //在转换过程中会重新创建对象new

    private final static SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return seriableSingleton;
    }

    private Object readResolve() {
        return seriableSingleton;
    }
}
