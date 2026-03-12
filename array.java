public class array
{
	public static void main(String[] args)
	{
		int [] marks = new int[5];
		marks[0] = 100;

		marks[1] = 60;
		marks[2] = 30;
		marks[3] = 50;
		marks[4] = 40;
		//marks[5] = 60;

		int [] marks2 = {10,20,40,50,60,30,40,50,110};


		for(int i=0;i<5;i++)
		{
			System.out.println(marks[i]);
		}

		for(int i=0;i<5;i++)
		{
			System.out.println(marks2[i]);
		}


	}

}
