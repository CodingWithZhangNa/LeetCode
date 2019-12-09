package lianxi;

public class ZuiChangHuiWenZiChuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = longestPalindrome("sshg");
		System.out.print("s="+s);
	}
	
	public static String longestPalindrome(String s) {
	        if ( s.length() == 0 ) return s;
	        int res = 1;
	        int ll = 0;
	        int rr = 0;
	        
	        for ( int i = 0; i<s.length() ; i++ ){
	            int l = i - 1;
	            int r = i + 1;
	            while ( l >= 0 && r < s.length() && s.charAt(l)==s.charAt(r) ){
	                int len = (r-l+1) ;
	                if (len > res){
	                    res = len;
	                    ll = l;
	                    rr = r;
	                }
	                l--;
	                r++;
	            }
	            l = i;
	            r = i + 1;
	            while ( l >= 0 && r < s.length() && s.charAt(l)==s.charAt(r) ){
	                int len = (r-l+1) ;
	                if (len > res){
	                    res = len;
	                    ll = l;
	                    rr = r;
	                }
	                l--;
	                r++;
	            }
	        }
	        return s.substring(ll,rr+1);        
	    }

}

