package jawabykiranok;

public class stringreplace {

	public void m1(String a){
		String name=a.replaceAll("Pankaj" , "SPM");
		System.out.println(name);
	}
    public static void main(String[] args) {
    	stringreplace sc=new stringreplace();
    	sc.m1("Pankaj Ingole Velocity placement 10 LPA ");
	}
}
