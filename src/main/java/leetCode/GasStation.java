package leetCode;

public class GasStation {

	public static void main(String[] args) {
		int[] gas = new int[] {1,2,3,4,5};
		int[] cost = new int[] {3,4,5,1,2};
		int currentGas =0;
		int start = 0, toBreak = 0;
		
		
		for(int i= 0; i< gas.length;i++) {
			if(i == gas.length-1) {
				i=0;
			}
			if(gas[i]>cost[i] || currentGas>cost[i]) {
				if(start ==0) {
				currentGas = (gas[i]-cost[i]) +gas[i+1];	
				System.out.println(currentGas);
				}else {
					currentGas = (currentGas-cost[i]) +gas[i+1];
					System.out.println((currentGas-cost[i]) +gas[i+1]);
					start =1;
				}
				
				
			}
		}
	}

}
