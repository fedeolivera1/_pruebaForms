package _pruebaForms;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class FrmPrueba extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsu;
	private JTextField txtContr;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(
							UIManager.getSystemLookAndFeelClassName());
					FrmPrueba frame = new FrmPrueba();
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
	public FrmPrueba() {
		
		setTitle("Frm de Prueba");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("aqui va el tooltip");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setBounds(10, 11, 61, 14);
		lblUsuario.setHorizontalTextPosition(SwingConstants.RIGHT);
		contentPane.add(lblUsuario);
		
		JLabel lblContr = new JLabel("Contraseña");
		lblContr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContr.setBounds(10, 35, 61, 14);
		contentPane.add(lblContr);
		
		txtUsu = new JTextField();
		txtUsu.setBounds(141, 11, 179, 20);
		contentPane.add(txtUsu);
		txtUsu.setColumns(10);
		
		txtContr = new JTextField();
		txtContr.setToolTipText("ingrese su contraseña");
		txtContr.setBounds(141, 35, 179, 20);
		contentPane.add(txtContr);
		txtContr.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Frm2 frm2 = new Frm2();
				frm2.setVisible(true);
			}
		});
		btnIngresar.setToolTipText("aqui va el tooltip");
		btnIngresar.setBounds(231, 66, 89, 23);
		contentPane.add(btnIngresar);
	}
}
