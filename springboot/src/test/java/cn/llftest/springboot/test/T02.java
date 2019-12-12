package cn.llftest.springboot.test;

public class T02{

    public static void main(String[] ag) {
    
        Thread t = new Thread(()->{
            try {
                Thread.sleep(3_000);
                System.out.println(Thread.currentThread().getName());
            } catch (Exception e) {
            }
        },"adasdsa");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3_000);
                    System.out.println(Thread.currentThread().getName());
                } catch (Exception e) {
                }
            }
        }, "adasdsa");

        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());


    }

}
