package jawabykiranok;

import java.awt.font.NumericShaper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class deom {

	private static int max;

	public static void main(String[] args) {
		
	/*	
String[] a=name.split(" ");
Map<String,Integer> map= new HashMap();
for(int i=0;i<a.length;i++	){
	if(!map.containsKey(a[i])){
		map.put(a[i], count);
	 } else{
		 map.put(a[i], map.get(a[i])+i);
	 }}
	for(String e : map.keySet()){
		System.out.println(e+ "  "+map.get(e));
	}
	
*/   /*   
		for(int i=0;i<name.length();i++	){
			for(int j=i+1;j<name.length();j++	)
		if(name.charAt(i)==name.charAt(j)){
			
		count++;
			System.out.println(name.charAt(i)+" "+count);	
			break;
		}
		
	String a="pankaj ingole e";
	char arr[]=a.toCharArray();
	for(int i=0;i<arr.length;i++){
	int count=1;
	for(int j=i+1;j<arr.length;j++){
	if(arr[i]==arr[j] ){
	count++;
	arr[j]='0';
	}
	}
	if(count>1 && arr[i]!='0' ){
	System.out.println(arr[i]);
	}
	}
	}
	*/

	/*	String name="pankaj";
		String name2="pajkan";
	 int count=0;
	 char[] a=name.toCharArray();
	 char[] b=name2.toCharArray();
	 
	 Arrays.sort(a);
	 Arrays.sort(b);
	 
	 if(Arrays.equals(a, b)){
		 System.out.println("yes");
	 }else{
		 System.out.println("no");
	 }
	
		String name="pajnkpajn";
		
for(char i : name.toCharArray()){
	if(name.indexOf(i)==name.lastIndexOf(i)){
		System.out.println(i);
		break;
	}
	*/
/*		
		String a="pankaj ingole e";
		String m=" ";
		String am[] =a.split(" ");
		for(int i=am.length-1;i>=0;i--){
			m=m+" " +am[i];
			//System.out.println(am[i]);
	
} /*
		for(int j=m.length()-1;j>=0;j--){
			
			System.out.println(m.charAt(j));
		
		
			
		
		int[] ak={20,45,2,63,12,98,32};
		max=ak[0];
		for(int i=0;i<ak.length;i++){
			if(max>ak[i]){
				max=ak[i];
				
			}
			
		}
		System.out.println(max);
		}
	*/ /*
		
		String ak="pankaj ingole velocity pankaj velocity";
		
		String[] ams=ak.split(" ");
		
		
		
		Set<String> map=new LinkedHashSet<>();
	    for(String e : ams){
		map.add(e);
	    }
				Iterator itr=map.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next()+ " ");
		}
		*/ /*	
		int aaa=456;
		int km=aaa;
		int sum=0;
		while(km>0){
			
			int io=km%10;
			 sum=sum*10+io;
		   km=	 km/10;
		}
		System.out.println(sum);
		
		*/ /*	
		int a=0, b=1; int c;
		for(int i=0;i<5;i++){
			
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
		}
		*/ /*
		int a=1;
		int fact=1;
		for(int i=1;i<=8;i++){
		 fact=fact*i;
			
		}
		
		
		System.out.println(fact);
		
		*/
		for(int i=0;i<=8;i++){
			for(int j=8;j>i;j--){
				System.out.print(" ");
		}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
		}
		
		
			System.out.println();
		
}}}
