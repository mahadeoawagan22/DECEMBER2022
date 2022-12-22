package programme;

public class RevNo {
public static void main(String[] args) {
	int no=323;
	int rev =0;
	int newno;
	newno=no;
	while(no!=0) {
		rev=rev*10+no%10;  //0*10+323%10 =3
		
		no=no/10; //   323/10 =32
	}
	//System.out.println(rev);

if( rev==newno) {
	System.out.println( newno + " no is palandrome");
	
}
else {
	System.out.println(newno + " no is not palandrome ");
}
}
}