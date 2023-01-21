import java.util.*;
class matrices{
public static void main(String args[]){
	int mat1[][]=new int[3][2];
	int mat2[][]=new int[2][3];
	int mat1[][]=new int[3][3];	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++){
		for(int j=0;j<2;j++){
		mat1[i][j]=sc.nextInt();
		}	
	}
	for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
		mat2[i][j]=sc.nextInt();
		}	
}
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			mat3[i][j]=0;
			for(int k=0;k<3;k++){
				mat3[i][j]=mat3[i][j]+mat1[i][j]*mat2[k][j];
			}
		}
	}
   }
} 