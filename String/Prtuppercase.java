package String;
import java.util.*;
public class Prtuppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
        for(int i=0;i<str.length();i++) {
        	if(Character.isUpperCase(str.charAt(i))) {
        		System.out.print(str.charAt(i));
        	}
        }
	}

}
