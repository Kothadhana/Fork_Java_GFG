class Geeks{
    
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n=sc.nextInt();
		    System.out.println(n);
		    float f=sc.nextFloat();
		    System.out.println(f);
		    long l=sc.nextLong();
		    System.out.println(l);
		    byte b=sc.nextByte();
		    System.out.println(b);
		    sc.nextLine();
		    String s=sc.nextLine();
		    System.out.println(s);
		}
		
    }
    
}
