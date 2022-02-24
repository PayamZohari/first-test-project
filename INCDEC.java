import java.util.*;
class CheckNumber {

public static void main(String []a) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();//7663 7675

boolean asc=true, desc=true;

int r,r1=n%10;
n/=10;

while(n>0) {
	r=n%10;
	if(r1<r) {asc=false;}
	if(r1>r) {desc=false;}
	n/=10;
	r1=r;
	System.out.println(r);
	}

	if(asc)
		System.out.println('+');
	else if(desc)
		System.out.println('-');
	else
		System.out.println('0');
   }
}