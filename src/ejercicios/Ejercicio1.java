package ejercicios;

import javax.swing.JOptionPane;


public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double Longitud_tejado, altura_tejado, angulo_tejado, longutd_canal, altura_canal, radio, altura_tanque,lluvia;
		double area_tejado, area_canal, area_tanque;
		double area_total,volumen_tanque, volumen_lluvia;
		double tiempo;
		
		Longitud_tejado = Double.parseDouble(JOptionPane.showInputDialog("Indique la longitud del tejado en mts:"));		
		altura_tejado = Double.parseDouble(JOptionPane.showInputDialog("Indique la altura del tejado en mts:"));
		angulo_tejado = Double.parseDouble(JOptionPane.showInputDialog("Indique el angulo de inclinación del tejado en grados:"));
		longutd_canal = Double.parseDouble(JOptionPane.showInputDialog("Indique la longitud de la canal en mts:"));
		altura_canal = Double.parseDouble(JOptionPane.showInputDialog("Indique la altura de la canal en mts:"));
		radio = Double.parseDouble(JOptionPane.showInputDialog("Indique el radio del tanque en mts:"));
		altura_tanque = Double.parseDouble(JOptionPane.showInputDialog("Indique la altura del tanque en mts:"));
		lluvia = Double.parseDouble(JOptionPane.showInputDialog("Indique la Medición de la lluvia en ml/dm^2 :"));
		
		if(Longitud_tejado<0 || altura_tejado<0 ||  angulo_tejado<0 || longutd_canal<0 || altura_canal<0 || radio<0 || altura_tanque<0) 
		{
			JOptionPane.showMessageDialog(null,"Ingresaste valores negativos,\n¡intentalo de nuevo!","Error de entrada de datos:",0);
		}
		else
		{
			area_tejado = Longitud_tejado*altura_tejado*Math.cos(angulo_tejado);
			area_canal = longutd_canal*altura_canal;
			area_tanque = Math.PI*Math.pow(radio,2);
			
			area_total = (area_tejado + area_canal + area_tanque)/100;
			volumen_tanque = (area_tanque*altura_tanque)/100;
			volumen_lluvia = (lluvia/1000)*area_total;
			
			tiempo = (volumen_tanque/volumen_lluvia);
			
			JOptionPane.showMessageDialog(null,"El tiempo que que demora el tanque en llenarse es:\n"+Math.round(tiempo)+" Horas");
		}
		
	}

}
