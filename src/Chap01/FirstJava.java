package Chap01;

public class FirstJava {
	public static void main(String[] args) {
	
		double degree = 80;
		double degree2 = (degree - 32) / 1.8;
		
		System.out.println(degree2);
		System.out.println(String.format("%.1f", degree2));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력 하세요: ");
//		String name = sc.next();
//		
//		System.out.print("출생년도를 입력 ");
//		int birth = sc.nextInt();
//		int age = 2023 - birth;
		
//		System.out.println("이름: "+name+", 나이: "+age);
	}
}
