import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		String out;
		System.out.print("Input a sentence: ");
		out = input.nextLine();
		System.out.println(out.contains("on"));
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		String mango;
		System.out.print("Input the word mango: ");
		mango = input.nextLine();
		mango = mango.toLowerCase();
		mango = mango.trim();
		System.out.println(mango.equals("mango"));
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		String word;
		String letter;
		System.out.print("Input a word: ");
		word = input.nextLine();
		System.out.print("Input a letter: ");
		letter = input.nextLine();
		System.out.println(word.indexOf(letter));
		System.out.println(word.lastIndexOf(letter));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		String length;
		System.out.print("Input a sentence: ");
		length = input.nextLine();
		System.out.println("Your sentence is " + length.length() + " characters long");

	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		String sen;
		String word;
		String replace;
		System.out.print("Input a sentence: ");
		sen = input.nextLine();
		System.out.print("Input a word to replace: ");
		word = input.nextLine();
		System.out.print("What word would you like to replace it with: ");
		replace = input.nextLine();
		sen = sen.replaceAll(word, replace);
		System.out.println(sen);


		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner input = new Scanner(System.in);
		String sen;
		String upsen;
		String downsen;
		System.out.print("Input a sentence: ");
		sen = input.nextLine();
		upsen = sen.toUpperCase();
		downsen = sen.toLowerCase();
		System.out.println(upsen.trim());
		System.out.println(downsen.trim());

	}

	public static void q7() {
		//Write question 7 code here
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Input a word: ");
		word = input.nextLine();
		System.out.println(word.substring(0,4));
		System.out.println(word.substring(word.length()-4));
	}

	public static void q8() {
		//Write question 8 code here
	}

}
