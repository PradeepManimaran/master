package org.day7;
public class Arr1 {
	public static void main(String[] args) {
int a[] = new int[4];
a[0] = 2;
a[1] = 2;
a[2] = 2;
a[3] = 7;
int s = 0;
//System.out.println(a.length);

for (int i = 0; i < a.length; i++) {
	s = s + a[i];
}
float f = s/a.length;
System.out.println(f);




//for (int i : a) {
	//System.out.println(i);
}
}
	//}}

//System.out.println(a[3]);
//System.out.println(a.length);
/*for(int i=0;i<a.length; i++)
{
	System.out.println(a[i]);
}
}
}*/
//int a[] = {1, 2, 3, 4, 5}