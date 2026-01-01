package my.exception.handling;

public class Ex10 {
	private int roll;
	private String name;
	private double per;
	
	public Ex10(int roll, String name, double per) {
		this.roll=roll;
		this.name=name;
		this.per=per;
	}
	
	@Override
	public String toString() {
		return "Roll: "+roll+", Name: "+name+", Percentage: "+per;
	}
}
