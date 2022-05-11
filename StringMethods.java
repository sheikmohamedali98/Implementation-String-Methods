package StringMethod;

import java.util.ArrayList;



public class StringMethods implements MethodsInterface
{
	//private static final Exception NullPointerException = null;
	private String str;
/* common 
 * get String 
 * cover to char array	
	*/
	public StringMethods(String str){
		this.str = str;
	}
	
	
	//1.String Character return index value
	public char myCharAt(int index)
	{	
		char[] arr = myToCharArray();

		if(index < 0||index >= this.myLength() )
		{
			throw new StringIndexOutOfBoundsException(index);
		}
		return arr[index];
	}
	
	
	//2.string  length return total length of string
	public int myLength(){
		char[] arr = myToCharArray();
		int count = 0;
		
	for(int c:arr){
		count++;
	}
		return count;
	}
	
	
	//3.String SubString return String start to end-1
	public String mySubString(int startindex,int endindex){
		
		char[] arr = new char[this.myLength()];
		arr = myToCharArray();
		String str1 = "";
		if(startindex<0){
			throw new StringIndexOutOfBoundsException(startindex);
		}
		if(endindex>this.myLength()){
			
			throw new StringIndexOutOfBoundsException(endindex);

		}
		int sublen = endindex - startindex;
		if(sublen<0){
			throw new StringIndexOutOfBoundsException(sublen);
		}
		for(int j = startindex;j<endindex;j++){
			str1 += arr[j];
		}
		 
		return str1;
	}
	
	//4.String concat add or append two String
	public String myConcat(String str1)
	{
		int str1len = str1.length();
		if(str1len == 0){
			return this.str;
		}
		String str3 = str+str1; 
	  return str3;
	}
	

	// 5.String isempty return Boolean
	public boolean myIsEmpty(){
		if(this.myLength() == 0){
			return true;
		}
		return false;
	}
	
	
	
	
	

	/*6.String compareTo
	 * if s1>s2 return  passitive
	 * if s1<s2 return negative
	 * if s1==s2 return 0 */
	public int myCompareTo(String str1){
		
		int len1 =myLength();
		int len2 = str1.length() ;
		char[] charr1 =myToCharArray();
		char[] charr2 = str1.toCharArray() ;
		int limit = Math.min(len1, len2);
		int i=0;
		while(i<limit)
		{
		char ch1 = charr1[i];
		char ch2 = charr2[i];
	    if(ch1!=ch2)
	    {
		return ch1-ch2;
	    }
	    i++;
		}
		return len1-len2;
}
	
	 
	//7.String Lowercase return String full of lower case

	public String myToLowerCase(){
		char[] arr = myToCharArray();
		int len = myLength();
		if(len == 0){
			throw new NullPointerException();
			
		}
		for(int i=0;i<len;i++){
			if(arr[i]>='A'&&arr[i]<='Z'){
				arr[i] = (char )((int)arr[i]+32);
			}
		}
		String str2 = new String(arr);
		return str2;
	}
	
	//8.String Upper Case return String full of Upper Case
	
	public String myToUpperCase(){
		char[] arr = myToCharArray();
		int len = myLength();
	
		if(len == 0){
			throw new NullPointerException();
			
		}
		for(int i=0;i<len;i++){
			if(arr[i]>='a'&&arr[i]<='z'){
				arr[i] = (char )(arr[i]-32);
			}
		}
		String str2 = new String(arr);
		return str2;
	}
	
	
	//9.String Trim return cut the spaces at end and start 
	public String myTrim(){
		char[] arr = myToCharArray();
         String str2 = "";
		int last = myLength();
		int start = 0;
			
		while((start<last) && (arr[start] == ' ')){
			start++;
		}
		while ((start>last)&&(arr[last-1] == ' ')){
			last--;
		}
		//char[] str2 = arr;
		if(start>0||last<myLength()){
			for(int i = start;i<last-1;i++){
				str2 += arr[i];		
			}
		}
		return str2;
	}
	
	
	
	
	//10. String tostring  return string
	public  String myToString(char[] ch){
		String str = new String(ch);
		return str;
	}

	/*11.String IndexOf
	 * passing Character
	 * passing string
	 * passing char and index
	 * */
	@Override
	public int myIndexOf(char ch) {
		
		char[] arr =  myToCharArray();
		for(int index =0;index<myLength();index++){
			if(ch== arr[index]){
				return index;
			}
		}
		return -1;
	}

//12. String is convert to Array return array
	@Override
	public char[] myToCharArray() {
		
		
		char[] arr = new char[myLength()];
		for(int i=0;i<(myLength());i++){
		arr[i] += str.charAt(i);
			
		}
	//System.out.print(arr);
		return arr;
		
	}

	
	//13.String start with return boolean

	@Override
	public boolean myStartWith(String prefix) {
		
		return startWith(prefix ,0);
	}

	

	private boolean startWith(String prefix, int i) {
		char[] ch1 = myToCharArray();
		char[] ch2 = prefix.toCharArray();
		int start = 0;
		int last = prefix.length();
		if((i<0)||(i>myLength()-last)){
			return false;
		}
		while(--last>=0){
			if(ch1[i++]!=ch2[last--]){
				return false;
			}
		}
		return true;
	}


	//15.String Replace one char to another char

	@Override
	public String myReplace(char ch1, char ch2) {
		char[] arr = myToCharArray();
		
		for(int i=0;i<myLength();i++){
			if(arr[i]==ch1){
				arr[i] = ch2;
			}
			
		}
		String str2 = new String(arr);
        return str2;
	}

	//16.String split  

	@Override
	public String[] mySplit(String str1) {
		String[] store = new String[myLength()];
		char ch1;
		char ch2;
 	int count = 0;
 	//ArrayList<String> word = new ArrayList<String>();
		for(int i=0;i<myLength();i++){
			store[i] = "";
		}
		
		for(int j=0;j<myLength();j++){
			ch1 = myCharAt(j);
			ch2 = str1.charAt(0);
			if(!(ch1 ==ch2)){
				
			store[count] +=""+ myCharAt(j);
			}
			else{
				count++;
				store[count] = ""+myCharAt(j);
			   
			}
			
			//System.out.println(store);
		}
	
		return store;

	}

//17.String Hashcode return int value
	@Override
	public int  myHashCode() {
		int sum = 0;
		char[] ch1 = myToCharArray();
		int len = myLength();
		for(int i=1;i<=len;i++){
			int ascii = (char)ch1[i];
			sum += ascii*Math.pow(31, len-i);
		}
		return sum;
	}

     //18.String Endwith char return boolean
	public boolean myEndsWith(String suffix) {
		return startWith(suffix, myLength() -suffix.length());
	}


	
//19. object is convert into String  return String
	@Override
	public String myValueOf(Object obj) {
		//StringMethods s = new StringMethods();
		return (obj == null)? null : obj.toString();
	}

	//20.String Equals return boolean

	@Override
	public boolean myEquals(Object obj) {
		if( this == obj ){
			return true;
		}
		if(obj instanceof String){
			String str1 = (String)obj;//another String or any 
			int len = this.myLength();
			if(this.myLength() == str1.length()){
				char[] charr1 = myToCharArray();
				char[] charr2 = str1.toCharArray() ;
				int i = 0;
				while(len--!=0){
					if(charr1[i]!=charr2[i]){
						return false;
					}
					i++;
				}
				return true;
			}
		}
		return false;
	}


	


	
}