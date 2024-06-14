import java.util.*;

class Diamond{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no.of rows");

		int row = sc.nextInt();

		int col = 0;

		int space = 0;

		int num = 1;

		for(int i=1;i<row*2;i++){
		
			if(i<=row){
			
				space = row-i;
			}

			else{
			
				space = i-row;
			}

			for(int sp=1;sp<=space;sp++){
			
				System.out.print("\t");
			
			}

			if(i<=row){
			
				col = i*2-1;
				num = i;
			
			}

			else{
			
				col = col-2;
				num = row*2-i;
			
			}

			
			for(int j=1;j<=col;j++){

				if(j<=(col/2)){

					System.out.print(num-- +"\t");

				}

				else{
				
					System.out.print(num+++"\t");
				}

				}

				System.out.println();
							
			}
				
		}
	
	}
