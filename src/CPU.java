
public class CPU {
	/** The queue of processes waiting for free memory */
	private CPUQueue cpuQueue;
	/** A reference to the statistics collector */
	private Statistics statistics;
	/** Round robin time **/
	private long roundRobinTime;
}
