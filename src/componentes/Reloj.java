package componentes;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Reloj extends Thread{
	JLabel lblReloj;
        JLabel lblFecha;
        public static boolean estadoRejoj=true;
	
	// constructor
	public Reloj(JLabel lblReloj, JLabel lblFecha){
		this.lblReloj= lblReloj;
                this.lblFecha = lblFecha;
	}// fin del constructor
	
        public void detenerReloj(){
            estadoRejoj = false;
        }
        
	// funcionamiento del reloj
    	public void run() {
    		while(estadoRejoj)	{
    			Date hoy= new Date();
    	SimpleDateFormat sdf= new SimpleDateFormat("H:mm:ss");
        SimpleDateFormat fec = new SimpleDateFormat("EEEEEEEEE dd 'de' MMMMM 'de' yyyy");
                        lblFecha.setText(fec.format(hoy));
 	 	        lblReloj.setText(sdf.format(hoy));

			// demora de 1 segundo            
	        try { sleep(1000); } catch (Exception ex) {}
    	}// fin del while
    }// fin del run


        
}