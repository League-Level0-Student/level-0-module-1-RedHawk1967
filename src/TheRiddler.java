import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int number = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String awnser = JOptionPane.showInputDialog(
				"Here's a riddle A dad and his son were riding their bikes and crashed. Two ambulances came and took them to different hospitals. The man’s son was in the operating room and the doctor said, “I can’t operate on you. You’re my son.”\n"
						+ "Who is the doctor?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		JOptionPane.showMessageDialog(null, "The Doctor is his mom");
		// 5. Otherwise, say "wrong" and tell them the answer
		if (awnser.equalsIgnoreCase("the doctor is his mom")) {
			number++;
			JOptionPane.showMessageDialog(null,
					"nice,                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  DID YOU CHEAT     ");
			JOptionPane.showMessageDialog(null, "Score:" + number);
		} else {
			JOptionPane.showMessageDialog(null, "Wrong"); JOptionPane.showMessageDialog(null, "Score:" + number);
		}
		// 6. Add some more riddles
		String awnser2 = JOptionPane.showInputDialog(null,
				"In a one-story pink house, there was a pink person, a pink cat, a pink fish, a pink computer, a pink chair, a pink table, a pink telephone, a pink shower– everything was pink!\n"
						+ "What color were the stairs?");
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "There were no stairs");
		if (awnser2.equalsIgnoreCase("There were no stairs")) {
			number++;
			JOptionPane.showMessageDialog(null, "Nice you got it");
			JOptionPane.showMessageDialog(null, "Score:" + number);

		} else {
			JOptionPane.showMessageDialog(null, "Wrong"); JOptionPane.showMessageDialog(null, "Score:" + number);
		}

	}
}
