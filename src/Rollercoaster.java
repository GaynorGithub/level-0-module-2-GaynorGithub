import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		int tallEnough = 0;
		for (int i = 0; tallEnough == 0; i++) {
			String height = JOptionPane.showInputDialog("How tall are you? (Inches)");
			try {
				tallEnough = Integer.parseInt(height);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "I cannot accept this answer. Please try again.");

			}
			if (tallEnough > 0) {
				if (tallEnough > 48) {
					JOptionPane.showMessageDialog(null, "You can go on the rollercoaster");
				} else if (tallEnough <= 48) {
					JOptionPane.showMessageDialog(null, "You are too small. You cannot go on the rollercoaster.");
				}
			}

		}

	}
}
