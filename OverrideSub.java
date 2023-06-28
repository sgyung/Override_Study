package day0627;

/**
 * 부모클래스에서 제공하는 method가 자식클래스에서 맞지 않으면
 * 부모클래스의 method를 자식클래스에서 변경하는 것 
 * @author USER
 */
public class OverrideSub extends OverrideSuper{

	int subJ;
	
	@Override
	public void  print() {
		System.out.println("자식 subJ : " + subJ);
	}
	
	public void test() {
		System.out.println("자식의 method");
	}
	
	// 접근지정자는 광의의(접근이 원활한 쪽) 접근지정자로 변환 가능
	// default > protected > public
	@Override
	public void overTest() {
		
	}
	
	public static void main(String[] args) {
		// is a 관계의 객체화 : 부모클래스명 객체명 = new 자식클래스의 생성자();
		// Override된 method가 존재하면 자식의 method가 호출된다.
		OverrideSuper os = new OverrideSub();
//		os.test()// 자식의 method인 test는 OverridSuper 클래스에 존재하지 않으므로 호출불가
		os.print();// Override를 하면 자식의 method가 최우선적으로 호출된다.
		
	}

}
