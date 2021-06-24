package oop;

public class TV {
	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on = false;

	public TV() {

	}
	
	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (on && channel >= 1 && channel <= 120)
			this.channel = channel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumLevel) {
		this.volumeLevel = volumLevel;
	}

	public void setChannelUp() {
		if (on && channel >= 1 && channel < 120)
			channel++;
	}

	public void setChannelDown() {
		if (on && channel > 1 && channel <= 120)
			channel++;
	}

	public void setVolumeLevelUp() {
		if (on && volumeLevel >= 1 && volumeLevel < 100)
			volumeLevel++;
	}

	public void setVolumeLevelDown() {
		if (on && volumeLevel > 1 && volumeLevel < 100)
			volumeLevel--;
	}

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.setOn(true);
		tv1.setChannel(12);
		tv1.setChannelUp();
		tv1.setVolumeLevelUp();

		TV tv2 = new TV();
		tv2.setOn(true);
		tv2.setChannel(12);
		tv2.setChannelUp();
		tv2.setVolumeLevel(20);
		tv2.setVolumeLevelUp();

		System.out.println("tv1's channel is " + tv1.getChannel() + " and volume level is " + tv1.getVolumeLevel());
		System.out.println("tv2's channel is " + tv2.getChannel() + " and volume level is " + tv2.getVolumeLevel());
	}

}
