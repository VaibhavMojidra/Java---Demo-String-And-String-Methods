
public class Demo {
	public static void main(String[] args) {
		String s = "Hello";
		int len = s.length();
		System.out.println("Length of '"+s+"' is "+len);
		
		String s1=s.concat("World");
		System.out.println(s1);
		
		System.out.println(s.charAt(1));
		System.out.println(s.endsWith("lo"));
		System.out.println(s.indexOf("l"));
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s.replace("l","v"));
		System.out.println(s.startsWith("H"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}
}
