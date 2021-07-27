package Appender;


public class Appender {
private String src;
	
	public Appender() {
		this.src="";
		
	}
	public Appender(String s) {
		if (s!=null) {
		this.src=s;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	Appender append(String app, int n) {
		if (n<0 || app==null)
			throw new IllegalArgumentException();
		while (n-- >0) {
		this.src+=app;
		}
		return this;
	}

	public String toString() {
		return this.src;
	}
}
