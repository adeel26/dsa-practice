package com.adeel.Other_Path.Projects.CountdownTimer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        // Java COUNTDOWN TIMER PROGRAM

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter # of seconds to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;

                if(count < 0) {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }

            }
        };


        timer.scheduleAtFixedRate(task, 1500, 700);


    }
}

/*

✅ Difference in ONE SIMPLE SENTENCE

schedule()
👉 If a run takes long time, it waits the full delay AFTER finishing before running again.

scheduleAtFixedRate()
👉 If a run takes long time, it runs the next one immediately (catch-up) so timing stays fixed.

 */