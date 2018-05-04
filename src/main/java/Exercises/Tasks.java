package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tasks {
    private static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    static class FirstTask {
        public static void main(String[] args) {
            int s;
            for (int i = 1; i <= 10; i++) {
                s = 8 * i;
                System.out.println("8 x " + i + " = " + s);
            }
        }
    }

    static class SecondTask {
        public static void main(String[] args) throws IOException {
            System.out.print("Input decimal number: ");
            int decimal = Integer.parseInt(reader.readLine());
            System.out.println("Hexadecimal number is: " +
                    Integer.toHexString(decimal).toUpperCase());
        }
    }

    // Second task without Java utils
    static class SecondTaskTwo {
        public static void main(String[] args) throws IOException {
            int decimal, temp;
            StringBuilder hexadecimal = new StringBuilder(" ");
            char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            System.out.print("Input decimal number: ");
            decimal = Integer.parseInt(reader.readLine());
            while (decimal > 0) {
                temp = decimal % 16;
                hexadecimal.insert(0, hex[temp]);
                decimal = decimal / 16;
            }
            System.out.println("Hexadecimal number is: " + hexadecimal + "\n");
        }
    }

    static class ThirdTask {
        public static void main(String[] args) throws IOException {
            int firstInt, secondInt;
            System.out.print("Input first integer: ");
            firstInt = Integer.parseInt(reader.readLine());
            System.out.print("Input second integer: ");
            secondInt = Integer.parseInt(reader.readLine());
            if (firstInt == secondInt) {
                System.out.println(firstInt + " == " + secondInt);
            }
            if (firstInt != secondInt) {
                System.out.println(firstInt + " != " + secondInt);
            }
            if (firstInt < secondInt) {
                System.out.println(firstInt + " < " + secondInt);
            }
            if (firstInt <= secondInt) {
                System.out.println(firstInt + " <= " + secondInt);
            }
            if (firstInt > secondInt) {
                System.out.println(firstInt + " > " + secondInt);
            }
            if (firstInt >= secondInt) {
                System.out.println(firstInt + " >= " + secondInt);
            }
        }
    }

    static class FourthTask {
        public static void main(String[] args) throws IOException {
            int numberOfSides, sideLength;
            System.out.print("Input the number of sides on the polygon: ");
            numberOfSides = Integer.parseInt(reader.readLine());
            System.out.print("Input the length of one of the sides: ");
            sideLength = Integer.parseInt(reader.readLine());
            System.out.println("The area is: " +
                    polygonArea(numberOfSides, sideLength));
        }

        private static double polygonArea(int numberOfSides, int sideLength) {
            return (numberOfSides * Math.pow(sideLength, 2)) /
                    (4 * Math.tan(Math.PI / numberOfSides));
        }
    }
}


