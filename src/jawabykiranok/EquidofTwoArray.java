package jawabykiranok;

public class EquidofTwoArray {
 public void m1(){
	 int arr[]={50,30,45,36,50};
	 int arr2[]={50,55,45,35,42};
	 int count=0;
	 for(int i=0;i<arr.length-1;i++){
		 for(int j=0;j<arr2.length;j++){
			 if(arr[i]==arr2[j]){
			 count++;  
			 System.out.println(arr[i]);
			 }
		 }
		 
	 }System.out.println("Total number of array dublication =="+count);
	
 } public static void main(String[] args) {
	 EquidofTwoArray obj=new EquidofTwoArray();
	 obj.m1();
	
}
}
