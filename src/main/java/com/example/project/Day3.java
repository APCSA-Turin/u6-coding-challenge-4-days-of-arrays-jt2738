package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];
        for (int i = 0; i < size; i++) {
          for (int j = 0; j < size; j++) {
            grid[i][j] = " ";
          }
        }
        //first diagonal
        for(int i=0; i<size;i++){
            grid[i][i]="*";
        }
        //second diagonal
        int box=size-1;
        for(int i=0;i<size;i++){
          grid[i][box]="*";
          box--;
        }
        //center flakes
        int middleIdx= (size-1)/2;
        for(int i=0;i<size;i++){
          grid[i][middleIdx] = "*";
        }
        for(int i=0;i<size;i++){
          grid[middleIdx][i] = "*";
        }
        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake() {
      int size = 7; // Small odd size
      String[][] snowflake = Day3.generateSnowflake(size);

    }

    // Test for the snowflake generation
    public static void main(String[] args) {
      printSnowflake();
    }
}

