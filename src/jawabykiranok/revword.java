package jawabykiranok;

public class revword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String rev="pankaj ingole";
        rev.split("");
      
      String rev1=" ";
       
       for(int i=rev.length()-1;i>=0;i--){
    	   rev1=rev1 + rev.charAt(i);
    	   
       }
       System.out.println(rev1);
	}

}
