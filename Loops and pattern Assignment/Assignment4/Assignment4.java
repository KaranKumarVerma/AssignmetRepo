class Assignment4{
    public static void main(String args[])
    {
        int n=12;
        for(int i=0;i<n;i++)//To print P Alphabet
        {
            for(int j=0;j<=(n-1)/2;j++)
            {
                if((i==0 && j<(n-1)/2)||(j==0 && i<=n-1)||(i==(n-1)/2 && j<(n-1)/2)||(j==(n-1)/2 && i<(n-1)/2))
                {
                    System.out.print("*");
                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0;j<n-1;j++)//To print W Alphabet
            {
                if((j==0 && i<n-1)||(j==(n+1)/2 && i<n-1)|| (i+j==n-1 && j>=0 && j<(n/3) && i<=n-1)|| (i-j==(n-1)/2 && j>=n/3 && j<(n+1)&&i<=n-1))
                {
                    System.out.print("*");
                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0;j<=(n-1)/2;j++)//To print S Alphabet
            {
                if((i==0 && j>0 && j<(n-1)/2)||(i==(n-1)/2 && j>0 && j<(n-1)/2)||(i==n-1 && j>0 && j<(n-1)/2)||
                (j==0 && i>0 && i<(n-1)/2)&& j<(n-1)/2||(j==(n-1)/2 && i<(n-1) && i>(n-1)/2))
                {
                    System.out.print("*");
                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0;j<=(n+1)/2;j++) //To print K Alphabet
            {
                if(j==0||i+j==(n-1)/2 ||(i-j==(n-1)/2))
                {
                    System.out.print("*");
                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0;j<=(n-1)/2;j++) //To print I Alphabet
            {
                if((i==0||i==n-1)&&j<(n-1)/2 ||j==((n-1)/2)/2)
                {
                    System.out.print("*");
                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0;j<=(n-1)/2;j++) //To print L Alphabet
            {
                if(j==0||(i==n-1 && j<(n-1)/2))
                {
                    System.out.print("*");
                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0;j<=(n-1)/2;j++) //To print L Alphabet
            {
                if(j==0||(i==n-1 && j<(n-1)/2))
                {
                    System.out.print("*");
                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            for(int j=0;j<=(n-1)/2;j++)//To print S Alphabet
            {
                if((i==0 && j>0 && j<(n-1)/2)||(i==(n-1)/2 && j>0 && j<(n-1)/2)||(i==n-1 && j>0 && j<(n-1)/2)||
                (j==0 && i>0 && i<(n-1)/2)&& j<(n-1)/2||(j==(n-1)/2 && i<(n-1) && i>(n-1)/2))
                {
                    System.out.print("*");
                    
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }   
}