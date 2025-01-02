
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String arr[][]= new String[2][names.length];
        String [] niceList = arr[0];
        String [] naughtyList = arr[1];
        for(int i=0; i<names.length;i++){
            Random random = new Random();
            boolean rand= random.nextBoolean();
            if (rand) {
                niceList[i]=names[i];
            } else {
                naughtyList[i]=names[i];
            }
        }
        return arr; //you must return a two dimensional string array
    }

    public static void main(String[] args) {

    }
}