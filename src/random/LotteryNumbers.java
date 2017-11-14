package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		int ticketOne = new Random().nextInt(90000) + 9999;
		int ticketTwo = new Random().nextInt(90000) + 9999;
		int ticketThree = new Random().nextInt(90000) + 9999;
		int ticketFour = new Random().nextInt(90000) + 9999;
		int ticketFive = new Random().nextInt(90000) + 9999;
		JOptionPane.showMessageDialog(null, ticketOne + " " + ticketTwo + " " + ticketThree + " " + ticketFour + " " + ticketFive);
	}
}
