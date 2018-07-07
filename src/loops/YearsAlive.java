package loops;

import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {
		String years = JOptionPane.showInputDialog("how many years have you been alive");
		int yAlive = Integer.parseInt(years);
		
		for (int i =0; i<yAlive + 1; i++) {
			System.out.println(2018-i);
		}
	}
}
