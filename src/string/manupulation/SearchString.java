package string.manupulation;

public class SearchString {
public static void main(String[] args) {
	int[][] Q= {{3,3,3},{3,5,16},{3,4,14}};
	String[] arr = new String[5];
	arr[0]="aaaaaaa";
	arr[1]="bbbbbbb";
	arr[2]="ccccccc";
	arr[3]="ddddddd";
	arr[4]="eeeeeee";
	char[] solve = solve(Q, arr);
	System.out.println(solve);
	
}

static char[] solve(int[][] Q, String[] arr){
    char [] ans= new char[Q.length];
   for(int i=0;i<Q.length;i++){
       int s_pos= Q[i][0]-1;
       int e_pos=Q[i][1]-1;
       int c_pos=Q[i][2]-1;
       
       String str = new String();
       while(s_pos<=e_pos){
    	   if(s_pos>=arr.length) {
    		   break;
    	   }
           str+=arr[s_pos];
           s_pos++;
       }
       if(c_pos<str.length()){
           
       ans[i]=str.charAt(c_pos);
       }
   }
   return ans;
}
}
