package in.java.practice;

public class MissingNumber {
	public static void main(String[] args) {
		
		int arr[] = new int[] {20,29,30,23,24,27,26,25,21,22};
		
		for(int num=20; num<=30; num++)
		{
			boolean flag = false;
			for(int i = 0; i<=9; i++)
			{
				if(arr[i]==num)
				{
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println("Missing Number is::"+num);
			}
		}		
	}
}
