public class Palindrome{
    public static void palindrome(String str) {

        for(int i=0;i<(str.length()-1)/2; i++){

            for(int j=str.length()-1; j<(str.length()-1)/2; j--){

                if(str.charAt(j)==str.charAt(i)){
                    System.out.println("The String Is Palindrome");
                }else{
                    System.out.println("The String Is not Palindrome ");
                }
            }
        }
    }
    public static void main(String[] args) {
        String str="abba";
   //     String REVS=palindrome(str);
       // System.out.println(palindrome(str));
       palindrome(str);
    }
}