package my.exception.handling;

public class Ex09 {
	int value;
	
	Ex09(int value){
		this.value=value;
	}
	
	@Override
	public String toString() {
		return "Contains values: "+value;
	}
}

