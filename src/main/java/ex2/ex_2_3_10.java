package ex2;

/**
 * Created by alexey on 11.09.16.
 */


public class ex_2_3_10 {
    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
    String s = text.replaceAll( "[^a-zA-Z0-9]" , "").toUpperCase();
        StringBuilder sb = new StringBuilder(s);
        return  sb.toString().equals( sb.reverse().toString());

    }

    public static void main(String[] args) {

        if (isPalindrome("Madam, I'm Adam!") ) {
            System.out.println("passed");
        } else  {
            System.out.println("not passed");
        }


    }


}
