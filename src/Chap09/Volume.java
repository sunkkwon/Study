package Chap09;

public class Volume extends Area{
	private int height;

	public Volume() {
		super();
	}

	public Volume(int width, int length, int height) {
		super(width, length);
		this.height = height;
	}
	
	public int getVolumn() {
		return getArea() * height;
	}
	
	
}
