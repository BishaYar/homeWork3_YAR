public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int iOne = 1;
        byte bTwo = 2;
        short sThree = 3;
        long lFour = 4L;
        float fFive = 5f;
        double dSix = 6.0;

        System.out.println("Значение переменной iOne с типом int равно " + iOne);
        System.out.println("Значение переменной bTwo с типом byte равно " + bTwo);
        System.out.println("Значение переменной sThree с типом short равно " + sThree);
        System.out.println("Значение переменной lFour с типом long равно " + lFour);
        System.out.println("Значение переменной fFive с типом float равно " + fFive);
        System.out.println("Значение переменной dSix с типом double равно " + dSix);

        //System.out.println("task 2");
        //task 2
        float fT2 = 27.12f;
        long lT2 = 987678965549L;
        double dT2 = 2.786;
        short sT2 = 569;
        short sT2_1 = -159;
        int iT2 = 27897;
        byte bT2 = 67;

        System.out.println("Task 3");
        short classLP = 23;
        short classAS = 27;
        short classEK = 30;
        short allList = 480;

        short allStudent = (short) (classAS + classEK + classLP);
        short countListForStudent = (short) (allList / allStudent);
        System.out.println("На каждого ученика рассчитано " + countListForStudent +" листов бумаги");

        System.out.println("Task 4");

        int bot = 16;
        int time_0 = 2;

        int timeMin = 20;
        int day_1 = 1;
        int day_2 = 3;
        int dayMonth = 30;
        int minInDay = 24 * 60;

        int bot_1 = ( timeMin / time_0 ) * bot;
        int bot_2 = ( ( minInDay * day_1 ) / time_0 ) * bot;
        int bot_3 = ( ( minInDay * day_2 ) / time_0 ) * bot;
        int bot_4 = ( ( minInDay * dayMonth ) / time_0 ) * bot;

        System.out.println("За 20 минут машина произвела " + bot_1 + " штук бутылок");
        System.out.println("За 1 день машина произвела " + bot_2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bot_3 + " штук бутылок");
        System.out.println("За 1 месяц (30 дней) машина произвела " +  bot_4 + " штук бутылок");

        System.out.println("Task 5");

        int countPotAll = 120;
        int countWhite  = 2;
        int countBrown = 4;
        int countWhiteAll,  countBrownAll, countClass;

        countClass = countPotAll / ( countWhite + countBrown );
        countWhiteAll = countWhite * countClass;
        countBrownAll = countBrown * countClass;

        System.out.println("В школе, где " + countClass + " классов, нужно " + countWhiteAll + " банок белой краски и " + countBrownAll + " банок коричневой краски");

        System.out.println("Task 6");
        short countBanana = 5;
        short countMilk = 2;
        short countIceCream = 2;
        short countEggs = 4;

        short weightBanana = 80;
        short weightMilk = 105;
        short weightIceCream = 100;
        short weightEggs = 70;

        short weightAllGram = (short) ( countBanana * weightBanana + countMilk * weightMilk + countIceCream * weightIceCream + countEggs * weightEggs );
        float weightAllKilogr = ( (float) weightAllGram / 1000 );

        System.out.println("Завтрак спортсмена составляет " + weightAllGram + " граммов" );
        System.out.println("Завтрак спортсмена составляет " + weightAllKilogr + " килограммов" );

        System.out.println("Task 7");
        short weightMinus = 7;
        short weightDay1 = 250;
        short weightDay2 = 500;

        short countDays1 = (short) ( ( 7 * 1000 ) / weightDay1 );
        short countDays2 = (short) ( ( 7 * 1000 ) / weightDay2 );
        short countDays3 = (short) ( ( countDays1 + countDays2 ) / 2 );

        System.out.println("Спортсмен похудеет за " + countDays1 + " дней, если будет терять 250 грамм в день" );
        System.out.println("Спортсмен похудеет за " + countDays2 + " дней, если будет терять 500 грамм в день" );
        System.out.println("Спортсмен похудеет за " + countDays3 + " дней, если будет терять вес по среднему (375 грамм в день )" );

        System.out.println("Task 8");
        int payCheckMasha = 67760;
        int payCheckDen = 83690;
        int payCheckKris = 76230;

        int increaseMasha, increaseDen, increaseKris;

        increaseMasha = (int) ( payCheckMasha * 1.1 );
        increaseDen = (int) ( payCheckDen * 1.1 );
        increaseKris = (int) ( payCheckKris * 1.1 );

        int diffPayCheckMasha = ( increaseMasha - payCheckMasha ) * 12;
        int diffPayCheckDen = ( increaseDen - payCheckDen ) * 12;
        int diffPayCheckKris = ( increaseKris - payCheckKris ) * 12;

        System.out.println("Маша теперь получает " + increaseMasha + " рублей. Годовой доход вырос на " + diffPayCheckMasha + " рублей" );
        System.out.println("Денис теперь получает " + increaseDen + " рублей. Годовой доход вырос на " + diffPayCheckDen + " рублей" );
        System.out.println("Кристина теперь получает " + increaseKris + " рублей. Годовой доход вырос на " + diffPayCheckKris + " рублей" );

    }
 }