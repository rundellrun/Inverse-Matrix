package com.example.inversematrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.LUDecomposition;

public class Matrix {
    private int rows;
    private int columns;
    private double[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }


    public double getValue(int row, int column) {
        return data[row][column];
    }

    public void setValue(int row, int column, double value) {
        data[row][column] = value;
    }

        // Other matrix-related methods...
    public double[][] getInverse(){
        RealMatrix matrix = new Array2DRowRealMatrix(this.data);
        RealMatrix inverseMatrix = new LUDecomposition(matrix).getSolver().getInverse();
        return inverseMatrix.getData();
    }
}
