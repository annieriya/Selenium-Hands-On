//interface is skincare
//skin class implements skincare interface

public class skin implements skincare {
	public static void main (String[] args) {
		skin sk = new skin();
		
		sk.creams();
		sk.serums();
		sk.sunscreen();
		sk.bodylotions();
		sk.bodywash();
	}

	@Override
	public void creams() {
		// TODO Auto-generated method stub
	System.out.println("Creams for oily and dry skin");	
	}

	@Override
	public void serums() {
		// TODO Auto-generated method stub
		System.out.println("Serums rich in vitamin c");
	}

	@Override
	public void sunscreen() {
		// TODO Auto-generated method stub
		System.out.println("sunscreen protection from uv rays");
	}

	@Override
	public void bodylotions() {
		// TODO Auto-generated method stub
		System.out.println("bodylotions to keep skin moist and supple");
	}
	public void bodywash() {
		// TODO Auto-generated method stub
		System.out.println("bodywash rich in shea butter");
	}

}
