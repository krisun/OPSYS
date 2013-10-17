/**
 * The threaded object class here. Generator will create 
 * a process object and place it in memoryQueue.
 */
public class Process implements Runnable {
	
	private int storageNeed;
	private int executeTime;
	private int IOTime;

	public Process(int storageNeed, int executeTime, int IOTime)
	{
		this.storageNeed = storageNeed;
		this.executeTime = executeTime;
		this.IOTime = IOTime;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
