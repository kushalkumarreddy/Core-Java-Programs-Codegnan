package Interface;

public class Samsung implements Camera, Music{

	@Override
	public void click() {	
		System.out.println("I take photo using Samsung phone");
		
	}
		
	@Override
	public void playMusic() {
		System.out.println("I listen to Music in samsung phone");
	}
		

}
