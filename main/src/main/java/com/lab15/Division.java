package com.lab15;

public class Division {
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new IllegalArgumentException("0-ээр хуваах боломжгүй");
        }
        return a / b;
    }
}
