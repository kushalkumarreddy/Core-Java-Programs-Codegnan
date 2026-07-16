package If;

import java.util.Scanner;

public class DoorSecurity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				 System.out.print("Fingerprint Matched (true/false): ");
        boolean fingerprintMatched = sc.nextBoolean();

        System.out.print("Face Recognized (true/false): ");
        boolean faceRecognized = sc.nextBoolean();

        System.out.print("Enter Security PIN: ");
        int pin = sc.nextInt();

        int correctPin = 1234;

        if (fingerprintMatched) {
            if (faceRecognized) {
                if (pin == correctPin) {
                    System.out.println("Access Granted. Door Unlocked.");
                } else {
                    System.out.println("Access Denied. Incorrect PIN.");
                }
            } else {
                System.out.println("Access Denied. Face Recognition Failed.");
            }
        } else {
            System.out.println("Access Denied. Fingerprint Not Matched.");
        }

        sc.close();
	}

}
