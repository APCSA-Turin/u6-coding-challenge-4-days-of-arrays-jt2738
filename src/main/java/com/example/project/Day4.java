package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int distance;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int count;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name=name;
            this.speed=speed;
            this.runDuration=runDuration;
            this.restDuration=restDuration;
        }

        public int getDistanceTraveled(){ // this method is required
            return distance;
        }
        
        public String getName() {
            return name;
        }

        public void simulateSecond(){ //this method is required but not tested
            count++;
            if(count<=runDuration){
                distance+=speed;
            }
            if(count>runDuration+restDuration){
                count=0;
            }
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        int highest=0;
        String winner="";
        for(int i=0;i<reindeers.length;i++){
            for(int j=0; j<=time;j+=reindeers[i].runDuration+reindeers[i].restDuration){
                int count=0;
                while(count<=reindeers[i].runDuration){
                    reindeers[i].simulateSecond();
                    count++;
                }
                
            }
            if(reindeers[i].distance>highest){
                highest=reindeers[i].distance;
                winner=reindeers[i].getName();
            }
        
        }
        
        return winner;
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}



