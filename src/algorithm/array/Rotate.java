package algorithm.array;

public class Rotate {

//	文字列の回転
//	2つ並べて、その中に文字列が存在するかを調べる
	
	public boolean isRotate(String s1, String s2) {
		int s1Len = s1.length();
		if(s1Len != s2.length() && s1Len > 0) return false;
		String s = s1 + s1;
		return isSubstring(s, s2);		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
	}

}
