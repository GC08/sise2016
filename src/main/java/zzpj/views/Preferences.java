package zzpj.views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;

public class Preferences extends JPanel {

	/**
	 * Create the panel.
	 */
	public Preferences() {
		setLayout(null);
		
		JLabel lblKino = new JLabel("KINO");
		lblKino.setBounds(197, 13, 56, 16);
		add(lblKino);
		
		JLabel lblPreferencje = new JLabel("Preferencje");
		lblPreferencje.setBounds(170, 45, 83, 16);
		add(lblPreferencje);
		
		JLabel lblInteresujceGatunki = new JLabel("Interesuj\u0105ce gatunki");
		lblInteresujceGatunki.setBounds(23, 90, 116, 16);
		add(lblInteresujceGatunki);
		
		JList list = new JList();
		list.setBounds(177, 105, 1, 1);
		add(list);

	}

}
