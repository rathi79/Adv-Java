package com.xworkz.Apti;

public class StringMethod {
	public  String text;
	
	public StringMethod(String text) {
		
		this.text = text;
	}
	
	public static void main(String[] args) {
	
		System.out.println("******our own methods********");
		StringMethod myIndexof =new StringMethod("aabbccbdddxxxyyy");
		System.out.println("text.myIndexOf('c'): "+myIndexof.myIndexOf('c'));
		System.out.println("myIndexof.mysubString(2,5): "+myIndexof.mysubString(2,5));
		System.out.println("myIndexof.mySpit(\"#\",2): "+myIndexof.mySpit("#",2));
	}
	
	public  int myIndexOf(char ch)
	{
		char[] textch=text.toCharArray();
		int i=0;
		for(char c:textch) {
			if (c==ch) {
				return i;
			}
			else 
				i++;			
		}
		return -1;
	}
	
	
	public String mysubString(int start, int end) {
		
		char[] textch=text.toCharArray();
		char[] substr=new char[end-start+1];
		int j=0;
		for(int i=start; i<=end;i++) {
			if(i>=start && i<=end) {
				substr[j]= textch[i];
				j++;
			}
		}	
		return new String(substr);		
	}
	
	private String[] mySpit(char ch, int size) {
		String[] fnlStr=new String[size];
		int count=0;
		fnlStr[count]="";
		for(int i=0;i<text.length();i++) {
			fnlStr[count]=fnlStr[count]+text.charAt(i);
			if(text.charAt(i)==ch) {
				if(count<size-1) {
					count++;
					fnlStr[count]="";
				}
			}
				
			}
		return fnlStr;
	}
}

