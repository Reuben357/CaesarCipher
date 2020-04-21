package models;

import java.util.ArrayList;
import java.util.List;

public class Decipher {
    private String userText;
    private int decipherKey;
    private List<String> decipheredOutput = new ArrayList<String>();

    public Decipher(String userText, int decipherKey){
        this.userText = userText;
        this.decipherKey = decipherKey;
    }
    public String decipherUserText(){
        for (int r = 0; r < userText.length(); r++){
            if (Character.isUpperCase(userText.charAt(r))){
                int newCharValue = ((int)(userText.charAt(r)) + decipherKey-65) % 26 +65;
                char decryptedChar =(char)(newCharValue);
                String decryptedString = Character.toString(decryptedChar);
                decipheredOutput.add(decryptedString);
            }
            else if (Character.isLowerCase(userText.charAt(r))){
                int newCharValue = ((int)(userText.charAt(r))+ decipherKey -97)% 26 + 97;
                char decryptedChar = (char)(newCharValue);
                String decryptedString = Character.toString(decryptedChar);

                decipheredOutput.add(decryptedString);
            }
            else{
                String decipheredString = Character.toString(userText.charAt(r));
                decipheredOutput.add(decipheredString);
            }
        }
        return  String.join("",decipheredOutput);
    }

    public String getUserText() {
        return this.userText;
    }

    public void setUserText(String userText) {
        this.userText = userText;
    }

    public int getDecipherKey() {
        return this.decipherKey;
    }

    public void setDecipherKey(int decipherKey) {
        this.decipherKey = decipherKey;
    }
}
