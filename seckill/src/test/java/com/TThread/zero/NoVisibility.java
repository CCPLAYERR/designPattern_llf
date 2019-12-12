package com.TThread.zero;


import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class NoVisibility {

    private static boolean ready;
    private static int number;

//    public int loadTheArk(Collection<Animal> candidates){
//        SortedSet<Animal> animals;
//        int numPairs = 0;
//        Animal candidate = null;
//        //animals被封闭在方法中 不要使他们逸出
//        animals = new TreeSet<Animal>(new SpeciesGenderComparator());
//        animals.addAll(candidates);
//        for (Animal a : animals) {
//            if (candidate ==null || candidate.isPotentialMate(a)){
//                candidate =a;
//            }else {
//                ark.load(new AnimalPair(candidate,a));
//                ++numPairs;
//                candidate =null;
//            }
//
//        }
//        return numPairs;
//
//    }


    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while (!ready) {
                Thread.yield();
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();
        Thread.sleep(11);
        //      new ReaderThread().start();
        //      new ReaderThread().start();
//        new ReaderThread().start();
//        new ReaderThread().start();


        //  Thread.sleep(11);
        number = 42;
        Thread.sleep(11);
        ready = true;

//         boolean a;
//        while (!a){
//            System.out.println(a);
//        }

    }

}
