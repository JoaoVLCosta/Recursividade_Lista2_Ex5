package view;
import controller.MDController;
public class Principal {

	public static void main(String[] args){
		
		MDController mdc = new MDController();
		
		int x = 81;
		int y = 27;
		
		System.out.println("MDC igual a: " + mdc.fnMDC(x,  y));
		
	}
	
}
