package topcoder.past;


public class BinaryCode {

	public String[] decode(String message) {
		String[] ans = new String[2];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = calc(i, message.toCharArray());
			System.out.println(ans[i]);

		}
		return ans;
	}
	
	String calc(int n, char[] message){
		char[] re = new char[message.length];
		re[0] = Character.forDigit(n, 10);
		if (message.length == 1 && (re[0] != message[0])) {
			return "NONE";
		}

		for (int i = 0; i < message.length-1; i++) {
			int ans = 0;
			if(i == 0){
				ans = (message[i]-'0') - (re[i]-'0');
			}else{
				ans = (message[i]-'0') - (re[i-1]-'0') - (re[i]-'0');
			}
			
			if (ans == 1 || ans == 0) {
				re[i+1] = Character.forDigit(ans, 10);
			}else{
				return "NONE";
			}
		}
		
		if ( (message[message.length-1]-'0') != ((re[message.length-1]-'0') + (re[message.length-2])-'0')) {
			return "NONE";
		}
		
		return String.valueOf(re);
		
	}
	

}
