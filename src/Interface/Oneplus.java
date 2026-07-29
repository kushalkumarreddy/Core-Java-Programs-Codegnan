package Interface;

public class Oneplus implements Camera, Music{

	@Override
	public void click() {
		System.out.println("I take photo using oneplus phone");
		
	}
	
	@Override
	public void playMusic() {
		System.out.println("I listen to Music in Oneplus phone");
	}
	

}
