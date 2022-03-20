package com.company;

import javax.swing.*;
import java.time.LocalDateTime;

public class Main extends JFrame {

    public static class SwingClock extends JFrame implements Runnable {

        private Thread thread;
        String hour, min, sec;
        JLabel label;

        public SwingClock() {
            label = new JLabel("", JLabel.CENTER);

            label.setBounds(5, 5, 100, 40);

            add(label);

            setSize(100, 80);
            setLayout(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            thread = new Thread(this);
            this.thread.start();
        }

        @Override
        public void run() {

            try{

                while (true){
                    LocalDateTime now = LocalDateTime.now();
                    hour = ""+now.getHour();
                    min = ""+String.format("%02d",now.getMinute());
                    sec = ""+String.format("%02d",now.getSecond());

                    label.setText(hour +":"+min+":"+sec);
                    thread.sleep(1000);
                }

            }catch(Exception e){
                e.printStackTrace();
            }




        }
        }


    public static void main(String[] args) {

        SwingClock clock = new SwingClock();

    }
}
