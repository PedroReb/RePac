package RePac;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import RePac.Controlador;
import javax.swing.JProgressBar;

import javax.swing.SwingUtilities;
import RePac.PantallaCarga;
public class Controlador {
	//private JProgressBar barraProgreso;
	PantallaCarga micarga;
	
	public Controlador(Vista vista, Modelo modelo,PantallaCarga carga) {
		micarga=carga;
		/*try {
	        iniciarBarraCarga();
	        
	      } catch (InterruptedException e) {
	         throw new RuntimeException(e);
	      }
	    // actualizarBarraProgreso(50);
	      */
	      
	      //Al terminar la carga cierro la ventana
	     carga.dispose();
	   
	   }
	

	
	/*
		// TODO Auto-generated constructor stub
		   static void iniciarBarraCarga() throws InterruptedException {
			      for(int i = 0; i <= 100; i++){
			         Thread.sleep(50);
			        // actualizarBarraProgreso(i);
			      }
			   }
			 
			 public static void actualizarBarraProgreso(int valor) {
			      SwingUtilities.invokeLater(new Runnable() {
			         @Override
			         public void run() {
			        	
						try {
							try {
								try {
									barraProgreso.setValue(valor);
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			         }
			      });
			}
		*/

 
   private void iniciarBarraCarga() throws InterruptedException {
  
	   for(int i = 0; i <= 100; i++){
         Thread.sleep(20);
         actualizarBarraProgreso(i);
      }
   }
 
   private void actualizarBarraProgreso(int valor) {
     SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
        	 micarga.barraProgreso.setValue(valor);
        	
         }
      });
}
	
}
	


