
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import java.net.PasswordAuthentication;

import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your
 * friend can read it. You set up the passcode and the secret message. Your
 * friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		String bob = "123";

		// 1. Set a password in a String variable
String bob3 = JOptionPane.showInputDialog("ENETR SECRET MESSAGE");
		// 2. Using a pop-up, ask the first person for a secret message and store it in
		// a variable
		String bob2 = JOptionPane.showInputDialog(null, "ENTER THE PASSWORD FOR SECRET MESSAGE");
		// 3. Now use a pop-up to tell the NEXT user that they can only see the secret
		// message
		// if they can guess the passcode

		// 4. If their guess matches the password, show them the secret message
		if (bob2 .equals(bob)){
			JOptionPane.showMessageDialog(null, "SHOWING SECRET MESSAGE");
			// 5. If the password does not match, pop-up "INTRUDER!!"
		JOptionPane.showMessageDialog(null, bob3);} else {JOptionPane.showMessageDialog(null,"GUARDS, INTRUDERS" );

		}
	}
}
