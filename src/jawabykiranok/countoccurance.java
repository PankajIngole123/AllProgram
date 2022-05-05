package jawabykiranok;

public class countoccurance {
public void m1(String a){
	int count=0;
	for (int i=0;i<a.length();i++){
       for(int j=i+1;j<a.length();j++){
    	   if(a.charAt(i)==a.charAt(j)){
    		   count++;
    		   System.out.println(a.charAt(i));
    	   }
    		  
    	   
    	         } 
	}
}public static void main(String[] args) {
	countoccurance aa=new countoccurance();
	aa.m1("pankajmj");
}
}
