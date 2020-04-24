package xyz.williamw.creational;

public class ABC {
    BDF f = new DFG();

    public static void main(String[] args) {
        String b = "";
        assert b;
        System.out.println("断言通过");
    }
}

abstract class BDF{
    public void ddd(){
        int i=0;
    }
}


class DFG extends BDF{

}