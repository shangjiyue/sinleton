package com.shang.pattern.singleton.register;

/**
 * @Author sjy
 * @Create 2019-03-12 0:07
 * @Description 枚举式注册登记单例
 * @Version 1.0
 **/
//常亮中去使用，常亮不就是用来大家都能够共用吗？
//通常在同用API中使用
public enum EnumSingleton {
    SINSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return SINSTANCE;
    }
}
