import java.io.*;
interface i1{
int a=10;
String b="hello";
}
interface i2 extends i1{
void display();
}
class A implements i2{
public void display(){
System.out.println("a="+a);
System.out.println("name="+b);
}}
class interfaceexample{
public static void main(String args[]){
A a1=new A();
a1.display();
}}
