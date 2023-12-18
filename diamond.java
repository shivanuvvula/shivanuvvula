public class Diamond
{
     public static void main(String args[])
     {
        int rows1=5,cols=9;
        for(int r=1;r<=rows1;r++)
           {
              for(int x=rows1;x>=r;x--)
                 {
                  System.out.print(" ");
                  }
              for(int a=1;a<=r;a++)
                 {
                   if(a==r)
                    System.out.print(a+" ");
                 }
               for(int b=1;b<=r)
              
            System.out.println();
           }
     }
}