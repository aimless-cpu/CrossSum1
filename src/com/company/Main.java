package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i=0; i<1001;i++) {
            String numberAsString = Integer.toString(i);
            char[] numbers = numberAsString.toCharArray();

            int result = 0;

            /*for (int j=0; j< numbers.length;j++) { //wth is enhanced for?
                result = result + Character.getNumericValue(numbers[j]);
            }
            */
            for (char number : numbers) {
                result = result + Character.getNumericValue(number);
            }

            if (result==15) {
                System.out.println(i +" "+ result);
            }
        }

	// write your code here
    }
}
