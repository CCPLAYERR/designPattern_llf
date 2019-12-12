package cn.llftest.springboot.test;

public class Cimplxxx {

    public Iface getIface(){
        return new Ciner();
    }

    private class Ciner implements Iface{
        @Override
        public String printout(String s) {
            return s+" : Ciner";
        }
    }

    public static void main(String[] args) {
        String a =null;
//        System.out::println;
    }
}
