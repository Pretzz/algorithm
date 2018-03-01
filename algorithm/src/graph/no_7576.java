package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no_7576 {
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static int n,m;
	static Queue<Pair> q = new LinkedList<Pair>();
	static int [][] tmt;
	static boolean possible = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		tmt = new int [m][n];
		
		for(int i=0; i<m; i++) {
			String a = sc.nextLine();
			String [] b = a.split(" ");
			for(int j=0; j<n; j++) {				
				tmt[i][j] = Integer.parseInt(b[j]);
			}			
		}
		
		//System.out.println("Hello");
		//bfs(tmt, map);
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {	
				if(tmt[i][j] == 1) {
					q.add(new Pair(i,j,0)); //1인 시작지점의 자표 추가					
				}
			}			
		}
		bfs();
		
		int max = 0;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(tmt[i][j] == 0) {
					System.out.println("-1");
					return;
				}else {
					if(tmt[i][j] > max) {
						if(possible) {
							max = tmt[i][j];
						}else {
							max = 0;
						}
						
					}				
				}					
			}			
		}
		System.out.println(max);
	}
	
	public static void bfs()  {		
		
		while(!q.isEmpty()){ //q가 빌때까지 진행
           Pair p = q.remove(); //
           
            for(int i=0; i<4; i++) {
    			int nx = p.x+dx[i];
    			int ny = p.y+dy[i]; 
    			
    			if(-1 < nx && nx < m && -1 < ny && ny < n) {
    				if(tmt[nx][ny] == 0) {    	
    					q.add(new Pair(nx,ny,p.cnt+1));
        				tmt[nx][ny] = p.cnt+1;
        				possible = true;
        			}
    			}
    			
    		}
        }
		
	}
}

class Pair{
int x,y,cnt;
	
	Pair(int x, int y,int cnt) {
		this.x = x;
		this.y= y;
		this.cnt = cnt;
	}	
}
