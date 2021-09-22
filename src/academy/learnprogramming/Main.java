package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchValue = 5;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }
        // Create a new switch statement using char instead of int
        char switchChar = 'F';

        switch(switchChar){
            case 'A':
                System.out.println("Value was an A");
                break;
            case 'B':
                System.out.println("Value was an B");
                break;
            case 'C':
                System.out.println("Value was an C");
                break;
            case 'D':
                System.out.println("Value was an D");
                break;
            case 'E':
                System.out.println("Value was an E");
                break;
            default:
                System.out.println("Value was not found");
                break;
            char switchChar = 'F';

            switch(switchChar){
                case 'A':
                    System.out.println("Value was an A");
                    break;
                case 'B':
                    System.out.println("Value was an B");
                    break;
                case 'C':
                    System.out.println("Value was an C");
                    break;
                case 'D':
                    System.out.println("Value was an D");
                    break;
                case 'E':
                    System.out.println("Value was an E");
                    break;
                default:
                    System.out.println("Value was not found");
                    break;

                String switchString = "January";

                switch(switchString.toLowerCase()){
                    case "january":
                        System.out.println("Value was an January");
                        break;
                    case "february":
                        System.out.println("Value was an february");
                        break;
                    case "march":
                        System.out.println("Value was an march");
                        break;
                    case "may":
                        System.out.println("Value was an may");
                        break;
                    default:
                        System.out.println("Value was not found");
                        break;

        }

        // create a new char variable
        // ceate a switch statement testing for
        // A, B, C, D E
        // display a message if any of these are found and then break
        // add a defaultwhich displays a message saying not found.

    }
}
