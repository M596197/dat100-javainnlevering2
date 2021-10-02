package no.hvl.dat100.lab6.matriser;

public class Matriser {
	public static void main(String[] args) {
	 int[][] a = { {1,2,3}, {4,5,6}, {7,8,9} };
	 int[][] b = { {10,11,12}, {13,14,15},{13,14,15} };
	 
	
	skrivUt(a);
	skrivUt(b);
	System.out.println(tilStreng(a));
	skrivUt(skaler(2,a));
	skrivUt(speile(a));
	System.out.println(erLik(a,b));
	multipliser(a,b);
	}
	
	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int [] i : matrise) {
			for(int j : i) {
			System.out.print(j + "\t");
			} 
			System.out.println();
		}System.out.println();
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String tekst="";
		for(int [] i : matrise) {
			for(int j:i) {
				tekst += j+" ";
			}
			tekst += "\n";
		}
		return tekst;
		}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][]ny = new int[matrise.length][matrise.length];
		for(int i=0;i<matrise.length;i++) {
			int[] rad = matrise[i];
			for(int j=0;j<rad.length;j++) {
				ny [i][j]=matrise[i][j] *tall;
				}
		}
		return ny;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean like=true;
		for (int i =0; i<a.length;i++) {
			int []rad = a[i];
			for(int j = 0; j<rad.length; j++) {
				if(a[i][j]!=b[i][j]) {
					like=false;
				}
			}
		}
		return like;
	}
	// e)
	public static int[][] speile(int[][] matrise) {
		int [][] ny = new int [matrise.length][matrise.length];
		for(int i=0; i<matrise.length;i++) {
			int rad[]=matrise[i];
			for(int j=0; j<rad.length;j++) {
				ny [j][i]= matrise[i][j];
			    ny [i][j] = matrise[j][i];    
			}
		}
		return ny;
		}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][]ny = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				for(int g=0;g<3;g++){
			ny[i][j]+=a[i][g]*b[g][j];
			
			}System.out.print(ny[i][j] + " ");
			}System.out.println();
		}
		return ny;
	}
}

