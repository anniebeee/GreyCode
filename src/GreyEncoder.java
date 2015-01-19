
public class GreyEncoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		System.out.println("1 = \t" + encode(1, 1));
		
		System.out.println("8 = \t" + encode(4, 8));
	}
	
	public static String encode(int numBits, int numToEncode)
	{
		if (numBits == 1)
		{
			if (numToEncode < 1)
			{
				return "0";
			} else {
				return "1";
			}
		}
		

		if (Math.pow(2, numBits-1) < numToEncode)
		{
			return "0" + encode(numBits -1, numToEncode / 2);
		} else {
			return 
		}
		
	}

}
