package wrapperclass;

import java.io.IOException;
class throwsexp{
	 void m()throws IOException{
		    throw new IOException("device error");//checked exception
		  }
  void n() throws IOException{
    m();
  }
  void p(){
   try{
    n();
   }catch(Exception e){System.out.println("exception handled");}
  }
  public static void main(String args[]){
	  throwsexp obj=new throwsexp();
   obj.p();
   System.out.println("normal flow...");
  }
}