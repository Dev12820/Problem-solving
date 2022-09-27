public class P9 {
    public static void main(String[] args) {
        
    int i,j;
    int gap =3;

		for ( j = 1 ; j <= 5; j++ )
		{
		
		for ( i = 1 ; i <= gap ; i++ )
        {
			System.out.print(" ");
		
		gap --;
        }

        for( int k=1;k<=j;k++)
        System.out.print("*");
        System.out.println("");
        j++;
    }
    int ap =1;

		for ( j =3 ; j >= 1; j-- )
		{
		
		for ( i=1; i<=ap; i++ )
        {
			System.out.print(" ");
		
        }
            ap=ap+1;

        for( int k=1;k<=j;k++)
        System.out.print("*");
        System.out.println("");
        j--;
}
}
}

        
    

