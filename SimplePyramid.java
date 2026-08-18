public class SimplePyramid {
    public static void main (String [] args)
    {
    // THis is a simple pyramid program 
    //   * * * * *
    //   * * * * 
    //   * * * 
    //   * * 
    //   * 
    //  for ( int i = 1 ; i<=5; i++)
    //  {
    //     for(int j = 1; j<=i; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //  }
    // }

    // This is simple pyramid with left aligned
    // * * * * * 
    // * * * * 
    // * * * 
    // * * 
    // * 
    for( int i = 1 ; i<=5 ;i++)
        {
        for(int j=5; j>=i; j--)
            {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
