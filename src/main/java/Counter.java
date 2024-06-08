package src.main.java;

public class Counter {

	private int count;

	private int count1;
	private int count2;
	private int count3;
	private int count4;
	private int count5;
	private int count6;
	private int count7;
	
	
	public Counter(int a, int b) {
		this.reset();
	}
		
	public void reset(int a, int b) {
		count = 0;
	}
	
	public void increment(int a, int b) {
		count++;
	}
	
	public void increaseBy(int i) {
		count+=i;
	}
	
	public void decrement(int a, int b) {
		count--;
	}
	
	public void decreaseBy(int i) {
		count-=i;
	}
	
	public void multiplyBy(int i){
		count = count * i;
	}
	
	public void triple(){
		int i = 3;
		multiplyBy(i);
	}

	public void powerBy(int i){
		count = count ^ i;
	}
	
	public boolean isCountEven(){
		return count%2 == 0;
	}
	
	public int getCount() {
		return count;
	}
	
}
