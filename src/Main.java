import java.util.Scanner;

public class Main {
    //part of question 8
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        //שאלה 1
         System.out.println("Hello World!");

        //שאלה 2
        Scanner scanner = new Scanner(System.in);

        System.out.print("הכנס מספר ראשון: ");
        int num = scanner.nextInt();

        System.out.print("הכנס מספר שני: ");
        int num1 = scanner.nextInt();

        System.out.println("חיבור: " + (num1 + num));
        System.out.println("חיסור: " + (num1 - num));
        System.out.println("כפל: " + (num1 * num));
        System.out.println("חילוק: " + ((double) num1 / num));


        //שאלה 3
        System.out.println("תרשום מספר שלם");
        int num2 = scanner.nextInt();

        if (num2%2==0){
            System.out.println(num + " הוא מספר זוגי");
        }
        else{
            System.out.println(num + " הוא מספר  אי זוגי");
        }
        //שאלה 4
        System.out.println("תרשום מספר 1");
        int num3 = scanner.nextInt();
        System.out.println("תרשום מספר 2");
        int num4 = scanner.nextInt();
        System.out.println("תרשום מספר 3");
        int num5 = scanner.nextInt();

        System.out.println((num3+num4+num5)/3);


        //שאלה 5


        System.out.println("תרשום את הציון שלך");
        int num6 = scanner.nextInt();

        if (num6 > 90){
            System.out.println("מצוין");
        }
        else if (num6 < 90 && num6 > 80){
            System.out.println("טוב מאוד");
        }
        else if (num6 > 70 && num6 < 80){
            System.out.println("טוב");
        }
        else if (num6 < 70){
            System.out.println("נכשל");
        }

        //שאלה 6

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //שאלה 7


        System.out.println("תרשום מספר");
        int num7 = scanner.nextInt();

        while(num7 >= 0){
            System.out.println(num7);
            num7--;
        }


        //שאלה 8

        System.out.println("enter a num");
        int num8 = scanner.nextInt();
        System.out.println("enter a num");
        int num9 = scanner.nextInt();
        System.out.println("result is " + addNumbers(num8, num9));

        //שאלה 10

        int[] arr = new int[] {5,2,6,3,4};
        for (int j =0;j<arr.length;j++)
        {
            System.out.println("num in place: " + j + " is: " + arr[j]);
        }

    }
}