package unidad1;

public class StaticMethods19y20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mod(-2, 3));
		System.out.println(fv(1000, 1, 0.5));
		System.out.println(pv(1000, 1, 0.5));
	}
	public static double fv (double capital, double r, double t ) {
		double monto, interes;
		monto =capital* Math.pow( 1.0 + r, t );;
		//interes = monto - capital;
		
		return monto;
	}
	public static double pv (double capital, double r, double t ) {
		double monto, interes;
		monto =capital/ Math.pow( 1.0 + r, t );;
		//interes = monto - capital;
		
		return monto;
	}
	
	public static int mod(int a, int n) {
		int mod=0;
		if(a > 0) {
			mod = a % n;
		}else {
		if (a < 0)
			mod = a % n;
		}
	return mod;
	}
}
