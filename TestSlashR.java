class TestSlashR{
    public static void main(String[] args){
	System.out.println("abcdef\bgh");//abcdegh
        System.out.println("abcdef\rgh");//;ghcdef
	System.out.println("abc\bdefgh");//abdefgh
	System.out.println("abc\b\bdefgh");//adcefgh
	System.out.println("abcdefg\b\bh");//abcdehg
	System.out.println("abcdefg\b\b\b\bh");//abchefg
	System.out.println("abcde\b\b\b\bfgh");afghe
    }
}
