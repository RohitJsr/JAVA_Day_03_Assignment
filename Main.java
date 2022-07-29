package Q3;

/*
Wrapper classes:
Classes representation of primitive data types are called as Wrapper Classes.
Primitive Data Types : Wrapper Classes
byte : java.lang.Byte
short : java.lang.Short
int : java.lang.Integer
long : java.lang.Long
float : java.lang.Float
double : java.lang.Double
char : java.lang.Character
boolean : java.lang.Boolean
To identify "min value" and "max value" for each and every data type, JAVA has provided
the following two constant variables from all the wrapper classes.
MIN_VALUE and MAX_VALUE
*/
public class Main{
public static void main(String[] args){
System.out.println(Byte.MIN_VALUE+"----->"+Byte.MAX_VALUE);
System.out.println(Short.MIN_VALUE+"---->"+Short.MAX_VALUE);
System.out.println(Integer.MIN_VALUE+"----->"+Integer.MAX_VALUE);
System.out.println(Long.MIN_VALUE+"----->"+Long.MAX_VALUE);
System.out.println(Float.MIN_VALUE+"----->"+Float.MAX_VALUE);
System.out.println(Double.MIN_VALUE+"----->"+Double.MAX_VALUE);
System.out.println(Character.MIN_VALUE+"----->"+Character.MAX_VALUE);
//System.out.println(Boolean.MIN_VALUE+"----->"+Boolean.MAX_VALUE); //Error
}
}
/*
  Note:- All the above wrapper classes belongs from “java.lang” package.
There are many other uses of wrapper classes as well.


*/