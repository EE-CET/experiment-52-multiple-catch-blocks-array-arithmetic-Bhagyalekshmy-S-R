import java.util.Scanner;

public class MultipleCatch {
    
        public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               int n=sc.nextInt();
               int[] arr=new int[n];
               for(int i=0;i<n;i++){
                      arr[i]=sc.nextInt();
                   }
                int index=sc.nextInt();
                int divisor=sc.nextInt();

                int result=0;
                 try{
                    result=arr[index]/divisor;
                    System.out.println(result);
                    }
                 catch(ArithmeticException e){
                    System.out.println("Divide by zero error");
                    }
                  catch(ArrayIndexOutOfBoundsException e){
                     System.out.println("Invalid Index");
                    }
               sc.close();

  }    
}
