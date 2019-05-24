package jv2_assignment3;

import jv2_session3.RunThread;

public class Main {
    public static void main(String args[]) {
        DemGio d =new DemGio();
        Thread dg=new Thread(d);
        dg.start();
    }
}

