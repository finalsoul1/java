
public class P295 {
	public static void main(String[] args) {
		User user = new User();
//	user.id; // The field User.id is not visible
//	user.password;
//	user.email;
		System.out.println(user.getId());
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());

		User u1 = new User();
		User u2 = new User();
		User u3 = new User();

		System.out.println(u1.getId());
		System.out.println(u2.getId());
		System.out.println(u3.getId());
		
		User u4 = new User("Goodgirl");
		User u5 = new User("Cat");
		User u6 = new User("Pet");

		System.out.println(u4.getId());
		System.out.println(u5.getId());
		System.out.println(u6.getId());
		
	}
}

/*
 * Java Bean �Ծ� 
 * �ڹٺ��� �����ӿ�ũ �ڵ�� ������ �ڵ��� ���� �� 
 * �������� ����ǵ��� �����͸� �����ϴ� Ŭ������ �������,
 * getter/setter �޼ҵ带 �����ϴ� ���
 */

class User {
	// private : ����������(��������� ���� ������ �� �ִ��� ���θ� �����ϴ� Ű����)
	// �Ϲ������� ��������� ���� �����ϴ� ���� �������� �����մϴ�
	private String id = "Tom";
	private String password = "1234";
	// ��������� �ڵ����� �ʱ�ȭ�Ǵµ� String�� �������̹Ƿ� null�� �Ҵ�ȴ�
	private String email; // null : ���� ����

	
	public User() {
	}
	
	public User(String nick) {
//		this.id = id;
		id = nick; // �̷��� �ص� �ȴ�
	}

	// getter �޼ҵ� �����ϴ� ���
	// get + ��������� (��, ������� �� �ձ��ڴ� �빮�ڷ�)
	public String getId() {
		return id;
	}

	// setter �޼ҵ� �����ϴ� ���
	// set + ��������� (��, ������� �� �ձ��ڴ� �빮�ڷ�)
	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}