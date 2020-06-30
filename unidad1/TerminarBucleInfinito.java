package unidad1;

import java.awt.event.KeyEvent;
import java.util.NoSuchElementException;

public class TerminarBucleInfinito {

	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				   try {
					   bucleInfinito();
		                Thread.sleep(200);
		                System.out.println("Shouting down ...");
		                //some cleaning up code...

		            } catch (InterruptedException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		            } 
				   catch (NoSuchElementException e) {
			            
		               System.out.println("CTRL C Program stops");
		            
		            }
			}	
		});
	      
		 
	}

	public static void bucleInfinito(){
		int i = 0;
		//bucle infinito
		
		String espacio ="";
		String espacio1 ="";
		try {
			while (true) {
				i++;
				int j = i *27;
				//if (j == 1269) break;
				//if (i % 10 != 0) continue;
				System.out.println("while"+i);
				if (espacio.equals(espacio1)== true)
					break;
				
				
			}
		}
		
		
		finally {
			System.out.println("chao");
		}
	}

}
