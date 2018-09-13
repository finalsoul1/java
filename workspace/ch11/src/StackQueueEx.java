import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class StackQueueEx {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		Queue<String> q = new LinkedList<>(); // Queue인터페이스의 구현체인 LinkedList를 사용

		// 항아리
		st.push("0");
		st.push("1");
		st.push("2");

		// 파이프
		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while (!st.empty()) {
			System.out.println(st.pop()); // LIFO
		}

		System.out.println("= Queue =");
		while (!q.isEmpty()) {
			System.out.println(q.poll()); // FIFO
		}
	}
}
