class Solution {
    int[] f=new int[46];
    public int climbStairs(int n) {
        // if(n==1){
        //     return 1;
        // }
        // if(n==2){
        //     return 2;
        // }

        // return climbStairs(n-1)+climbStairs(n-2);

        // double phi = ((1-Math.sqrt(5))/2);
		// double Phi = ((1+Math.sqrt(5))/2);
		// double s5=Math.sqrt(5);
		
		// int result=(int)((Math.pow(Phi,n+1)-Math.pow(phi,n+1))/s5);
		// return result;

	if (n ==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    if(n==2){
        return 2;
    }

	
	
	if (f[n] != 0)
		return f[n];
	
	// calculating fib_term(n)
	else {
		f[n] = climbStairs(n - 1) + climbStairs(n - 2);
		return f[n];
	}




    }
}