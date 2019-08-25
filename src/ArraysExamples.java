
public class ArraysExamples {
	public static void main(String[] args) {
		ArraysExamples exm = new ArraysExamples();
		exm.characterOccurrence("samyakjain");
		//ArraysExamples.distinctArray(new int[] {3,3,2,5,6,7});
		
	}

	public static void distinctArray(int[] duplicateArray) {
		int count=0;
		for(int i=0;i<duplicateArray.length;i++) {
			for(int j=i+1;j<duplicateArray.length;j++) {
				if((duplicateArray[i]==duplicateArray[j])) {
					duplicateArray[j]=0;
				}
			}
		}
		for(int i : duplicateArray) {
			if(i==0)
				count++;
		}
		System.out.println("duplicate array size:"+(duplicateArray.length-count));
	}

	public void characterOccurrence(String input) {
//		for(char c : input.toCharArray()) {
//			System.out.print((int)c+",");
//		}
		char[] c = input.toCharArray();
		for(int i=0;i<c.length;i++) {
			int count=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
				}
			}
			System.out.print(c[i]);
			System.out.print(","+count);
		}
	
		
	}


	}
