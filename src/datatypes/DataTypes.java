package datatypes;

import java.math.BigDecimal;

/**
 * @author sathish
 *
 *         Data Types are Two types 1. Primitive 2.Non-Primitive
 *
 *         1. Primitive : 1.boolean -> true , false ( 1 bit ) 2.char -> 2 bytes
 *         3.byte -> 1 byte (-128 to 128 ) 4.short -> 2bytes 5.int -> 4bytes
 *         6.long -> 8bytes 7.float -> 4bytes 8.double ->8bytes
 * 
 *         2.Non-Primitive String,Array,Class,object,interface......
 */
public class DataTypes {

	public static void main(String[] args) {

		// Primitive type
		boolean a = true;
		boolean b = false;
		char c = 'c';
		byte d = 100;
		short e = 12545;
		int f = 1234567891;
		long g = 1234567891011121314L;
		float h = 1234567.256f;
		double i = 1234567.256123d;

		// Wrapper Class
		Boolean j = true;
		Boolean k = false;
		Character l = 's';
		Byte m = 123;
		Short n = 12345;
		Integer o = 1234567891;
		Long p = 1234567891234567891L;
		Float q = 123456.12345f;
		Double r = 1234567.12345d;
		BigDecimal x = new BigDecimal(12345678912345.256123);

		System.out.println(x);
	}
}
