public class Main
{
   public static void main(String[] args)
   {
      int i, j, chk;
      
      System.out.println("---Prime Numbers from 1 to 10---");
      for(i=2; i<=10; i++)
      {
         chk = 0;
         for(j=2; j<i; j++)
         {
            if(i%j==0)
            {
               chk++;
               break;
            }
         }
         if(chk==0)
            System.out.println(i);
      }
   }
}
