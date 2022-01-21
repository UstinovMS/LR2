package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Java преобразование числа в строку (NUMBER to STRING)");

        //int to String
        int i = 35;
        String strInt = Integer.toString(i);
        System.out.println(strInt);

        //double to String
        double d = 32.4e10;
        String strDouble = Double.toString(d);
        System.out.println(strDouble);

        //long to String
        long l = 3422222;
        String strLong = Long.toString(l);
        System.out.println(strLong);

        //float to String
        float f = 3.46f;
        String strFloat = Float.toString(f);
        System.out.println(strFloat);

        System.out.println("Преобразования символа char");

        //char to String
        char ch = 'S';

        // c использованием класса Character
        String charToString = Character.toString(ch);
        System.out.println(charToString);

        // с использованием операции добавления класса String
        String str = "" + ch;
        System.out.println(str);

        //с использованием массива
        String fromChar = new String(new char[] { ch });
        System.out.println(fromChar);

        // с использованием метода valueOf класса String
        String valueOfchar = String.valueOf(ch);
        System.out.println(valueOfchar);

        //char to int
        char chInt = '9';

        // c использованием метода getNumericValue класса Character
        int i1 = Character.getNumericValue(chInt);
        System.out.println(i1);

        // c использованием метода digit класса Character
        int i2 = Character.digit(chInt,10);
        System.out.println(i2);

        System.out.println("Преобразования чисел");

        //int to long
        int ia = 2015;
        long la = (long) (ia);
        System.out.println(la);

        //int to float
        int ib = 2015;
        float fb = (float) (ib);
        System.out.println(fb);

        //long to int
        long lc = 214748364;
        int ic = (int) lc;
        System.out.println(ic);

        //double to int
        double dd = 3.14;
        int id = (int) dd;
        System.out.println(id);

    }
}
