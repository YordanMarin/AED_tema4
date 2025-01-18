package interfaz;

import javax.swing.*;

public class Formulario {

	public static void main(String[] args) {
		Formulario f = new Formulario();
		f.ventana();

	}
	
	public void ventana() {
		//creando ventana
		JFrame frame = new JFrame("Semana 4 - cadena de texto");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,600);
		
		//crear panel
		JPanel panel = new JPanel();
		frame.setContentPane(panel);
		panel.setLayout(null);
		
		//etiqueta de dato
		JLabel lblTexto = new JLabel("Ingrese texto: ");
		lblTexto.setBounds(20,30,200,20);
		panel.add(lblTexto);
		
		//caja de texto
		JTextField txtDato = new JTextField();
		txtDato.setBounds(110,30,300,20);
		panel.add(txtDato);
		
		//desplazamiento
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(20,70,390,400);
		panel.add(scroll);
		
		//area
		JTextArea area = new JTextArea();
		scroll.setViewportView(area);
		
		//boton
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(420,30,120,20);
		panel.add(btnProcesar);
		
		frame.setVisible(true);
	}

}
