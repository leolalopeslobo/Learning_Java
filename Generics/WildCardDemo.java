package javaapplication1;

import java.util.*;

public class WildCardDemo {
    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
        
        public static void main(String[] args){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(6);
            list.add(7);
            list.add(2);
            list.add(100);
            list.add(10);
            
            double sum = sum(list);
            System.out.println("Sum of ints = "+sum);
        }
    }