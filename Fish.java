class Fish
{
String fishname;
int count;
boolean fishtank;
public Fish(String fn,int c,boolean ft)
{
fishname=fn;
count=c;
fishtank=ft;
System.out.println(fishname+count+fishtank);
}
public static void main(String[]args)
{
Fish F1=new Fish("Goldfish",6,true);
}
}
