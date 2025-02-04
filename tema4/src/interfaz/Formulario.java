package interfaz;

import javax.swing.*;

import semana_04.Libreria;

import java.awt.Font;
import java.awt.event.*;

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
		area.setFont(new Font("Monospaced", Font.PLAIN,13));
		scroll.setViewportView(area);
		
		//boton
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(420,30,120,20);
		panel.add(btnProcesar);
		
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dato = txtDato.getText().trim();
				Libreria l = new Libreria();
				
				if(!dato.isEmpty()) {
					area.append( "Ingreso de texto valido  :"+l.eliminarEspacio(dato)+"\n");
					area.append( "Longitud de texto valido :"+l.longitudSinAjuste(dato)+"\n");
					area.append( "Primer caracter          :"+l.primerCaracter(dato)+"\n");
					area.append( "ultimo caracter          :"+l.ultimoCaracter(dato)+"\n");
					area.append( "\n");
					area.append( "Texto ajustado           :"+l.textoAjustado(dato)+"\n");
					
					
				}else {
					JOptionPane.showMessageDialog(frame,"Caja de texto vacía", "Advertencia", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		
		frame.setVisible(true);
	}

}
