package homework;

public class FirstName extends LastName {

	public void printName(String[] names) {
		super.printName(names);
		System.out.println();
		for (String name : names) {
			System.out.print(name.substring(1, 3) + " ");
		}

	}

	public static void main(String[] args) {

		String[] names = { "강다연", "김다영", "김선경", "김인영", "김주민", "박상준", "박서영" };
		
		FirstName fn = new FirstName();
		LastName ln = new FirstName();
		fn.printName(names);
		System.out.println();
		ln.printName(names);
	}

}
