package swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class App {
	private final String ID = "Jin";
	private final String PASS = "abc";

	private JFrame frame;
	private JTextField idField;
	private JPasswordField passField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	//private ImagePanel sumPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImagePanel sumPanel = new ImagePanel(new ImageIcon("C:\\workspace\\GraphicProject\\image\\인터페이스1.png").getImage());
		ImagePanel loginPanel = new ImagePanel(new ImageIcon("C:\\workspace\\GraphicProject\\image\\login2.png").getImage());
		ImagePanel tranPanel = new ImagePanel(new ImageIcon("C:\\workspace\\GraphicProject\\image\\다운로드.jpg").getImage());
		frame.setSize(loginPanel.getDim());
		frame.setPreferredSize(loginPanel.getDim());
		sumPanel.setLayout(null);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(71, 226, 81, 26);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC6D4\uAE09", "\uC6A9\uB3C8"}));
		comboBox.setToolTipText("\uC6D4\uAE09\r\n\uC6A9\uB3C8");
		sumPanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(70, 285, 83, 26);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uC2DD\uBE44", "\uBB38\uD654\uC0DD\uD65C", "\uAD50\uD1B5\uBE44"}));
		sumPanel.add(comboBox_1);
		
		
		textField = new JTextField();
		textField.setBounds(187, 228, 117, 20);
		sumPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(58, 258, 246, 21);
		sumPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(190, 287, 112, 23);
		sumPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(58, 318, 246, 20);
		sumPanel.add(textField_3);
		textField_3.setColumns(10);
		frame.getContentPane().add(loginPanel);
		frame.getContentPane().add(sumPanel);
		frame.getContentPane().add(tranPanel);
		
		JButton incomeBtn = new JButton("");
		incomeBtn.setBounds(75, 365, 80, 27);
		sumPanel.add(incomeBtn);
		incomeBtn.setIcon(new ImageIcon("C:\\workspace\\GraphicProject\\image\\INCOME.png"));
		incomeBtn.setPressedIcon(new ImageIcon("C:\\workspace\\GraphicProject\\image\\INCOME1.png"));
		
		JButton expenseBtn = new JButton("");
		expenseBtn.setBounds(161, 365, 87, 30);
		sumPanel.add(expenseBtn);
		expenseBtn.setIcon(new ImageIcon("C:\\workspace\\GraphicProject\\image\\expense.png"));
		expenseBtn.setPressedIcon(new ImageIcon("C:\\workspace\\GraphicProject\\image\\expense1.png"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 284, 26);
		sumPanel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("\uAE30\uB2A5(F)");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\uC800\uC7A5\uD558\uAE30(S)");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\uBD88\uB7EC\uC624\uAE30(L)");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("\uACC4\uC0B0\uAE30(C)");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\uC2E4\uD589\uD558\uAE30(O)");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("\uB3C4\uC6C0\uB9D0(H)");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\uC815\uBCF4(I)");
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		tranPanel.setVisible(false);
		sumPanel.setVisible(false);
		
		idField = new JTextField();
		idField.setBounds(200, 184, 601, 31);
		loginPanel.add(idField);
		idField.setColumns(10);
		idField.setBorder(null);
		
		passField = new JPasswordField();
		passField.setBounds(200, 286, 588, 31);
		loginPanel.add(passField);
		frame.pack();
		passField.setBorder(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(191, 352, 21, 21);
		loginPanel.add(chckbxNewCheckBox);
		
		JButton loginBtn = new JButton("");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ID.equals(idField.getText())&&PASS.equals(passField.getText())) {
					JOptionPane.showMessageDialog(null, "You are logged In!");
					loginPanel.setVisible(false);
					sumPanel.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "You Failed to Log In");
				}
			}
		});
		loginBtn.setBorder(null);
		loginBtn.setBounds(433, 404, 129, 52);
		loginPanel.add(loginBtn);
		loginBtn.setIcon(new ImageIcon("C:\\workspace\\GraphicProject\\image\\button.png"));
		loginBtn.setPressedIcon(new ImageIcon("C:\\workspace\\GraphicProject\\image\\button1.png"));
	}
}
