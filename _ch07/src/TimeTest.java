
class Time {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	
	public int getHour() { return hour;};
}
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
//		t.hour = 25;
		t.setHour(25);
		System.out.println(t.getHour());
	}

}
