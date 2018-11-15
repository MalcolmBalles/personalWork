package strings;

public class Essay {
private String name;
private String text;

	public Essay() {
		name = "joe bob";
		text = "dude you know that ishaan kid. Well, his mom is really...";
	}
	public Essay(String iname, String itext) {
		name = iname;
		text = itext;
	}
	public void setName(String iname) {
		name = iname;
	}
	public String getName() {
		return name;
	}
	public void setText(String itext) {
		text = itext;
	}
	public String getText() {
		return text;
	}
	public String getAuthorLastCap() {
		int space = name.indexOf(' ');
		String lastName = name.substring(space + 1);
		return lastName.toUpperCase();
	}
	public int firstNameChar() {
		return (name.length() - 1 - (name.length() - name.indexOf(' ') - 1));
	}
	public boolean nameX() {
		return name.contains("X");
	}
	public int wordCount() {
		int words = 1;
		for(int count = 0; count <= (text.length() - 1); count++) {
			if(text.charAt(count) == ' ') {
				words++;
			}
		}
		return words;
	}
	
}
