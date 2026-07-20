package Recursion;

public class ReverseNum {
/*	static int rev = 0;

    static int reverse(int n) {
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + (n % 10);
        return reverse(n / 10);
    }

    public static void main(String[] args) {
        int num = 12345;

        System.out.println(reverse(num));
    }
    
*/
	
	static int reverse(int n,int rev) {
		if(n==0) {
			return rev;
		}
		return reverse(n/10,rev*10+(n%10));
	}
	
	public static void main(String[] args) {
		int res = reverse(153,0);
		System.out.println(res);
	}

}
