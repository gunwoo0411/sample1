package exex;

public class asdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3;
		int count=1;
		int temp=0;
		
		for(int j=1;j<=3;j++) {
		
		for(int i=(count*num)-1; i<(count+1)*num-1; i++) {
			//System.out.print(i);
			
				System.out.print(i +"*" +j +"=" +i*j+"   ");
				
			}
			System.out.println();
			
		}
	}
}
