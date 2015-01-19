
public class GreyEncoder {

	public static void main(String[] args) {
		for (int numBits = 1; numBits < 5; numBits++)
		{
			System.out.println("numBits:" + numBits);
			for (int i = 0; i < Math.pow(2, numBits); i++)
			{
				System.out.println(i + ":\t" + encode(numBits, i));
			}
			System.out.println("--------------");
		}
	}
	
	public static String encode(int numBits, int numToEncode)
	{
		if (numBits == 1)
		{
			if (numToEncode < 1)
			{
				return "0";
			}
			else 
			{
				return "1";
			}
		}
		

		if (numToEncode < Math.pow(2, numBits)/2)
		{
			return "0" + encode(numBits-1, numToEncode);
		} 
		else 
		{
			return "1" + encode(numBits-1, (int)Math.pow(2, numBits)-numToEncode-1);
		}
		
	}

}
