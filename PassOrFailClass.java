package PassOrFailClass;

import java.util.Scanner;

public class PassOrFailClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maths, physics, turkish, chemistry, music, total = 0, counter = 0;
        double average;

        System.out.print("Your math grade: ");
        maths = scanner.nextInt();
        if ((maths < 0) || (maths > 100)) {
            counter += 0;
        } else {
            total += maths;
            counter++;
        }

        System.out.print("Your Physics grade: ");
        physics = scanner.nextInt();
        if ((physics < 0) || (physics > 100)) {
            counter += 0;
        } else {
            total += physics;
            counter++;
        }

        System.out.print("Your Turkish grade: ");
        turkish = scanner.nextInt();
        if ((turkish < 0) || (turkish > 100)) {
            counter += 0;
        } else {
            total += turkish;
            counter++;
        }

        System.out.print("Your Chemistry grade: ");
        chemistry = scanner.nextInt();
        if ((chemistry < 0) || (chemistry > 100)) {
            counter += 0;
        } else {
            total += chemistry;
            counter++;
        }

        System.out.print("Your Music grade: ");
        music = scanner.nextInt();
        if ((music < 0) || (music > 100)) {
            counter += 0;
        } else {
            total += music;
            counter++;
        }
        scanner.close();

        average = total / counter;

        if (average < 55) {
            System.out.println("You failed the class.");
        } else {
            System.out.println("You passed the class.");
        }
        System.out.println("Your average grade: " + average);

    }
}
