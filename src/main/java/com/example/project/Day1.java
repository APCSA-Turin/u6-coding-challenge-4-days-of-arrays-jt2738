package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if (name.equals("")|| name.equals(null)) {
            throw new IllegalArgumentException("Name cannot be null or empty");
            } else {
            int randRange=(int)(Math.random()*5);
            String elfName= elf_names[randRange];
            elfName+=" " + name; 
            return elfName;  
            }
    }
}