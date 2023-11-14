package com.example.inversematrix;

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
}
