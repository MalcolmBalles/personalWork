package strings;
import java.util.Scanner;
public class TestEssay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Essay essay = new Essay();
		System.out.println("what is your name?");
		essay.setName(input.nextLine());
		System.out.println("type an essay");
		essay.setText(input.nextLine());
		System.out.println(essay.getName());
		System.out.println(essay.getText());
		System.out.println(essay.getAuthorLastCap());
		System.out.println(essay.firstNameChar());
		System.out.println(essay.nameX());
		System.out.println(essay.wordCount());





	}

}
