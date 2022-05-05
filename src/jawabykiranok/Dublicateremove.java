package jawabykiranok;

public class Dublicateremove {
	
  public void m1(String a){
	  int count=0;
	  char c;
	  for(int i=0;i<a.length();i++){
		  for(int j=i+1;j<a.length();j++){
			  char k= a.charAt(i);
			  char m=a.charAt(j);
			  if(k==m){
				  count++;
				  System.out.println(a.charAt(i));
			  }
		  }
		
	  }System.out.println(count);
	 
  }public static void main(String[] args) {
	  Dublicateremove aa=new Dublicateremove();
		  aa.m1("pankajingole");
	  }
}

