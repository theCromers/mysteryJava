package lab9q1_3;

public class MysteryWho {
	public static void main (String [] args) {
		String whom = "her";
		String who = "him";
		String it = "who";
		String he = "it";
		String she = "whom";
		
		sentence(he, she, it);
		sentence(she, he, who);
		sentence(who, she,who);
		sentence(it, "stu", "boo");
		sentence(it, whom, who);
		}
	public static void sentence(String she, String who, String whom) {
		System.out.println(who + " and " + whom + " like " + she);
	}
}
