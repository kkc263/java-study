package accessModifier;

public class part1 {
	System.out.println("=== 같은 패키지 테스트 ===");
	public int a=10;
	protected int b=20;
	int c=30;
	private int d=40;
	
	public void show() {
		System.out.println("parent 메서드 실행");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		


	
	
	
	}
}
