class Karan{
    public static void main(String args[])
    {
        int n=8;
        System.out.println("\n\n");
        // To print Karan
        for(int i=0;i<n;i++)
        {
                for(int j=0;j<=(n+1)/2;j++) //To print K Alphabet
            {
                if(j==0||i+j==(n-1)/2 ||(i-j==(n-1)/2))
                {
                    System.out.print("#");
                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // TO print A
            for(int j=0;j<=(n-1)/2;j++)
            {
                if((i==0 && j>0 && j<(n-1)/2) || (j==0 && i>0) || (j==(n-1)/2 && i>0)||(i==(n-1)/2 && j<= (n-1)/2))
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
             //To print R Alphabet
          for(int j=0;j<=(n+1)/2;j++)
          {
              if((i==0 && j<(n-1)/2)||(j==0 && i<=n-1)||(i==(n-1)/2 && j<(n-1)/2)||(j==(n-1)/2 && i<(n-1)/2)||i-j==(n-1)/2)
              {
                  System.out.print("#");
                  
              }
              else
              {
                  System.out.print(" ");
              }
          }
            System.out.print(" ");
         // TO print A
         for(int j=0;j<=(n-1)/2;j++)
         {
             if((i==0 && j>0 && j<(n-1)/2) || (j==0 && i>0) || (j==(n-1)/2 && i>0)||(i==(n-1)/2 && j<= (n-1)/2))
             {
                 System.out.print("#");
             }
             else
             {
                 System.out.print(" ");
             }
         }
         System.out.print(" ");
          // TO print N
          for(int j=0;j<=(n-1);j++)
          {
              if(((j==0 && i>0) || (j==(n-1) && i>=0)||i==j ))
              {
                  System.out.print("#");
              }
              else
              {
                  System.out.print(" ");
              }
          }
          System.out.print(" ");
            System.out.println();
        }
        
        System.out.println("\t\t");

    // To print Kumar word
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=(n+1)/2;j++) //To print K Alphabet
            {
                if(j==0||i+j==(n-1)/2 ||(i-j==(n-1)/2))
                {
                    System.out.print("#");
                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
              // TO print U
         for(int j=0;j<=(n-1)/2;j++)
         {
             if((j==0 && i<n-1)||(j==(n-1)/2 && i<n-1)||(i==(n-1) && j>0 && j<(n-1)/2))
             {
                 System.out.print("#");
             }
             else
             {
                 System.out.print(" ");
             }
         }
         System.out.print(" ");
       // TO print M
       for(int j=0;j<=(n-1);j++)
       {
           if(((j==0 && i>0) || (j==(n-2) && i>=0)||(i==j && i<=(n-1)/2)||(j+i==n-(n/4) && i<=(n-1)/ 2)))
           {
               System.out.print("#");
           }
           else
           {
               System.out.print(" ");
           }
       }
       System.out.print(" ");
  // TO print A
  for(int j=0;j<=(n-1)/2;j++)
  {
      if((i==0 && j>0 && j<(n-1)/2) || (j==0 && i>0) || (j==(n-1)/2 && i>0)||(i==(n-1)/2 && j<= (n-1)/2))
      {
          System.out.print("#");
      }
      else
      {
          System.out.print(" ");
      }
  }
  System.out.print(" ");

            //To print R Alphabet
          for(int j=0;j<=(n+1)/2;j++)
          {
              if((i==0 && j<(n-1)/2)||(j==0 && i<=n-1)||(i==(n-1)/2 && j<(n-1)/2)||(j==(n-1)/2 && i<(n-1)/2)||i-j==(n-1)/2)
              {
                  System.out.print("#");
                  
              }
              else
              {
                  System.out.print(" ");
              }
          }
            System.out.print(" ");
           System.out.println();
        }

        System.out.println("\t\t");
        
// To Print VERMA
        for(int i=0;i<n;i++)
        {
    
     // TO print V
     for(int j=0;j<=(n-1);j++)
     {
         if((j==0 && i<(n+1)/2||j==n-(n/4) && i<(n+1)/2||(i-j==(n/2)|| i+j==n+(n/4) && j<n-1)))
         {
             System.out.print("#");
         }
         else
         {
             System.out.print(" ");
         }
     }
          System.out.print(" ");
 //To print R Alphabet
 for(int j=0;j<=(n+1)/2;j++)
 {
     if((i==0 && j<(n-1)/2)||(j==0 && i<=n-1)||(i==(n-1)/2 && j<(n-1)/2)||(j==(n-1)/2 && i<(n-1)/2)||i-j==(n-1)/2)
     {
         System.out.print("#");
         
     }
     else
     {
         System.out.print(" ");
     }
 }
   System.out.print(" ");
    // TO print E
    for(int j=0;j<=(n-1)/2;j++)
            {
                if((i==0 && j<= (n-1)/2 )||(j==0)||(i==n-1 && j<= (n-1)/2)|| (i==(n-1)/2 && j>0 && j<=(n-1)/2))
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }   
            }
            System.out.print(" ");

    // TO print M
       for(int j=0;j<=(n-1);j++)
       {
           if(((j==0 && i>0) || (j==(n-2) && i>=0)||(i==j && i<=(n-1)/2)||(j+i==n-(n/4) && i<=(n-1)/ 2)))
           {
               System.out.print("#");
           }
           else
           {
               System.out.print(" ");
           }
       }
       System.out.print(" ");
  // TO print A
  for(int j=0;j<=(n-1)/2;j++)
  {
      if((i==0 && j>0 && j<(n-1)/2) || (j==0 && i>0) || (j==(n-1)/2 && i>0)||(i==(n-1)/2 && j<= (n-1)/2))
      {
          System.out.print("#");
      }
      else
      {
          System.out.print(" ");
      }
  }
  System.out.print(" ");           
           
            System.out.println();
        }
    }   
}