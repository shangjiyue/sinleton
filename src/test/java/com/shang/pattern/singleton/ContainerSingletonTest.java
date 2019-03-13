package com.shang.pattern.singleton;

import com.shang.pattern.singleton.register.ContainerSingleton;

/**
 * @Author sjy
 * @Create 2019-03-12 23:39
 * @Description TODO
 * @Version 1.0
 **/
public class ContainerSingletonTest {
    public static void main(String[] args) {

        try {
            long start = System.currentTimeMillis();
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    ContainerSingleton.getInstance("com.shang.pattern.singleton.Pojo");
                    System.out.println(System.currentTimeMillis());
                }
            },10,6);
            long end = System.currentTimeMillis();
            System.out.println("总耗时：" + (end - start) + "ms.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
