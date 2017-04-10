/*import java.util.Scanner;

class Plane{
	public static void main(String[]args){
		Scanner keyboard = new Scanner(System.in);
	char Plane[][] = new char [8][4];
	char choice;

	fillplane(Plane);

do{
		System.out.println("Enter your choice");
		System.out.println("(A) View Seat");
		System.out.println("(B) Book Seat");
		System.out.println("(C) Cancel a Booking");
		System.out.println("(D) Reset All");
		System.out.println("(E) Quit");

		choice =  (char) keyboard.nextInt();


		switch(choice){
			case 'a': case 'A': output(Plane);break;
			case 'b': case 'B': bookseat(Plane);output(Plane);break;
			case 'c': case 'C':cancelseat(Plane);output(Plane);break;
			case 'd': case 'D':resetplane(Plane);output(Plane);break;
			case 'e': case 'E':;break;
			default: System.out.println("Please enter A,B,C,D or E");

			}
		}while(choice != 'e' && choice != 'E');


		System.out.println("");
   		System.out.println("End of programme Goodbye");
   		System.out.println("");

	}// end of main

	////////////////////////////////////
	//           Fill PLANE			 ///
	////////////////////////////////////

	static void fillplane(char P[][]){
		for(int r=0; r<P.length; r++)
		{
			for(int c=0; c< P[r].length; c++)
				P[r][c]='-';



		}//end of for

		}//end of fill array

	////////////////////////////////////
	//           OUTPUT PLANE		 ///
	////////////////////////////////////
	static void output(char P[][]){

	System.out.println("	 A:	 B:		 C:	 D:");
	System.out.println("	___________________________________");

		for(int r=0; r<P.length; r++)
		{
			if(r==4)
			System.out.println("\n\n");


			System.out.print("Row:" + (r+1));

				for(int c=0; c< P[r].length; c++)

			if(c==2)
			System.out.print("|		|"+ P[r][c]);

			else

			System.out.print("|	|" + P[r][c]);

			System.out.println("|");

		}
		System.out.println("	___________________________________");
	}//end output


	////////////////////////////////////
	///           BOOK A SEAT     	 ///
	////////////////////////////////////
static void bookseat(char P[][]){
			int num;
			char col,proceed;

	do{
		do{

			do{

	  		System.out.print("Enter the row number you would like to book:  ");
       		 num =Keyboard.readInt();

			if (num < 1 || num > 8){

				System.out.println("\nThere is only 8 rows please enter number between 1 and 8 please:  \n");

				}//end if


			}while(num < 1 || num > 8);

			do{

       		System.out.print("Enter the Colume letter you would like to book:  ");
       		col =Keyboard.readChar();
			col = Character.toUpperCase(col);

				if (col !='A' && col !='B' && col !='C' && col !='D'){

				System.out.println("\nPlease enter colume A,B,C or D:  \n");

				}//end if


			}while(col !='A' && col !='B' && col !='C' && col !='D');

			if (P[num-1][col-65]=='x')

			System.out.println("\nThe seat "+num+col+" is already booked please choose another!\n");


			}while(P[num-1][col-65]=='x');

			if (num>4)

			System.out.print("Seat "+num+col+" is a smoking area ");

			else

			System.out.print("Seat "+num+col+" is a non smoking area ");

			do{
       		System.out.println("Do you wish to Proceed Y/N");
			proceed=Keyboard.readChar();
			proceed = Character.toUpperCase(proceed);

				if (proceed != 'Y' && proceed !='N')

				System.out.println("Please enter Y or N");

			}while(proceed != 'Y' && proceed !='N');

		}while(proceed !='Y');

       		P[num-1][col-65]='x';

       		System.out.println("\nThe seat "+num+col+" is now booked\n");


  }// end book seat



	////////////////////////////////////
	//           RESET PLANE		 ///
	////////////////////////////////////

	static void resetplane(char P[][]){
char ans;

do{

System.out.println("Are you sure you you want to do this Y/N");

 ans=Keyboard.readChar();
if (ans != 'Y' && ans !='N' && ans != 'y' && ans !='n')

System.out.println("Please enter Y or N");


if (ans == 'Y' || ans =='y')

for(int r=0; r<P.length; r++)
		{
			for(int c=0; c< P[r].length; c++)
				P[r][c]='-';




		}//end of for

}while(ans != 'y' && ans != 'Y' && ans != 'n' && ans != 'N');

}//end of resetplane

	////////////////////////////////////
	///           CANCEL A SEAT      ///
	////////////////////////////////////
static void cancelseat(char P[][]){

			int num;
			char col;

		do{

			do{
				System.out.print("Enter the row number you would like to cancel:  ");
				num =Keyboard.readInt();
					if (num < 1 || num > 8){

					System.out.println("\nThere is only 8 rows please enter number between 1 and 8 please:  \n");

				}//end if
			}while(num< 1 || num > 8);

			do{

       		System.out.print("Enter the Colume letter you would like to cancel:  ");
       		col =Keyboard.readChar();
       		col = Character.toUpperCase(col);

       			if (col !='A' && col !='B' && col !='C' && col !='D'){

					System.out.println("\nPlease enter colume A,B,C or D:  \n");

				}//end if

			}while(col !='A' && col !='B' && col !='C' && col !='D');

			if (P[num-1][col-65]=='-')

			System.out.println("\nThe seat "+num+col+" is not booked please choose another!\n");

			}while(P[num-1][col-65]=='-');


       		P[num-1][col-65]='-';

			System.out.println("\nThe seat "+num+col+" is now cancled\n");

 }// end book seat

	}//end of class
*/