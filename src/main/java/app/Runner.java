package app;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Calendar;

public final class Runner {

    private static InputStreamReader isreader = new InputStreamReader(System.in);
    private static BufferedReader isbuffer = new BufferedReader(isreader);
    private static Console console = System.console();
    private static Calendar calendar = Calendar.getInstance();

    static final class Math {

        static int[] evenOf(final String[] arr) {
            int[] intEvenNumbers = new int[arr.length];
            int i = 0;
            for (String str: arr) {
                if (!str.trim().isEmpty()) {
                    try {
                        int n = Integer.parseInt(str.trim());
                        if (n % 2 == 0) intEvenNumbers[i++] = n;
                    } catch (NumberFormatException e) {
                        System.out.println("Целые числа блять введи! сука ты ёбаная!!!");
                    }
                }
            }
            int[] res = new int[i];
            for (int j = 0; j < res.length; ++j) {
                res[j] = intEvenNumbers[j];
            }
            return res;
        }

        static int[] oddOf(final String[] arr) {
            int[] intOddNumbers = new int[arr.length];
                int i = 0;
                for (String str: arr) {
                    if (!str.trim().isEmpty()) {
                        try {
                            int n = Integer.parseInt(str.trim());
                            if (n % 2 != 0) intOddNumbers[i++] = n;
                        } catch (NumberFormatException e) {
                            System.out.println("Целые числа введи! блять сука ты ёбаная!!!");
                        }
                    }
                }
            int[] res = new int[i];
            for (int j = 0; j < res.length; ++j) {
                res[j] = intOddNumbers[j];
            }
            return res;
        }
    }

    public static void main(String[] args) {

        // todo : STUDY0001-ввести с консоли N челых чисел и поместить их в массив. На консоль вывести:
        // 1. четные и нечетные числа
        // 2.
        try {
            System.out.print("\nввести с консоли N челых чисел:\t");
            String input = isbuffer.readLine(); System.out.println();
            final String[] strNumbers = input.trim().split(" ");
            System.out.println(Arrays.toString(Math.evenOf(strNumbers)));
            System.out.println(Arrays.toString(Math.oddOf(strNumbers)));

            isbuffer.close();
            isreader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
