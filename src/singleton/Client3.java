package singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @author ZHGQ
 * @project Gof-23pattern
 * @Package singleton
 * @date 2019/3/6-17:56
 * @Copyright: (c) 2019 USTC. All rights reserved.
 * @Description: 测试集中创建方式的效率
 */
public class Client3 {
    public static void main(String[] args) throws InterruptedException {

        int threadNum = 10;
        long start = System.currentTimeMillis();
        //引入线程计数器
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);


        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000000; i++) {

//                        Object o = SingletonDemo3.getInstance();
                        Object o = SingletonDemo4.INSTANCE;
                    }
                    //线程计数器减一
                    countDownLatch.countDown();
                }
            }).start();
        }

        //等待所有线程都执行完
        countDownLatch.await();

        long end = System.currentTimeMillis();
        System.out.println("总耗时" + (end - start));
    }
}
