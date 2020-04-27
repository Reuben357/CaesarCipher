import models.Cipher;
import models.Decipher;

import  models.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean programRunning = true;

        Cipher encrypt = new Cipher("", 0);
        Decipher decrypt = new Decipher("", 0);

        while (programRunning) {
            System.out.println("Welcome to Caesar's Cipher!");
            System.out.println("Encrypt");
            System.out.println("Decrypt");
            //String results = "";
            try {
                String choice = bufferedReader.readLine();
                if (choice.equals("Encrypt")) {
                    System.out.println("Enter message to be Encrypted");
                    String messageInput = bufferedReader.readLine();
                    System.out.println("Enter Shift Key");
                    String stringInputKey = bufferedReader.readLine();
                    int inputKey = Integer.parseInt(stringInputKey);

                    encrypt.setMessage(messageInput);
                    encrypt.setShiftKey(inputKey);
                    String encryptingResult = encrypt.messageInput();
                    //results = results + encrypt.messageInput();
                    System.out.println("Encrypted message:" + encryptingResult);
                    //System.out.println("Encrypted message:" + results);
                } else if (choice.equals("Decrypt")) {
                    System.out.println("Enter the message to decrypted");
                    String messageInput = bufferedReader.readLine();
                    System.out.println("Enter decrypting shift key");
                    String stringInputKey = bufferedReader.readLine();
                    int inputKey = Integer.parseInt(stringInputKey);

                    decrypt.setUserText(messageInput);
                    decrypt.setDecipherKey(inputKey);
                    String decryptingResult = decrypt.decipherUserText();
                    System.out.println("Decrypted message:" + decryptingResult);

                }
            else {
                System.out.println("Try again!");
            }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
