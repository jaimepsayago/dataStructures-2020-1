package tutoria;

public class Spiral {

	 public static void main(String[] args) { 
	        /*int N         = Integer.parseInt("1440");     // # sides if decay = 1.0
	        double decay  = Double.parseDouble("1.00004");   // decay factor

	        double angle  = 360.0 / N;
	        double step   = Math.sin(Math.toRadians(angle/2.0));
	        Turtle turtle = new Turtle(0.5, 0.0, angle/2.0);
	        for (int i = 0; i < 10*N; i++) {
	            step /= decay; 
	            turtle.goForward(step);
	            turtle.turnLeft(angle);
	        }*/
		 
		 int n = Integer.parseInt("400");
	        double p = Double.parseDouble("0.4");

	        double prob = Gaussian.Phi((0.5*n - p*n) / Math.sqrt(n*p*(1-p)));
	        StdOut.println("probability = " + prob);
	        
	     

	    }
	} 

