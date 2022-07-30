public class RevString{
    public static String revstring(String str) {
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String str="abcd";
        String REVS=revstring(str);
        System.out.println(REVS);
    }
}