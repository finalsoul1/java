import java.util.Enumeration;
import java.util.Properties;

class PropertiesEx1 {
	public static void main(String[] args) {
		Properties prop = new Properties();

		// prop�� Ű�� ��(key, value)�� �����Ѵ�.
		prop.setProperty("timeout","30");
		prop.setProperty("language","kr");
		prop.setProperty("size","10");
		prop.setProperty("capacity","10");

		// prop�� ����� ��ҵ��� Enumeration�� �̿��ؼ� ����Ѵ�.
		Enumeration<?> e = prop.propertyNames();

		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			System.out.println(key + "="+ prop.getProperty(key));
		}

		System.out.println();
		prop.setProperty("size","20");	// size�� ���� 20���� �����Ѵ�.
		System.out.println("size="       + prop.getProperty("size"));
		System.out.println("capacity="   + prop.getProperty("capacity", "20"));
		System.out.println("loadfactor=" + prop.getProperty("loadfactor", "0.75"));

		System.out.println(prop);	// prop�� ����� ��ҵ��� ����Ѵ�.
		prop.list(System.out);      // prop�� ����� ��ҵ��� ȭ��(System.out)�� ����Ѵ�.
	}
}
