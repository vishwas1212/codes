package olddsamixcodes.linkedlist;

import java.math.BigInteger;

public class Test {

	public static void main(String[] args) {
		BigInteger bg=new BigInteger("10000");
		BigInteger bg1=new BigInteger("1000000");
		BigInteger total=BigInteger.ZERO;
		total.add(bg);
		total.add(bg1);
		System.out.println(total);
		
		
		final String pig="length: 10";
		final String dog="length:"+pig.length();
		System.out.println(pig==dog);
		

	}

}
