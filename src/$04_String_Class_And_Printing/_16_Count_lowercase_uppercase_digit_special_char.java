package $04_String_Class_And_Printing;
import java.util.Scanner;

public class _16_Count_lowercase_uppercase_digit_special_char {
    public static void main(String[] args) {

        // count lowercase, uppercase and special characters in string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string with lower, upper, digit and special char : ");
        String str = input.nextLine();
        input.close();

        int lower_count = 0, upper_count = 0, digit_count = 0, special_count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                lower_count++;
            }else if(ch >= 'A' && ch <= 'Z'){
                upper_count++;
            }else if(ch >= '0' && ch <= '9'){
                digit_count++;
            }else{
                special_count++;
            }
        }

        System.out.println("Lowercase characters : " + lower_count);
        System.out.println("Uppercase characters : " + upper_count);
        System.out.println("Digit characters     : " + digit_count);
        System.out.println("Special characters   : " + special_count);
    }
}
