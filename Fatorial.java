
public class Fatorial {
	
	
	public int calcFatorial (int n) {
  	  
  	  if(n==0 || n==1 ) {
  		  return 1;
  	  }
  	  else
  	  {
  		 return n*calcFatorial(n-1);
  	  }

}
}
