package StringMethod;

import java.util.Scanner;
public class StringController {

	public static void main(String[] args) {
//Scanner in = new Scanner(System.in);
//System.out.println("enter the String:");
//String str = in.nextLine();
//StringMethods st = new StringMethods( str);
//char c = st.charAt(5);
//System.out.println(c);
		// if you want to give input from user through scanner 
		int a = 100;
String str = " Sheik-mohamed-ali ";
String prefix = "S";
String suffix = "ali";

String str1 = " Work In ZOHO ";
char[] arr = str.toCharArray();
StringMethods strm = new StringMethods(str);

char ch = strm.myCharAt(3);
int len = strm.myLength();
System.out.println(str);

System.out.println("StartWith : "+strm.myStartWith(prefix));
System.out.println("End With : "+strm.myEndsWith(suffix));
System.out.println("HashCode : "+strm.hashCode());
System.out.println("Replace : "+strm.myReplace('a', 'l'));
System.out.println("SubString : "+strm.mySubString(2, 9));
System.out.println("Equal : "+strm.myEquals(str1));
System.out.println("Concat : "+strm.myConcat(str1));
System.out.println("IndexOf : "+strm.myIndexOf('h'));
System.out.println("IsEmpty : "+strm.myIsEmpty());
System.out.println("ToUpperCase : "+strm.myToUpperCase());
System.out.println("Split : "+Arrays.toString(strm.mySplit("-")));
System.out.println("CompareTo : "+strm.myCompareTo(str1));
System.out.println("ToLowerCase : "+strm.myToLowerCase());
System.out.println("ToString : "+strm.myToString(arr));
System.out.println("CharAt : "+strm.myCharAt(3));
System.out.println("Length : "+strm.myLength());
System.out.println("CharArray : "+Arrays.toString(strm.myToCharArray()));
System.out.println("Trim :"+strm.myTrim());
System.out.println("ValueOf : "+strm.myValueOf(a));
	}

}
