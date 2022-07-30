import java.util.Scanner;

public class countwords{
    public static int countWords(String str) {
        if(str.length()==0){
            return 0;
        }
        int spaces=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== " "){
                ++spaces;
            }
        }
    }
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      countwords(str);
    }
}