package comp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import componente.Componente;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class PruebaComponente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebaComponente frame = new PruebaComponente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PruebaComponente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//Componente cmp = new Componente();
		getContentPane();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		Componente com = new Componente();
		contentPane.add(com, BorderLayout.NORTH);
		JButton textoverde = new JButton("textoverde");
		textoverde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				com.SetLabelInformacion(" victoria ");
			}
		});
		contentPane.add(textoverde, BorderLayout.WEST);
		
		
		
		JButton btnNewButton = new JButton("textorojo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				com.SetLabelError(" error");
			}
		});
		contentPane.add(btnNewButton, BorderLayout.EAST);
	
	}

}
