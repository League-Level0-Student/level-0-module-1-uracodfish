import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddleanswer = JOptionPane.showInputDialog("I am as light as a feather but no man can hold me for long. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddleanswer.equals("breath")) { 
	JOptionPane.showMessageDialog(null, score = score + 1);
}		// 5. Otherwise, say "wrong" and tell them the answer
else { JOptionPane.showMessageDialog(null, "breath");
		// 6. Add some more riddles
}
		// 2. Make a pop up to show the score.

	}
}
