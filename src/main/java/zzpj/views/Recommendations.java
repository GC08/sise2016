package zzpj.views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JList;

public class Recommendations extends JPanel {

	/**
	 * Create the panel.
	 */
	public Recommendations() {
		setLayout(null);
		
		JLabel lblKino = new JLabel("KINO");
		lblKino.setBounds(188, 13, 56, 16);
		add(lblKino);
		
		JLabel lblListaPolecanychFilmw = new JLabel("Lista polecanych film\u00F3w");
		lblListaPolecanychFilmw.setBounds(136, 42, 198, 16);
		add(lblListaPolecanychFilmw);
		
		JList list = new JList();
		list.setBounds(202, 93, 1, 1);
		add(list);

	}
}
