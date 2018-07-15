package interview;

public class Regexprog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text = "Abvf eg   erg 3()45 (    ) aeg $%";
System.out.println("Original text is = "+text);
/*String text1=text.replaceAll("[^a-zA-Z]", "");
System.out.println("Alphabets only ="+text1);
String text2=text.replaceAll("[^0-9]", "");
System.out.println("Numbers only ="+text2);
String text3=text.replaceAll("[a-zA-Z0-9]", "");
text3=text3.replaceAll("\\s", "");
System.out.println("Special char only = "+text3);*/

String textNew=text.replaceAll("[\\s]{1,}", " ");
System.out.println("new test ="+textNew);
	}

}
