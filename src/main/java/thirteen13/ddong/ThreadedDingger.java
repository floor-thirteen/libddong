package thirteen13.ddong;

class ThreadedDingger implements Runnable {

    private DingDongPlayer player;

	public ThreadedDingger(DingDongPlayer player) {
        this.player = player;
    }

	public void run() {
        player.start();
		
	}	
}