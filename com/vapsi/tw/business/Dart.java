package com.vapsi.tw.business;

public class Dart {


    private double radius;

    public Dart(double x, double y) {
        radius = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

   public int score() {
        if(radius <= 1)
            return 10;
        if(radius <= 5)
            return 5;
        if(radius <= 10)
            return 1;
        return 0;
    }






}
