package unidad4;

public class AppStack {

	public static void main(String[] args) {

		Stack<Integer> s = new ArrayStack<>();
		s.push(5);
		s.push(3);
		System.out.println(s.size());
		System.out.println(s.top());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());

	}

}
