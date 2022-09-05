package Array;
//this is for 2D Matrix
public class sprialMatrix {
	public static void sprial_print(int[][] matrix) {
		int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                
                System.out.print(matrix[endRow][j]+" ");
            }
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        System.out.println();
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{6,6,2,28,2},{12,26,3,28,7},{22,25,3,4,23}};
		sprial_print(matrix);
	}

}
