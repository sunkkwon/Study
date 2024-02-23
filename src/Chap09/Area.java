package Chap09;

public class Area {
	private int width;
	private int length;
	
    public Area() {
	// TODO Auto-generated constructor stub
    }
	public Area(int width, int length) {
//		super();
		this.width = width;
		this.length = length;
	}
	
	public int getArea() {
		return width * length;
	}
	
}
