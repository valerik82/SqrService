package ru.netology.sqr;


public class SqrService {

    public int countSqr(int bottomBound, int topBound) {
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if ((i * i >= bottomBound) && (i * i <= topBound)) {

                count++;
            }


        }
        return count;
    }


}
