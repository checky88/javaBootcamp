

public class Workdone {

	public static void main(String[] args) {
	String[] arr = {"A","B","C"};
	for (int  i = 0; i< arr.length; i++)
	{
		System.out.println(arr[i]+" ");
		if(arr[i].equals("A"))
		{
			continue;
		}// end if
		System.out.println("Work done");
	}//end for
	
	}

}
