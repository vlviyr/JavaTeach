package com.corejava.day05.computerexample;

public class TestComputer {
    public static void main(String[] args){
        Screen sc = new Screen("星云", 17);
        String sc_tmp = sc.showScreen();
//        System.out.println(sc_tmp);
        Computer com1 = new Computer("ROG", 9999, sc);
        com1.showComputer();

    }

}
