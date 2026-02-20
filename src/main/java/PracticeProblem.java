public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray(){
		//initiate and populate array arr
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++){
			arr[i] = i+1;
		}

		return arr;
	}

	public static String[] createArray(String a, String b, String c, String d){
		String[] arr = {a,b,c,d};
		return arr;
		//???????
	}

	public static int findValue(int x,int[] arr){
		//return index if found, else get outta there
		for(int i = 0; i < arr.length;i++){
			if(arr[i] == x){
				return i;
			}
		}
		return -1;
	}

	public static int findThirdValue(String str, String[] arr){
		int count = 0;
		//with counter, increment every time str in arr, return index if counter reaches 3
		for(int i = 0; i < arr.length; i++){
			if (arr[i].equals(str)){
				count++;
			}

			if (count >= 3){
				return i;
			}
		}
		return -1;
	}
}
