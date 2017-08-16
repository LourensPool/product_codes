/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Lourens
 */
public class GFx {
    
    /*
 * GF2 Class
 * 
 * TODO Create a [n][n] matrix which is send over the line
 * TODO ROW DECODER
 */
	
private Integer [][] G = { {1,0,0,0,1,1,1}, {0,1,0,0,1,1,0}, {0,0,1,0,1,0,1}, {0,0,0,1,0,1,1} };
private Integer [][] Info;
private Integer [][] CW;
private Integer [][] Sent;

private int n = 7;
private int k = 4;
private int d = 3;		// floor ((3 - 1) / 2) = 1 error correction
private int GF = 2; 

GFx () {
    
}

public Integer [][] getG () {
        return this.G;
}

public Integer [][] getInfo () {
        return this.Info;
}

public Integer [][] getCW () {
        return this.CW;
}

public Integer [][] getSent () {
        return this.Sent;
}

public int getN () {
        return this.n;
}

public int getK () {
        return this.k;
}

public int getD () {
        return this.d;
}

public int getGF () {
        return this.GF;
}

public String printG () {

        StringBuilder strMatrix = new StringBuilder();

        for (int row = 0; row < this.k; row++){
                for (int column = 0; column < this.n; column++){
                        strMatrix.append(this.G[row][column]);	

                        if (column == this.k -1){
                                strMatrix.append(" ");
                        }

                }
                strMatrix.append(System.getProperty("line.separator"));
        }
        return strMatrix.toString();
}

static String zero (int L){
        return (L <= 0 ? "" : String.format("%0" + L + "d", 0));
}

static String zeroPad (String s, int L){
        return zero(L - s.length()) + s;
}

public void generateInfo () {

        // Generates all infowords and stores them in a 2D array named CW. 
        // https://stackoverflow.com/questions/2795678/fill-array-with-binary-numbers
        final int N = this.k;
        LinkedList<String> list = new LinkedList<String>();
        String infoWord = "";

        // Fill list with info words
        for (int i=0; i < (1 << N); i++){
                 list.add(zeroPad(Integer.toBinaryString(i), N));
        }

        // Fill array [][] this.Info with info words
        int rows = (int) Math.pow(this.GF, this.k);
        this.Info = new Integer[rows][this.k];
        Integer bitvalue;

        while (!list.isEmpty()){

                //infoWord = list.remove();
                //System.out.println(infoWord);

                for (int row = 0; row < rows; row++){
                        infoWord = list.remove();
                        for (int column = 0; column < this.k; column++){
                                bitvalue = Integer.parseInt(String.valueOf(infoWord.charAt(column)));
                                //System.out.print(bitvalue);
                                this.Info[row][column] = bitvalue; 
                        }
                }
        }
        //System.out.println(Arrays.deepToString(this.Info));			
}


public void generateCW () {
        // Multiply Info with G and store result in CW array.
        this.CW = new Integer[this.Info.length][this.G[0].length];

        int sum = 0;
        for (int i = 0; i < Info.length; i++){
                for (int j = 0; j < G[0].length; j++){
                        for (int k = 0; k < Info[0].length; k++){
                                //CW[i][j] += Info[i][k] * G[k][j];
                                sum = sum + Info[i][k] * G[k][j];
                        }
                        CW[i][j] = sum % GF;
                        sum = 0;
                }
        }		
}

public String printArray (Integer [][] array){

        int rows = array.length;
        int columns = array[0].length;

        StringBuilder str = new StringBuilder();

        for (int row = 0; row < rows; row++){
                for (int column = 0; column < columns; column++){
                        str.append(array[row][column]);
                }
                str.append(System.getProperty("line.separator"));
        }
        return str.toString();
}

public void fillTest () {
        Sent = new Integer [n][n];
        for (Integer [] row : Sent){
                Arrays.fill(row, 0);
        }

        // Generate errors 
        Sent [0][0] = 1;
        Sent [1][1] = 1;
        Sent [2][2] = 1;
        Sent [3][3] = 1;
        Sent [0][1] = 1; 
}

public int compareRow (int index) {

        // INPUT: index of row to compare to all Codewords. 
        // OUTPUT: index of CW and weight pairs in sorted form.

        int rowsCW = CW.length;
        int columnsSent = Sent[0].length;
        LinkedList <Difference> list = new LinkedList<Difference>();

        //System.out.println("rowsCw = " + rowsCW + "columnsSent = " + columnsSent );

        int diff = 0;
        for (int i = 0; i < rowsCW; i++){
                for (int j = 0; j < columnsSent; j++){
                        if (CW[i][j] != Sent[index][j]){
                                diff++;
                        }
                }
                list.add(new Difference(i, diff));
                diff = 0;
        }

        Collections.sort(list, new WeightComp());
        //for (Difference objDiff : list){
        //	System.out.println("index = " + objDiff.getIndexOfCW() + " weight = " +  objDiff.getWeight());
        //}
        int result = list.get(0).getIndexOfCW();
        return result;
        //System.out.println("Index of right CW = " + result);
}

public void rowDecode (){
        int index;

        for (int i = 0; i < Sent.length; i++){
                index = compareRow(i);
                // swap row of Sent[index][] with CW[index][]
                for (int j = 0; j < Sent.length; j++){
                        Sent[i][j] = CW[index][j];
                }
        }
}

public int compareColumn (int column) {
        int rowsSent = Sent.length;
        int columnsCW = CW[0].length;

        LinkedList <Difference> list = new LinkedList<Difference>();

        int diff = 0;
        // COLUMN IS FIXED so loop through all rows of CW first
        for (int i = 0; i < columnsCW; i++){
                // FOR each row loop through columns in CW 
                for (int j = 0; j < rowsSent; j++){

                        if (CW[i][j] != Sent[j][column]){
                                diff++;
                        }	
                }
                list.add(new Difference(i, diff));
                diff = 0;
        }

        Collections.sort(list, new WeightComp());
        //for (Difference objDiff : list){
        //	System.out.println("index = " + objDiff.getIndexOfCW() + " weight = " +  objDiff.getWeight());
        //}
        int result = list.get(0).getIndexOfCW();
        return result;		
}

public void columnDecode () {	
        int column;

        // Loop through all columns in Sent[][]
        for (int i = 0; i < Sent[0].length; i++){
                column = compareColumn(i);
                // Change column of Sent[][i] to row of CW[i][]
                for (int j = 0; j < Sent[0].length; j++){
                        Sent[j][i] = CW[column][j];
                }
        }
}

}
