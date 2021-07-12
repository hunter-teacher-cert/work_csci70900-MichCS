import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args){
   
    int hour = 13;
    int minute = 8;
    int second = 03;

    System.out.println("The amount of seconds that have passed since midnight:" + " " + ((hour * 60)*60) + " " + "seconds");
    System.out.println("The amount of seconds that remain in the day:" + " " + (((24 - hour)*60)*60) +  " " + "seconds");
    } //end of method
}
