package oops;

public class MainFunction {

	public static void main(String[] args) {
        Playable p = new AudioPlayer();
        Recordable r=new AudioPlayer();
        p.play();
        r.record();
        System.out.println("===================================");
        
        Playable p1 = new VideoPlayer();
        VideoPlayer r1=new VideoPlayer();
        p1.play();
        r1.stream();
        System.out.println("===================================");
        
        Recordable r2=new Camera();
        Streamable s=new Camera();
        //Camera s2=new Camera();
        r2.record();
        s.stream();
        
        

	}

}
