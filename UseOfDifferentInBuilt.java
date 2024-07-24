package usageOfString;

public class UseOfDifferentInBuilt {
	String s1="Harsh";
	String s2="Tawar";
	String s3=" I am Harsh Tawar ";
	void useOFlengthInBuilt() {
		System.out.println("The length of s1 string (Harsh) t:" + s1.length());
		System.out.println("The length of s2 string (Tawar) :" + s2.length());

	}

	void useOfLowercase() {
		System.out.println("Before use of toLowerCase String s1 (Harsh) is:" +s1);
		System.out.println("After use toLowerCase String s1 is:"+s1.toLowerCase());
	}
	void useOfUppercase() {
		System.out.println("Before use of toUpperCase String s1 (Harsh) is:" +s1);
		System.out.println("After use toUpperCase String s1 is:"+s1.toUpperCase());
	}
	void useOfCharAt() {
		System.out.println("The charAt(i) returns character at index ith position in s1(Harsh) for i=1 is:"+s1.charAt(0));
	}
	void useOfConcat() {
		System.out.println("The concat method for  string s1(Harsh) and s2 (Tawar)is:"+ s1.concat(s2));
	}
	void useOfSplit() {
		String []arr=s3.split(" ");
		System.out.println("The split method for string 'I am  Harsh tawar' is look like");
		for(String a:arr){
			System.out.println(a+" ");

		}
		System.out.println();
	}
	void useOfCompareTo() {
		System.out.println("The compareTo method between string s1(Harsh) and s2(Tawar):"+s1.compareTo(s2));
	}
	void useOfCompareToIgnoreCase() {
		System.out.println("The compareToIgnoreCase method between string s1(Harsh) and s2(Tawar):"+s1.compareToIgnoreCase(s2));
	}
	void useofEquals() {
		System.out.println("The equals method between string s1(Harsh) and s2 (Tawar) :"+s1.equals(s2));
	}
	void useOfEqualsIgnoreCase() {
		System.out.println("The equalsIgnoreCase method between s1 and s2 returns: "+s1.equalsIgnoreCase(s2));
	}
	void useOfTrim(){
		System.out.println("Trim method remove white space from given String like:"+s3.trim());
	}
	void useOfCharArray() {
		char arr[]=s1.toCharArray();
		System.out.println();
		System.out.println(" The tocharArray method for string 'Harsh' is work as");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");


		}
	}
	void useOfGetBytes() {
		byte[] arr=s1.getBytes();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]
					);
		}
	}


}
