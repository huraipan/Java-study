package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Lesson9 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson9 window = new Lesson9();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lesson9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 838, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 824, 465);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\82103\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\\uB2E4\uC6B4\uB85C\uB4DC.jpg"));
		btnNewButton.setBounds(142, 194, 151, 57);
		btnNewButton.setPressedIcon(new ImageIcon("C:\\Users\\82103\\OneDrive\\\uBC14\uD0D5 \uD654\uBA74\\\uB2E4\uC6B4\uB85C\uB4DC.jpg"));
		panel.add(btnNewButton);
		
	}
	
}
