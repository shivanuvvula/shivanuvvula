class Discount
{ 
  public static void main(String args[])
  {
   int age =65;
   String gender="female";
    String occupation="working";
    if(gender=="female")
      {
         if(age>60)
         {
            if(occupation=="retaired")
             {
                System.out.println("you are eligible for the discount");
             }
            else 
             {
                System.out.println("you are not eligible , because u are not retaired");
             }
          }
         else
         {
	      System.out.println("you are not eligible , because ur age is not>60 ");
         }
      }	

   else 
     {
      System.out.println("you are not eligible for discount , because u are not a female");
     }
}
}
          
     