//reverse character array

class ReverseCharArray {
	
	public static void main(String[] args) {
		char[] result = reverseString(new char[] { 'h', 'e', 'l', 'l', 'o' });
		System.out.println(result);
	}

	public static char[] reverseString(char[] s) {
		char[] result = new char[s.length];
		int j = 0;
		for (int i = s.length - 1; i >= 0; i--) {
			result[j++] = s[i];

		}
		return result;

		for(int i = 0; i <s2.length(); i++){
			char c = s2.charAt(i);
			if(map.containsKey(c)){
				map.replace(c,map.get(c) -1);
			}
	}

}