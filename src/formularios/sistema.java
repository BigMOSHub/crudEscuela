package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;
import com.sun.jdi.connect.spi.Connection;

import conexionSQL.conexionSQL;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;

public class sistema extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String Object = null;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtCalificacion;
	private JTable tablaAlumnos;
	private JTextField txtBuscar;

	conexionSQL cc= new conexionSQL();
	Connection con= (Connection) cc.conexion();
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sistema frame = new sistema();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public sistema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	
		JLabel lblNombre = new JLabel("nombre");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		JLabel lblApelllidos = new JLabel("apelllidos");
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		
		JLabel lblMateria = new JLabel("materia");
		
		@SuppressWarnings("rawtypes")
		JComboBox cbMateria = new JComboBox();
		cbMateria.setModel(new DefaultComboBoxModel(new String[] {"Matematicas", "Espanol", "Ingles", "Programacion", "Geografia"}));
		
		txtCalificacion = new JTextField();
		txtCalificacion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Calificacion");
		
		JLabel lblEstatus = new JLabel("Estatus");
		
		@SuppressWarnings("rawtypes")
		JComboBox cbEstatus = new JComboBox();
		cbEstatus.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Reprobado"}));
		
		JButton btnNuevo = new JButton("Nuevo");
		
		JButton btnEliminar = new JButton("Eliminar");
		
		JButton btnGuardar = new JButton("Guardar");
		
		JButton btnActualizar = new JButton("Actualizar");
		
		tablaAlumnos = new JTable();
		
		JLabel lblNewLabel_1 = new JLabel("Buscar");
		
		txtBuscar = new JTextField();
		txtBuscar.setColumns(10);
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNombre)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblApelllidos)
										.addComponent(lblMateria)
										.addComponent(lblNewLabel))
									.addGap(27)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(cbMateria, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(cbEstatus, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtCalificacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
									.addComponent(tablaAlumnos, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
									.addGap(79))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(191)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(34)
									.addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(206))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEstatus)
							.addContainerGap(799, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnEliminar)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnActualizar))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNuevo)
									.addGap(30)
									.addComponent(btnGuardar)))
							.addContainerGap(652, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombre)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblApelllidos)
								.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblMateria)
								.addComponent(cbMateria, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCalificacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEstatus)
								.addComponent(cbEstatus, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNuevo)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnGuardar)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnActualizar)
										.addComponent(btnEliminar)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tablaAlumnos, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(140, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);

		public insertarDatos() {
			
			try {
				String SQL = "insert into alumnos (nombre, apellidos, materia, calificacion, estatus) values (?,?,?,?,?)";
				PreparedStatement pst=(PreparedStatement) ((java.sql.Connection) con).prepareStatement(SQL);
		
				pst.setString(1, txtNombre.getText());
				pst.setString(2, txtApellidos.getText());
				int seleccionado=cbMateria.getSelectedIndex();
				pst.setString(3, cbMateria.getItemAt(seleccionado));
		
			}catch (Exception e) {
				
			}
		}
	
	}

	
}
