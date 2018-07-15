package interview;

public class strrev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TEch 1");
		String name="Santthosh";
		for(int i=name.length()-1;i>=0;i--) {
			//System.out.println("for1");
			System.out.print(name.charAt(i));
		}

		System.out.println("\nTech 2");
		char[] tempCharArray = name.toCharArray();
String var=new String();
		for (char c : tempCharArray) {
	var = c+var;
	
}
		//svar.
		System.out.println("var = " + var);
		for(int i=tempCharArray.length-1;i>=0;i--) {
			System.out.print(tempCharArray[i]);
		}
		System.out.println("");
		System.out.println("Tech 3");
		StringBuilder build=new StringBuilder(name);
		StringBuilder rev = build.reverse();
		System.out.println(rev);

	}

}
