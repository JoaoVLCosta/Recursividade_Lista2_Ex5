package controller;

public class MDController {

	public MDController() {
		super();
		
	}
	
	public int fnMDC(int x, int y) {
		
		if(x > y) {
			
			return fnMDC(x - y, y);
			
		} else if(y > x) {
			
			return fnMDC(y, x);
			
		} else {
			
			return x;
			
		}
		
	}
	
}
