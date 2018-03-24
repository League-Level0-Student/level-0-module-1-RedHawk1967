import javax.swing.JOptionPane;

public class UNBIrthday {
	public static void main(String[] args) {

		String bday = JOptionPane.showInputDialog("whats you birthday???");

		if (bday.equals("03/23")) {
			JOptionPane.showMessageDialog(null, "Happy New Years!");

		} else { JOptionPane.showMessageDialog(null,"Happy Old Years!");

		}
	}

}