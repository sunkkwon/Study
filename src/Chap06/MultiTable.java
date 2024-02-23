package Chap06;

public class MultiTable {

	static void table(int n) {
		System.out.println("=== Table " + n + "===");
		
		for(int i = 0; i <= 9; i++){
			System.out.println(n + "x" + i + "=" + (n * i));
		}
	}
	
	static void allTable() {
		for(int i = 2; i <= 9; i++) {
			System.out.println("=== Table " + i + " ===");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
	}
	
	public static void main(String[] args) {
		allTable();

	}

}
