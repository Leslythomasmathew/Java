package project22;
interface Media{
	void play();
	void stop();
	default void pause() {
		System.out.println("Media paused");
		
	}

static void about() {
	System.out.println("This is a media interface");
}

}
interface AdvanceMedia extends Media{
	void nextTrack();
}
class MusicPlayer implements AdvancedMedia{
	public void play()
{
		System.out.println("Music started");		
		
		}
	public void paused()
	{
		System.out.println("Music paused");
		
	}
	public void stop()
	{
		System.out.println("Music stoppped");
		
	}
	public void nextTrack() {
		System.out.println("Next Song");
	}
}

public class Userinterface {
	public static void main(String[] args) {
		MusicPlayer musicPlayer = new MusicPlayer();
		musicPlayer.play();
		musicPlayer.nextTrack();
		musicPlayer.paused();
		Media.about();
		musicPlayer.stop();
		
		
	}
}
