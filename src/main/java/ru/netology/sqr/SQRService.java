package ru.netology.sqr;

public class SQRService {

    public int numberOfSquares(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= min && sqr <= max) {
                ++count;
            } else {
                count = count;
            }
        }
        return count;
    }
}
