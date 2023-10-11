package comSnoA19.harsha.StringClass_ItsMethods;

import java.util.Arrays;

public class StringMethodPractice
{
	public static void main(String[] args) {
		final String s1 = "Hello";
		final String s2 = "hello";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println();

		System.out.println(s1.contains("lo"));
		System.out.println(s1.contains("sup"));
		System.out.println();

		System.out.println(s1.startsWith("el"));
		System.out.println(s1.startsWith("He"));
		System.out.println();

		System.out.println(s2.endsWith("He"));
		System.out.println(s2.endsWith("lo"));
		System.out.println();

		System.out.println(s1.length());
		System.out.println();

		String trim = " Hello World  ";
		System.out.println(trim.length());
		System.out.println(trim.trim().length());
		System.out.println(trim);
		System.out.println(trim.trim());
		System.out.println();

		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println();

		char[] a = trim.toCharArray();
		System.out.println(a);

		String split = "Hello world how are you guys doing?";
		System.out.println(Arrays.toString(split.split(" ")));

		String split2 = "Hello^world h^ow are you g^uys doing?";
		System.out.println(Arrays.toString(split2.split("\\^")));
		System.out.println();

		System.out.println(trim.indexOf("r"));
		System.out.println(trim.lastIndexOf("o"));
		System.out.println();

		System.out.println(trim.charAt(7));
		System.out.println();

		System.out.println(split.replace("how", "when"));
		System.out.println();

		System.out.println(trim.substring(2, 5));
		System.out.println(trim.substring(2));
		System.out.println();

		String str = "178";
		System.out.println(String.valueOf(Integer.valueOf(str)));
		int i = Integer.valueOf(str);
		System.out.println(i);
		System.out.println();

		int j = 789563;
		String s3 = String.valueOf(j);
		System.out.println(s3);
		System.out.println();

		String s4 = "  ";
		System.out.println(s4.length());
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());
		System.out.println();
	}
}

