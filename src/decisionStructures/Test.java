package decisionStructures;
import java.*;
import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForbiddenClass dont = new ForbiddenClass();
		for(int x=0;x>-1;x++) {
			File file = new File("file"+x);
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
