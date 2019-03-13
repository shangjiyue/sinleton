package com.shang.pattern.singleton;

/**
 * @author: sjy
 * @create: 2019-03-13 13:54
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class StaticTest {
    public static String name = "测试name1";


    static{
        name = "测试name2";
    }


    public StaticTest() {
        name = "测试构造器name";
    }

    public static String getName(){
        return name;
    }
}
