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

public class PantallaCarga extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public JProgressBar barraProgreso;

	/**
	 * Create the dialog.
	 */
	public PantallaCarga() {
		 setBounds(100, 100, 637, 566);
	      JPanel contentPane = new JPanel();
	      contentPane.setLayout(new BorderLayout());
	      setContentPane(contentPane);
	 
	      //Creo una etiqueta con la imagen en el centro
	      JLabel lblImagen = new JLabel();
	      //Indico la imagen que quiero mostrar en la label
	      //Me da fallo con imagen
	    // lblImagen.setIcon(new ImageIcon(SplashScreen.class.getResource("/Repac/RePac splashscreen.png")));
	      contentPane.add(lblImagen, BorderLayout.CENTER);
	 
	      //Creo un panel al sur con una barra de carga y una label para el autor
	      JPanel panelInferior = new JPanel();
	      panelInferior.setLayout(new GridLayout(2, 1, 0, 0));
	      barraProgreso = new JProgressBar();
	      //Muestra el % de carga
	      barraProgreso.setStringPainted(true);
	      panelInferior.add(barraProgreso);
	 
	      JLabel lblFersoft = new JLabel("RePac V1.0");
	      lblFersoft.setForeground(Color.BLUE);
	      lblFersoft.setHorizontalAlignment(SwingConstants.CENTER);
	      panelInferior.add(lblFersoft);
	 
	      //Anado el panel inferior al principal
	      contentPane.add(panelInferior, BorderLayout.SOUTH);
	 
	      setResizable(false); //Impedir redimensionar la ventana
	      setUndecorated(true); //Eliminar la barra de título y sus botones
	      setLocationRelativeTo(null); //Mostrar en el centro
	      setVisible(true);
	 
	     /* try {
	        iniciarBarraCarga();
	        
	      } catch (InterruptedException e) {
	         throw new RuntimeException(e);
	      }
	     actualizarBarraProgreso(50);
	      
	      
	      //Al terminar la carga cierro la ventana
	      dispose();
	   }
	 
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
	        	 barraProgreso.setValue(valor);
	         }
	      });
	}
*/
}
}
