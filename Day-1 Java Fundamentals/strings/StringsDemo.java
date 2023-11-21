package com.logical.coding.strings;

public class StringsDemo {
	
	String firstString = "madam";
	String secondString = "madam";
	
	char[] firstArray = new char[firstString.length()];
	char [] secondArray = new char[firstString.length()];
	char [] thirdArray = new char[secondString.length()];
	
	
	public void checkTwoStringReversetoEach() {
		
		firstString.getChars(0, firstArray.length, firstArray, 0);
		secondString.getChars(0, secondString.length(), thirdArray, 0);
		System.out.println(firstArray);
		System.out.println(thirdArray);
		for(int i=0;i<firstString.length();i++) {
			secondArray[i] = firstArray[firstArray.length-1-i];
		}
		System.out.println(secondArray);
		for(int i=0;i<firstString.length();i++) {
			if(secondArray[i] == thirdArray[i]){
				System.out.println("Yes the string is reverse of the other");
				break;
			}
			else {
				System.out.println("No it is not reverse of the other");
				break;
			}
		}
			
	}
	
	public void checkUsingStringBuilder() {
		StringBuilder builder = new StringBuilder(firstString);
//		builder.append(firstString);
		builder.reverse();
		System.out.println(builder);
		StringBuilder builder2 = new StringBuilder(secondString);
//		builder2.append(secondString);
		System.out.println(builder2);
		if(builder2.toString().equals(builder.toString())) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	
	public void findUniqueCharacterInString() {
		String newString = "Reversing an array";
		int len = newString.length();
	    for(int i=0;i<len;i++) {
	    	int count=0;
	    	for(int j=0;j<len;j++) {
	    		if(newString.charAt(i) == newString.charAt(j) && i != j) {
	    			count++;
	    			break;
	    		}
	    	}
	    	if(count==0){
	    		System.out.println(newString.charAt(i));
	    	}
	    }	
	}
	
	public void checkCharacterInString() {
		String aString = "Reversing an array";
		char checkChar = 'R';
		int i = aString.indexOf(checkChar);
		if(i>=0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	
	public void checkForVowel() {
		String aString = "ok";
		if(aString.contains("a") ||aString.contains("e") || aString.contains("i") || aString.contains("o") ||aString.contains("u")){
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
	
	public void removeWhitespaces() {
		String aString = "sum of the two previous numbers";
		System.out.println(aString.replace(" ", ""));
	}
	
	public void removeTrailingleadingSpace() {
		String aString = "   sum of the two previous numbers    ";
		System.out.print(aString);
		System.out.println("hello");
		System.out.print(aString.trim());
		System.out.println("hello");
	}
	

}
