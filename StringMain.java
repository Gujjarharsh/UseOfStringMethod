package usageOfString;
import java.util.Scanner;
public class StringMain {
	public static void main(String[] args) {
		UseOfDifferentInBuilt obj=new UseOfDifferentInBuilt();
		while(true) {
			System.out.println();
			System.out.println("According your need enter the choice which refers as:");
			System.out.println("1.Use of length() method");
			System.out.println("2.Use of toLowerCase() method");
			System.out.println("3.Use of toUppercase() method");
			System.out.println("4.Use of charAt() method");
			System.out.println("5.Use of concat() method");
			System.out.println("6.Use of split() method");
			System.out.println("7.Use of equals() method");
			System.out.println("8.Use of equalsIgnoreCase() method");
			System.out.println("9.Use of compareTo() method");
			System.out.println("10.Use of compareToIgnoreCase() method");
			System.out.println("11.Use of Trim() method");
			System.out.println("12.Use of getBytes() method");
			System.out.println("13.Use of toCharArray() method");
			System.out.println("14.for exit");
			System.out.println();

			System.out.println("enter the choice for which method do you want to used");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice) {
			case 1:obj.useOFlengthInBuilt();
			break;
			case 2:obj.useOfLowercase();
			break;
			case 3:obj.useOfUppercase();
			break;
			case 4:obj.useOfCharAt();
			break;
			case 5:obj.useOfConcat();
			break;
			case 6:obj.useOfSplit();
			break;
			case 7:obj.useofEquals();
			break;
			case 8:obj.useOfEqualsIgnoreCase();
			break;
			case 9:obj.useOfCompareTo();
			break;
			case 10:obj.useOfCompareToIgnoreCase();
			break;
			case 11:obj.useOfTrim();
			break;
			case 12:obj.useOfGetBytes();
			break;
			case 13:obj.useOfCharArray();
			break;
			case 14:System.out.println("exit successfully");
			return;
			default:System.out.println("Invalid choice");
			break;
			}
		}
	}

}
