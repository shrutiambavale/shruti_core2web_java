import java.util.*;
class Arr5{
        public static void main(String[] S){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter size:");
                int s=sc.nextInt();
                int arr[]=new int[s];
                int a=1;
                for(int i=0;i<2;i++){
                System.out.println("Enter Arr "+a++);
                for(int j=0;j<s;j++){

                        arr[j]=sc.nextInt();
                }
                }
                for(int i=0;i<2;i++){

                for(int j=0;j<s;j++){

                        System.out.print(arr[j]+"    ");
                }
                }
        }
}

