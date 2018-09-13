import static java.math.RoundingMode.HALF_UP;

import java.math.BigDecimal;
import java.math.MathContext;

class BigDecimalEx {
	public static void main(String[] args) throws Exception {

		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		System.out.println(c); // 0.01000000001

		// #1 값을 보정해서 정수로 만들어 놓고 연산한 후에 원래대로 돌려 놓는다
		// #2 커다란 값을 정확히 계산하는 클래스를 사용한다

		BigDecimal _a = new BigDecimal("0.03");
		BigDecimal _b = new BigDecimal("0.04");
		BigDecimal _c = _b.subtract(_a);
		System.out.println(_c);

		BigDecimal bd1 = new BigDecimal("123.456");
		BigDecimal bd2 = new BigDecimal("1.0");

		System.out.print("bd1=" + bd1);
		System.out.print(",\tvalue=" + bd1.unscaledValue());
		System.out.print(",\tscale=" + bd1.scale());
		System.out.print(",\tprecision=" + bd1.precision());
		System.out.println();

		System.out.print("bd2=" + bd2);
		System.out.print(",\tvalue=" + bd2.unscaledValue());
		System.out.print(",\tscale=" + bd2.scale());
		System.out.print(",\tprecision=" + bd2.precision());
		System.out.println();

		BigDecimal bd3 = bd1.multiply(bd2);
		System.out.print("bd3=" + bd3);
		System.out.print(",\tvalue=" + bd3.unscaledValue());
		System.out.print(",\tscale=" + bd3.scale());
		System.out.print(",\tprecision=" + bd3.precision());
		System.out.println();

		System.out.println(bd1.divide(bd2, 2, HALF_UP)); // 123.46
		System.out.println(bd1.setScale(2, HALF_UP)); // 123.46
		System.out.println(bd1.divide(bd2, new MathContext(2, HALF_UP)));

	}
}
