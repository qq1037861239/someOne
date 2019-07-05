package com.pools.doing;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;

public class TestOne {

    private static int count = 0;

/*    public static void main(String[] args) {
        //final int count = 0;
        Timer timer = new Timer("intervalPrint");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("No one know me now!---" + count++);
            }
        }, 1500, 2000);
    }*/

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor stpe = new ScheduledThreadPoolExecutor(3);
        stpe.scheduleAtFixedRate(() -> out.println("I wanna this for " + (count++) + " times"),
                3L, 1L, TimeUnit.SECONDS);
    }
}