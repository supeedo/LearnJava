package com.javarush.task.task20.task2025;


/*
Алгоритмы-числа
*/
public class Solution {

    public static long[] getNumbers( long N ) {
            long[] result = null;
            if(N > 0 ) {
                result = new long[getCount(N)];
                int count = 0;
                for (long i = 0; i < N; i++) {
                    if (checkNum(i)) {
                        count++;
                        result[count - 1] = i;
                    }
                }
                return result;
            }
            return result;
    }



    public static void main( String[] args ) {
        // For Test
        long[] lo = getNumbers(370);
        for (long l : lo) {
            System.out.println(l);
        }




       // System.out.println(getCount( 146511208L));
    }

    // проверяем число на принадлежность
    public static boolean checkNum( long a ) {
        int M = getCountOfDigit(a);
        long temp = a;
        long S = 0;
        while (a != 0) {
            long tempA = a % 10;
            S += getPow(tempA, M);
            a /= 10;
        }
        return  S == temp ? true : false;
    }

    // возводим число A в степень B

    public static long getPow( long A, int B ) {
        long result = 1;
        for (long i = 0; i < B; i++) {
            result *= A;
        }
        return result;
    }

    // сколько цифр в числе
    public static int getCountOfDigit( long S ) {
        int count = (S == 0) ? 1 : 0;
        while (S != 0) {
            count++;
            S /= 10;
        }
        return count;
    }
    //  Сколько всего чисел до числа N

    public static int getCount( long N ) {
        int count = 1;
        for (long i = 1L; i < N; i++) {
           if (checkNum(i)) {
                count++;
            }
        }
        return count;
    }


}
