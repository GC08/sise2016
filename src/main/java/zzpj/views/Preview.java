package views;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Preview extends JPanel {

	/**
	 * Create the panel.
	 */
	public Preview() {
		setLayout(null);
		
		JLabel lblKino = new JLabel("KINO - szczegó³y filmu");
		lblKino.setBounds(145, 13, 179, 16);
		add(lblKino);
		
		JLabel lblTytu = new JLabel("Tytu\u0142");
		lblTytu.setBounds(46, 51, 56, 16);
		add(lblTytu);
		
		JLabel lblGatunek = new JLabel("Gatunek");
		lblGatunek.setBounds(46, 91, 56, 16);
		add(lblGatunek);
		
		JLabel lblRokProdukcji = new JLabel("Rok produkcji");
		lblRokProdukcji.setBounds(46, 134, 77, 16);
		add(lblRokProdukcji);
		
		JLabel lblReyser = new JLabel("Re\u017Cyser");
		lblReyser.setBounds(46, 173, 56, 16);
		add(lblReyser);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(145, 53, 123, 16);
		add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(145, 93, 123, 14);
		add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(144, 136, 56, 16);
		add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(145, 175, 130, 14);
		add(textArea_3);

	}

}
