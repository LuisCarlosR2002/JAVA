package Vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Modelo.Requerimiento_1;
import Modelo.Requerimiento_2;
import Modelo.Requerimiento_3;

import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import Controlador.ControladorRequerimientos;
public class Consulta extends JFrame {


	private JPanel contentPane;
	private final ButtonGroup grupoBotones = new ButtonGroup();
	private JTable tabla;
	DefaultTableModel model;
	public static final ControladorRequerimientos controlador = new ControladorRequerimientos();
	
	public Consulta() {
		
	}
	public void ventana() {
		
		setTitle("BAMB\u00DA Asociados");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.LIGHT_GRAY);
		panel1.setBounds(10, 11, 646, 90);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JRadioButton rdbtnConsulta1 = new JRadioButton("Consulta 1");
		grupoBotones.add(rdbtnConsulta1);
		rdbtnConsulta1.setFont(new Font("Verdana", Font.PLAIN, 14));
		rdbtnConsulta1.setBounds(65, 23, 109, 23);
		panel1.add(rdbtnConsulta1);
		
		JRadioButton rdbtnConsulta2 = new JRadioButton("Consulta 2");
		grupoBotones.add(rdbtnConsulta2);
		rdbtnConsulta2.setFont(new Font("Verdana", Font.PLAIN, 14));
		rdbtnConsulta2.setBounds(269, 23, 109, 23);
		panel1.add(rdbtnConsulta2);
		
		JRadioButton rdbtnConsulta3 = new JRadioButton("Consulta 3");
		grupoBotones.add(rdbtnConsulta3);
		rdbtnConsulta3.setFont(new Font("Verdana", Font.PLAIN, 14));
		rdbtnConsulta3.setBounds(471, 23, 109, 23);
		panel1.add(rdbtnConsulta3);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setBounds(10, 112, 646, 236);
		contentPane.add(panel2);
		panel2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel2.add(scrollPane);
		
		tabla = new JTable();
		scrollPane.setViewportView(tabla);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnConsulta1.isSelected()) {
					
					tabla = new JTable();
					model=new DefaultTableModel();
					tabla.setModel(model);
					scrollPane.setViewportView(tabla);
					model.addColumn("Fecha Inicio");
					model.addColumn("Constructora");
					model.addColumn("Ciudad");
					model.addColumn("Acabados");
					model.addColumn("Banco Vinculado");
					model.addColumn("Serial");
					tabla.setModel(model);
					
					//////////////////////////////////
					
					try {
						ArrayList<Requerimiento_1> requerimiento1=controlador.consultarRequerimiento1();
						model.setRowCount(0);
						for(int i=0;i<requerimiento1.size();i++){
							String fila[]= {
									requerimiento1.get(i).getFecha_Inicio(),
									requerimiento1.get(i).getConstructora(),
									requerimiento1.get(i).getCiudad(),
									requerimiento1.get(i).getAcabados(),
									requerimiento1.get(i).getBanco_Vinculado(),
									requerimiento1.get(i).getSerial()
				            };
							model.addRow(fila);
						}
						
					} catch (Exception e1) {
						System.err.println("Ha ocurrido un error!" + e1.getMessage());
					}
					
					
				}
				if(rdbtnConsulta2.isSelected()) {
					model=new DefaultTableModel();
					tabla = new JTable();
					tabla.setModel(model);
					scrollPane.setViewportView(tabla);
					model.addColumn("Constructora");
					model.addColumn("Ciudad");
					model.addColumn("Porcentaje Cuota Inicial");
					model.addColumn("Tipo");
					tabla.setModel(model);
					
					//////////////////////////////////
					
					try {
						ArrayList<Requerimiento_2> requerimiento2=controlador.consultarRequerimiento2();
						model.setRowCount(0);
						for(int i=0;i<requerimiento2.size();i++){
							Object[]fila= {
									
									requerimiento2.get(i).getConstructora(),
									requerimiento2.get(i).getCiudad(),
									requerimiento2.get(i).getPorcentaje_Cuota_Inicial(),
									requerimiento2.get(i).getTipo()
				            };
							model.addRow(fila);
						}
						
					} catch (Exception e1) {
						System.err.println("Ha ocurrido un error!" + e1.getMessage());
					}
				}
				if(rdbtnConsulta3.isSelected()) {
					model=new DefaultTableModel();
					tabla = new JTable();
					tabla.setModel(model);
					scrollPane.setViewportView(tabla);
					model.addColumn("Nombre Material");
					model.addColumn("Precio Unidad de Material");
					tabla.setModel(model);
					/////////////////////////////
					try {
						ArrayList<Requerimiento_3> requerimiento3=controlador.consultarRequerimiento3();
						model.setRowCount(0);
						for(int i=0;i<requerimiento3.size();i++){
							Object[]fila= {
									
									requerimiento3.get(i).getNombre_Material(),
									requerimiento3.get(i).getMax_precio_unidad()
				            };
							model.addRow(fila);
						}
						
					} catch (Exception e1) {
						System.err.println("Ha ocurrido un error!" + e1.getMessage());
					}
				}
			}
		});
		btnBuscar.setFont(new Font("Verdana", Font.PLAIN, 14));
		btnBuscar.setBounds(279, 56, 89, 23);
		panel1.add(btnBuscar);
		
		setVisible(true);
	}

}
