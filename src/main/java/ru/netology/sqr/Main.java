package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SqrService service = new SqrService();

        int bottomBound = 200;
        int topBound = 300;

        System.out.println(service.countSqr(200, 300));

    }
}

