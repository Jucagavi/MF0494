package uf2179;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;

public class VentanaMultas extends JFrame {

	private JPanel contentPane;
	private JTextField textMatricula;
	private JTextField textNombre;
	private final ButtonGroup buttonGrupo = new ButtonGroup();
	private JLabel lblImporte;
	private JComboBox comboSancion;
	private JTextField textApellidos;
	private JTextArea textArea;
	private String elegido;
	private JRadioButton rdbtnProntopago;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMultas frame = new VentanaMultas();
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
	public VentanaMultas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow,fill][103.00,grow][]", "[][][][][][][][grow]"));
		
		JLabel lblNewLabel_1 = new JLabel("DGT - Infracciones");
		lblNewLabel_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1, "cell 0 0 3 1");
		
		JLabel lblNewLabel = new JLabel("Matrícula:");
		contentPane.add(lblNewLabel, "flowx,cell 0 1,alignx left");
		
		JLabel lblNombre = new JLabel("Nombre:");
		contentPane.add(lblNombre, "cell 1 1,alignx trailing");
		
		textNombre = new JTextField();
		contentPane.add(textNombre, "cell 2 1,growx");
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellidos:");
		contentPane.add(lblNewLabel_2, "flowx,cell 0 2,alignx trailing");
		
		textApellidos = new JTextField();
		contentPane.add(textApellidos, "cell 1 2 2 1,growx");
		textApellidos.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Sanción:");
		contentPane.add(lblNewLabel_4, "flowx,cell 0 3,alignx left");
		
		JLabel lblNewLabel_6 = new JLabel("Importe:");
		contentPane.add(lblNewLabel_6, "flowx,cell 0 4");
		
		JLabel lblNewLabel_5 = new JLabel("Descuento:");
		contentPane.add(lblNewLabel_5, "cell 0 5");
		
		JRadioButton rdbtnPagonormal = new JRadioButton("Pago Normal");
		rdbtnPagonormal.setSelected(true);
		buttonGrupo.add(rdbtnPagonormal);
		contentPane.add(rdbtnPagonormal, "cell 1 5");
		
		rdbtnProntopago = new JRadioButton("Pronto pago");
		buttonGrupo.add(rdbtnProntopago);
		contentPane.add(rdbtnProntopago, "cell 2 5");
		
		JButton btnNewButton = new JButton("Aceptar");
		contentPane.add(btnNewButton, "cell 0 6 3 1,alignx center");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 7 3 1,grow");
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		comboSancion = new JComboBox();
		comboSancion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccion();
			}
		});
		comboSancion.setModel(new DefaultComboBoxModel(new String[] {"No llevar casco", "Conducción temeraria"}));
		contentPane.add(comboSancion, "cell 0 3,growx");
		
		textMatricula = new JTextField();
		contentPane.add(textMatricula, "cell 0 1,growx");
		textMatricula.setColumns(10);
		
		lblImporte = new JLabel("");
		contentPane.add(lblImporte, "cell 0 4,alignx left");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarDatos();
			}
		});
	}

	protected void seleccion() {
		elegido = (String) comboSancion.getSelectedItem();
		if (elegido.equals("No llevar casco")) {
			lblImporte.setText("200");
		} else if (elegido.equals("Conducción temeraria")) {
			lblImporte.setText("500");
		}	
	}

	protected void mostrarDatos() {
		String pp ="";
		int dto=0;
		if (rdbtnProntopago.isSelected()) {
			pp = "Pronto pago: ";
			dto= Integer.parseInt(lblImporte.getText())/2;
		}
		textArea.setText("Conductor: "+textNombre.getText()+" "+textApellidos.getText()+"\n"
				+"Infracción: "+elegido+"\n"
				+"Importe: "+lblImporte.getText()+"\n"
				+pp+dto);
	}

}
