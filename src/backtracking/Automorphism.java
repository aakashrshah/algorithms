package backtracking;

public class Automorphism extends Backtracking implements ApplicationInteface{

	//x[i] = label of ith node.
	int count = 0;
	static int a0 = -1;
	int n;
	int[][] gr;
	
	public Automorphism(int n,int[][] graph) {
		super(a0, n, 0);
		this.n = n;
		this.gr = graph;
		Backtrack();
		System.out.println("Total Outcomes : " + count);
	}


	@Override
	public boolean Bound(int[] x2, int r2) {
		for(int i=0; i < r2; i++){
			if(x2[i] == x2[r2]){
				return false;
			}
			else if(i > -1 && isAnEdge(i,r2)){
				if(!isAnEdge(x2[i],x2[r2])){
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean Domain(int xr) {
		for(int i = 0; i < this.N; i++){
			if(i == xr){
				return true;
			}
		}
		return false;
	}
	
	private boolean isAnEdge(int i, int j) {
		if(i<j){
//			System.out.println(i + " " + j);
			if(gr[i][j] == 1){
				return true;
			}
		}else{
//			System.out.println(j + " " + i);
			if(gr[j][i] == 1){
				return true;
			}
		}
		return false;
	}

	@Override
	public void Print() {
		for(int i = 0; i < this.N; i++){
			System.out.print(x[i] + " ");
		}
		System.out.println();	
		this.count++;
	}

}
