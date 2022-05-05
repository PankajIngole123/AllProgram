package jawabykiranok;

public class commanelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]={20,30,45,85,46,63,4};
    int arr1[]={40,31,45,5,46,3,4};
    for(int i=0;i<arr.length;i++){
    	for(int j=0;j<arr.length;j++){
    	  if(arr[i]==arr1[j]){
    		  System.out.println(arr[i]);
    	  }
    	}
    }
	}

}
