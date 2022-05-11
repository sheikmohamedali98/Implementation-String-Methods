package StringMethod;


//
interface MethodsInterface 
{
	 char myCharAt(int index);
	 int myLength();
	
	 int myIndexOf(char ch);
 	 int myCompareTo(String str);
 	 int myHashCode();
 	 
 	 char[] myToCharArray();
 	 
 	 String myValueOf(Object obj);

     boolean myEquals(Object obj);
 	 boolean myIsEmpty();
 	 boolean myStartWith(String prefix);
 	 boolean myEndsWith(String suffix);
 	
 	 
 	 String mySubString(int startindex,int endindex);
	 String myConcat(String str);
     String myToLowerCase();
     String myToUpperCase();
     String myTrim();
     String myReplace(char ch1,char ch2);
     String myToString(char[] ch);
	String[] mySplit(String str);
   
 }
