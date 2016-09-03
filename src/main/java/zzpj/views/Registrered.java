package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Registrered extends JPanel {

	/**
	 * Create the panel.
	 */
	public Registrered() {
		setLayout(null);
		
		JLabel lblKino = new JLabel("KINO");
		lblKino.setBounds(211, 13, 56, 16);
		add(lblKino);
		
		JButton btnPrzegl = new JButton("Proponowane filmy");
		btnPrzegl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrzegl.setBounds(147, 76, 155, 25);
		add(btnPrzegl);
		
		JButton btnHistoriaPrzegldania = new JButton("Historia");
		btnHistoriaPrzegldania.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHistoriaPrzegldania.setBounds(147, 149, 155, 25);
		add(btnHistoriaPrzegldania);
		
		JButton btnPreferencjeUytkownika = new JButton("Preferencje");
		btnPreferencjeUytkownika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPreferencjeUytkownika.setBounds(147, 226, 155, 25);
		add(btnPreferencjeUytkownika);
		
		JButton btnWyloguj = new JButton("Wyloguj");
		btnWyloguj.setBounds(341, 9, 97, 25);
		add(btnWyloguj);

	}
}
