package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Unregistered extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Unregistered() {
		setLayout(null);
		
		JLabel lblKino = new JLabel("KINO");
		lblKino.setBounds(207, 13, 56, 16);
		add(lblKino);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(45, 60, 56, 16);
		add(lblLogin);
		
		JLabel lblHaso = new JLabel("Has\u0142o");
		lblHaso.setBounds(45, 112, 56, 16);
		add(lblHaso);
		
		textField = new JTextField();
		textField.setBounds(113, 57, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(113, 109, 116, 22);
		add(passwordField);
		
		JButton btnZaloguj = new JButton("Zaloguj");
		btnZaloguj.setBounds(163, 161, 116, 25);
		add(btnZaloguj);
		
		JButton btnZarejestruj = new JButton("Zarejestruj");
		btnZarejestruj.setBounds(163, 215, 116, 25);
		add(btnZarejestruj);

	}
}
