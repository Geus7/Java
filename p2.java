class Mythread extends Thread{
Mythread(){
System.out.println("Thread created"+this);
start();}
public void run()
{
try{
for(int i=5;i>0;i--)
{
System.out.println(" child thread: "+i);
Thread.sleep(1000);
}
}catch(InterruptedException e){
System.out.println("Sys interuppted: "+e);
}
}
}
class p2{
public static void main(String[]args){
Mythread t= new Mythread();
t.setName("Pooja's thread");
System.out.println("after change now:"+t);
t.start();
}
}
