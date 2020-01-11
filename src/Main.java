import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;


public class Main {

    public static void main(String[] args) {
       GlobalData globalData = new GlobalData(1,2,1,2, 25, 1.25);
       GlobalData globalData1 = new GlobalData(2,3,0,2, 25, 1.25);
       GlobalData globalData2 = new GlobalData(3,4,2,2, 25, 1.25);

       GlobalData[] globalDataArray = new GlobalData[3];
       globalDataArray[0] = globalData;
       globalDataArray[1] = globalData1;
       globalDataArray[2] = globalData2;


       Matrix HG = new Matrix(4,4);

       Matrix results = new Matrix();

       Matrix BG = new Matrix(4,1);

      HG.fillMatrix(globalDataArray);
      //HG.printMatrix();
       System.out.println(" ");

      RealMatrix realMatrix = new Array2DRowRealMatrix(HG.matrix, false);
      realMatrix = MatrixUtils.inverse(realMatrix);
      Matrix reverseMatrix = new Matrix();
      reverseMatrix.matrix = realMatrix.getData();
       //reverseMatrix.printMatrix();
       System.out.println(" ");

       BG.matrix[2][0] += globalDataArray[0].P[0];
       BG.matrix[2][0] += globalDataArray[0].P[1];

       BG.matrix[3][0] += globalDataArray[2].P[0];
       BG.matrix[3][0] += globalDataArray[2].P[1];

       //BG.printMatrix();

       RealMatrix realMatrix1 = new Array2DRowRealMatrix(BG.matrix, false);
       results.matrix = realMatrix.multiply(realMatrix1).getData();

       results.multiplyByMinus();
       results.printMatrix();

    }

}
