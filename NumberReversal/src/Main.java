import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        int arrayIndex = 5;
        int[] numberList = new int[5];
        int y = 0;
        int[] tempArray = new int[6 + 1];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Indtast et tal. Når du er færdig med at indtaste tal, så tast -1");
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            numberList[y] = input;
            y++;
            if (y == numberList.length) {

                System.out.println("Resize needed!");
                for (int x = 0; x > y; x++) {
                    tempArray[x] = numberList[x];
                    System.out.println("båp");
                    System.out.println(tempArray[x]);
                }
                numberList = new int[numberList.length + 10];
                tempArray = new int[tempArray.length + 10];
                for (int x = 0; numberList.length > x; x++) {
                    numberList[y] = tempArray[y];

                }


            }
        }
        int a = y;
        for (int x = 0;a > x; x++){
            System.out.println(numberList[a]);
            a--;
        }
    }
}

/*
 For a given input number, return the number in reverse. So, an input of 3956 should return 6593.
 */


