package models;

import java.util.ArrayList;
import java.util.List;

public class Cipher {
//    public Cipher CipherDetails = new Cipher( "",0);

    private String messageInput;
    private int shiftKey;
    private List<String> messageOutput = new ArrayList<String>();


    public Cipher(String messageInput, int shiftKey){
        this.messageInput= messageInput;
        this.shiftKey= shiftKey;

    }
    public String messageInput(){
        for (int i = 0; i < messageInput.length(); i++){
            if (Character.isUpperCase(messageInput.charAt(i))){
                int newCharValue = ((int)(messageInput.charAt(i)) + shiftKey-65) % 26 +65;
                char encryptedChar =(char)(newCharValue);
                String encryptedString = Character.toString(encryptedChar);
                messageOutput.add(encryptedString);
            }
            else if (Character.isLowerCase(messageInput.charAt(i))){
                int newCharValue = ((int)(messageInput.charAt(i))+ shiftKey -97)% 26 + 97;
                char encryptedChar = (char)(newCharValue);
                String encryptedString = Character.toString(encryptedChar);

                messageOutput.add(encryptedString);
            }
            else{
                String cipheredString = Character.toString(messageInput.charAt(i));
                messageOutput.add(cipheredString);
            }
        }
        return  String.join("",messageOutput);
    }
  public String getMessage(){
//        this.messageInput = Cipher.getMessage();
        return this.messageInput;
  }


    public int getShiftKey() {
//        this.shiftKey = Cipher.getShiftKey();
        return this.shiftKey;
    }

  public String setMessage(String messageInput){
        return  this.messageInput = messageInput;
  }
  public int setShiftKey(int shiftKey){
        return  this.shiftKey = shiftKey;
  }
}
