package cn.llftest.springboot.test;

import org.hibernate.event.spi.SaveOrUpdateEvent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T01 {

    private static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("t1线程正在执行");
                int i = 0;
                while (flag) {
                    System.out.println(i++);
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        t1.start();
     //
        //t1.join();
        Thread.sleep(1000L);

        System.out.println(t1.getName());

        System.out.println("线程开始停止");
       // T01.stopThread();
        T01.stopThread();
        System.out.println("线程已停止");


    }

    public static void stopThread(){
        T01.flag = false;
    }
}
