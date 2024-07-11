package ru.netology.JawaMaven;

public class CountService {
    public int calcMonth(int income, int expenses) {
        int count = 0;
        int threshold = 0;
        for (int month = 0; month < 12; month++) {
            if (threshold >= 150_000) {
                count++;
                threshold = (income - expenses) / 3;
            } else {
                threshold = threshold + income - expenses;
            }
        }

        return count;
    }
}
