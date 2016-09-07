package zzpj.views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;

public class History extends JPanel {

	/**
	 * Create the panel.
	 */
	public History() {
		setLayout(null);
		
		JLabel lblKino = new JLabel("KINO");
		lblKino.setBounds(209, 13, 56, 16);
		add(lblKino);
		
		JLabel lblHistoriaWyszukiwania = new JLabel("Historia wyszukiwania");
		lblHistoriaWyszukiwania.setBounds(165, 42, 125, 16);
		add(lblHistoriaWyszukiwania);
		
		JList list = new JList();
		list.setBounds(221, 100, 1, 1);
		add(list);

	}
}
