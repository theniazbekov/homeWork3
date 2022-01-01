package com.company;

public class Main {

    public static void main(String[] args) {
        float[] number = {2.3f, -4.0f, 9.1f, 1.3f, 0.4f, -18.6f, 4.3f, 0.2f, -5.3f, 4.0f, 1.4f, -6.3f, 1.0f, 3.4f, -1.0f};
        double sum = 0;
        int num = 0;
        boolean action = false;
        for (double a : number) {
            if (a < 0) {
                action = true;
            } else {
                if (action) {
                    num++;
                    sum += a;
                }
            }
        }
        System.out.println("Среднее арефметическое = " + sum / num);
    }
}
