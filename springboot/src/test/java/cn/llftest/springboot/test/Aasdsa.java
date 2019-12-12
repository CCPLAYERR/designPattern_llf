package cn.llftest.springboot.test;

import org.apache.tomcat.util.threads.TaskQueue;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Aasdsa {
    public static void main(String[] args) {
//        boolean c;
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\JVM.txt"));
//            do {
//                String sa = br.readLine();
//                String[] vs = sa.split("v");
//                System.out.println(vs[0]);
//            } while (c = br.read() != -1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //-----
        Bsdasdas bsdasdas = new Bsdasdas();
        Collection<Bsdasdas> bsdasdas1 = new ArrayList<>();
        bsdasdas1.add(bsdasdas);

        BlockingQueue<Runnable> workQueue = new TaskQueue(bsdasdas1);
       // workQueue.add(bsdasdas);
        TimeUnit unit = TimeUnit.MINUTES;
        //unit.toSeconds(3);
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 10, 24, unit, workQueue);
        System.out.println(poolExecutor.getCorePoolSize());

        // poolExecutor.execute(bsdasdas);
        // BlockingQueue<Runnable> queue = poolExecutor.getQueue();
        poolExecutor.execute(bsdasdas);

    }


}

class Bsdasdas implements Runnable {
    private int i = 0;
    @Override
    public void run() {

        while (true){
            //System.out.println();
            Optional.of("runnable 线程"+ i).ifPresent(System.out::println);
            i++;
            try {
                Thread.sleep(5_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
