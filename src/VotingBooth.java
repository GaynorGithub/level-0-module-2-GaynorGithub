import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String howOld = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(howOld);
		if (age > 18) {
			JOptionPane.showInputDialog("Who do you think the next president should be?");
		} else if (age <= 18) {
			JOptionPane.showMessageDialog(null, "NOBODY CARES WHAT YOU THINK");
		}

	}
}
