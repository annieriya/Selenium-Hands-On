//inheritance with abstract classes
//abstract class is eyecare

public class eyes extends eyecare {
	int eyelinerquantity = 20;
	public static void main(String[] args) {
		eyecare e = new eyes();
		e.eyeliner();
		e.colour();
		e.lashes();
		e.shape();		
		eyes ei = new eyes();
		ei.eyeshadow();
	}
	
	@Override
	public void eyeliner() {
		int eyelinerquantity = 30;
		// TODO Auto-generated method stub
	System.out.println(eyelinerquantity);
	System.out.println("eyeliner is green or blue");
	System.out.println(this.eyelinerquantity);
	}
	public void eyeshadow() {
	System.out.println("eyeshadow pallete with 9 colours");
	}

}
