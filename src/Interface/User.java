package Interface;

public class User {
	
	public static void takePhoto(Camera cam) {
		cam.click();
	}
	
	public static void main(String[] args) {
		Camera cam = new Oneplus();
		Music music = new Oneplus();
		cam.click();
		music.playMusic();
		
//		int a =25;
		
		System.out.println(cam.a);
		
		Camera.m1();
		cam.m2();
		
	}

}
