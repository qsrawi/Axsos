import java.util.Random;

public class PuzzleJava {

    public int [] getTenRolls(){
        Random randMachine = new Random();
        int [] arr = new int[10];
        for(int i=0 ; i<arr.length;i++){
            arr[i] =randMachine.nextInt(20)+1;
        }
        return arr;
    }

    public char getRandomLetter(){
        Random randMachine = new Random();
        char [] arr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char randChar=arr[randMachine.nextInt(26)];
        return randChar;
    }

    public String generatePassword(){
        String str="";
        for(int i=0;i<8;i++){
            str +=this.getRandomLetter();
        }
        return str;
    }

    public String [] getNewPasswordSet(int len){
        String str="";
        String [] arr =new String[len];
        for(int x=0;x<=len;x++){
            for(int i=0;i<8;i++){
                str +=this.getRandomLetter();
            }
            arr[x]=str;
        
        }
        return arr;
    }


}