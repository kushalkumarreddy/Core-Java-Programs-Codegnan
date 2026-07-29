package Interface;

public class User {
	
	public static void takePhoto(Camera cam) {
		cam.click();
	}
	
	public static void main(String[] args) {
		Camera camera = new Oneplus();
		Music music = new Oneplus();
		camera.click();
		music.playMusic();
	}

}
