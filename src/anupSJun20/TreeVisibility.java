package anupSJun20;

public class TreeVisibility {
	int count = 0;
	void findTreeVisible(int[] arr) {
		for(int index = 0;index<arr.length;index++) {
			boolean flag = true;
			for(int innerindex = 0;innerindex<index;innerindex++) {
				if(arr[index]<=arr[innerindex]) {
					flag = false;
					break;
				}
				
			}
			if(flag) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		int[] arr = {3,5,5,11,9,10,13} ;
		TreeVisibility treeVisibility = new TreeVisibility();
		treeVisibility.findTreeVisible(arr);
	}

}
