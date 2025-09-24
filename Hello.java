package test;

public class Hello {

	public static void main(String[] args) {
		String str = ("this is a test string!");
		unique(str);
		counting(str);
		
	}

	public static boolean unique (String str)
	{
		boolean result = true;
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) != ' ')
			{
				for (int r = 0; r < str.length(); r++)
				{
					if (str.charAt(r) == str.charAt(i))
					{
						
							result = false;
							break;
						
					}
				} 
			}
		}
		if (result == true)
		{
			System.out.println("The characters in this string are all unique!");
		}
		else
		{
			System.out.println("The characters in this string are not all unique");
		}
		return result;
	}
	
	public static void counting (String str)
	{
		String tester = (" ");
		String[] words = str.split(tester);
		String temp = null;
		int counting = 0;
		for (int i = 0; i < 5; i++)
    {
			temp = words[i];
	         if (temp.contains("this"))
	       	 {
	        	counting = counting + 1;	 
             }
     }
		System.out.println("The word spelled this occurs" + " " + counting + " " + "times");
    }
}
