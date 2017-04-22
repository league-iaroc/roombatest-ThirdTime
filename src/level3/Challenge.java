package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(500,500);
		sleep(2200);
		driveDirect(0,200);
		sleep(1275);
		driveDirect(300,300);
		sleep(3300);
		driveDirect(300,0);
		sleep(800);
		driveDirect(300,300);
		sleep(3400);
		driveDirect(0,350);
		sleep(750);
		driveDirect(300,300);
		sleep(3600);
		driveDirect(350,0);
		sleep(800);
		driveDirect(300,300);
	}

	public void loop() {

	}
}
