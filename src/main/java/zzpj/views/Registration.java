package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Registration extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JPasswordField passwordField_1;

	/**
	 * Create the panel.
	 */
	public Registration() {
		setLayout(null);
		
		JLabel lblKinoRejestracja = new JLabel("KINO - rejestracja");
		lblKinoRejestracja.setBounds(168, 13, 110, 16);
		add(lblKinoRejestracja);
		
		JLabel lblLogin = new JLabel("login");
		lblLogin.setBounds(33, 63, 56, 16);
		add(lblLogin);
		
		JLabel lblHaso = new JLabel("has\u0142o");
		lblHaso.setBounds(33, 111, 45, 16);
		add(lblHaso);
		
		textField = new JTextField();
		textField.setBounds(85, 60, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(85, 108, 116, 22);
		add(passwordField);
		
		JLabel lblPoczZFilmwebem = new JLabel("Po\u0142\u0105cz z Filmwebem");
		lblPoczZFilmwebem.setBounds(156, 160, 144, 16);
		add(lblPoczZFilmwebem);
		
		JLabel lblEmailLubNick = new JLabel("email lub nick");
		lblEmailLubNick.setBounds(33, 201, 84, 16);
		add(lblEmailLubNick);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 198, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(129, 236, 116, 22);
		add(passwordField_1);
		
		JLabel lblHaso_1 = new JLabel("has\u0142o");
		lblHaso_1.setBounds(33, 239, 56, 16);
		add(lblHaso_1);
		
		JButton btnZarejestruj = new JButton("Zarejestruj");
		btnZarejestruj.setBounds(181, 271, 97, 25);
		add(btnZarejestruj);

	}

}
