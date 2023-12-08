package Chap09;

public class VolumnUse {

	public static void main(String[] args) {
		Volume v1 = new Volume();
		System.out.println("Volume: " + v1.getVolumn());
		
		Volume v2 = new Volume(10,20,30);
        System.out.println("Volume: " + v2.getVolumn());
	}

}
