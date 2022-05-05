package jawabykiranok;

public class polymorphism {
int a;
String name;
String pankaj;
public void add(int number){
	this.a=number;

}
public void sub(String kam,int b){
	this.name=kam;
	this.a=b;
	
}
private void multi(String name , String pankaj, int c){
	this.name=name;
	this.pankaj=pankaj;
	this.a=c;
	
}
public void display(){
	System.out.println(a);
	System.out.println(name);
	System.out.println(pankaj);
}
	public static void main(String[] args) {
		polymorphism aa=new polymorphism();
		aa.add(50);
		aa.sub("ingole",52);
		aa.multi("pankaj","Ingole",32);
		aa.display();
	}

}