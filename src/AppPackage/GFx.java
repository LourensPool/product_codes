/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JPanel;

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
	
private Integer [][] G;
private Integer [][] GColumn; 

private Integer [][] Info;
private Integer [][] infoColumn;

private Integer [][] CW;
private Integer [][] CWColumn;
private Integer [][] Sent;

private int n;
private int k;
private int d;		// floor ((3 - 1) / 2) = 1 error correction

private int nColumn;
private int kColumn;
private int dColumn;

private int GF;

// ALPHA MATRICES
private String [] alphaMat;

// Replace alpha
private Integer [][] alpha_zero = {{0,0,0}, {0,0,0}, {0,0,0}};
private Integer [][] alpha_0 = {{1,0,0}, {0,1,0}, {0,0,1}};
private Integer [][] alpha_1 = {{0,1,0}, {0,0,1}, {1,1,0}};
private Integer [][] alpha_2 = {{0,0,1}, {1,1,0}, {0,1,1}};
private Integer [][] alpha_3 = {{1,1,0}, {0,1,1}, {1,1,1}};
private Integer [][] alpha_4 = {{0,1,1}, {1,1,1}, {1,0,1}};
private Integer [][] alpha_5 = {{1,1,1}, {1,0,1}, {1,0,0}};
private Integer [][] alpha_6 = {{1,0,1}, {1,0,0}, {0,0,0}};
private Integer [][] alpha_7 = {{1,0,0}, {0,0,0}, {0,1,0}};

// Replace alpha
private Integer [] a_zero = {0,0,0};
private Integer [] a_0 = {1,0,0};
private Integer [] a_1 = {0,1,0};
private Integer [] a_2 = {0,0,1};
private Integer [] a_3 = {1,1,0};
private Integer [] a_4 = {0,1,1};
private Integer [] a_5 = {1,1,1};
private Integer [] a_6 = {1,0,1};
private Integer [] a_7 = {1,0,0};

GFx (int _GF) {
    
    this.GF = _GF;
    this.n = 7;
    this.k = 3;
    this.d = 5; 

    if (_GF == 2){
      
    } else if (_GF == 3) {
        this.G = new Integer [][] { {1,0,1,1}, {0,1,1,2} };
        this.Info = new Integer [][] { {0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2} };
        this.n = 4;
        this.k = 2;
        this.d = 3;
    } else if (_GF == 8){
        this.G = new Integer [][] {   
            {1,1,0, 0,1,0, 1,0,0, 1,1,0, 1,0,0, 0,0,0, 0,0,0},
            {0,1,1, 0,0,1, 0,1,0, 0,1,1, 0,1,0, 0,0,0, 0,0,0},
            {1,1,1, 1,1,0, 0,0,1, 1,1,1, 0,0,1, 0,0,0, 0,0,0},
            {0,0,0, 1,1,0, 0,1,0, 1,0,0, 1,1,0, 1,0,0, 0,0,0},
            {0,0,0, 0,1,1, 0,0,1, 0,1,0, 0,1,1, 0,1,0, 0,0,0},
            {0,0,0, 1,1,1, 1,1,0, 0,0,1, 1,1,1, 0,0,1, 0,0,0},
            {0,0,0, 0,0,0, 1,1,0, 0,1,0, 1,0,0, 1,1,0, 1,0,0},
            {0,0,0, 0,0,0, 0,1,1, 0,0,1, 0,1,0, 0,1,1, 0,1,0},
            {0,0,0, 0,0,0, 1,1,1, 1,1,0, 0,0,1, 1,1,1, 0,0,1}      
        }; // From slide 4.24
        }
}

public Integer [][] getG () {
    return this.G;
}

public void setG (Integer [][] _G, int _n, int _k, int _d) {
    this.G = _G;
    this.n = _n;
    this.k = _k;
    this.d = _d;
}

public Integer [][] getGColumn () {
    return this.GColumn;
}

public void setGColumn (Integer [][] _G, int _n, int _k, int _d){
    this.GColumn = _G;
    this.nColumn = _n;
    this.kColumn = _k;
    this.dColumn = _d;
}

public Integer [][] getInfo () {
    return this.Info;
}

public Integer [][] getInfoColumn () {
    return this.infoColumn;
}

public Integer [][] getCW () {
    return this.CW;
}

public Integer [][] getCWColumn () {
    return this.CWColumn;
}

public Integer [][] getSent () {
    return this.Sent;
}

public void setSent(Integer[][] sentWithUserErrors){
    this.Sent = sentWithUserErrors;
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

public int getNCol () {
    return this.nColumn;
}

public int getKCol () {
    return this.kColumn;
}

public int getDCol () {
    return this.dColumn;
}

public int getGF () {
    return this.GF;
}

public String printProperties () {
    StringBuilder str = new StringBuilder();
    
    float rateSingle = (float) this.k / (float) this.n;
    float rateProduct = (float) (this.k * this.kColumn ) / (float) (this.n * this.nColumn);
    int errorCorrection = (this.d -1 )/2;
    int errorDetection = this.d - 1;
    
    float rateColumn = (float) this.kColumn / (float) this.nColumn;
    int errorCorrectionColumn = (this.dColumn -1) /2;
    int errorDetectionColumn = this.dColumn - 1;
    
    str.append("Rows are sent as: \n");
    str.append("(n, k, d) --> (" + this.n + " ," + this.k + " ," + this.d + ") codes.\n");
    str.append("Each row can correct " + errorCorrection + " error(s). \n" );
    str.append("Each row can detect  "+ errorDetection + " error(s)\n");
    str.append("Code rate = " + String.format("%.2f", rateSingle) + "\n\n");
    
    if (GF == 2){
        str.append("Columns are sent as (" + this.nColumn + " ," + this.kColumn + " ," + this.dColumn + ") codes.\n" );
        str.append("Each column can correct " + errorCorrectionColumn + " error(s)\n");
        str.append("Each column can detect " + errorDetectionColumn + " error(s)\n");
        str.append("Code rate = " + String.format("%.2f", rateColumn) + "\n");

        str.append("\nPRODUCT CODE PROPERTIES:\n" + "(" + this.n * this.nColumn + " ," + this.k * this.kColumn + " ," + this.d * this.dColumn + ")\n" );
        str.append("Code rate = " + String.format("%.2f", rateProduct) +"\n" );     
    } else {
        float rateEqualProduct =  (float) (this.k * this.k ) / (float) (this.n * this.n);
        str.append("\nPRODUCT CODE PROPERTIES:\n" + "(" + this.n * this.n + " ," + this.k * this.k + " ," + this.d * this.d + ")\n" );
        str.append("Code rate = " + String.format("%.2f", rateEqualProduct ) +"\n" );
    }
    
    return str.toString();
}

public String printG () {

        StringBuilder strMatrix = new StringBuilder();

        for (int row = 0; row < this.G.length; row++){
                for (int column = 0; column < this.G[0].length; column++){
                        strMatrix.append(this.G[row][column]);	

                        if (column == this.G[0].length -1){
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
    
        if (this.GF != 2){
            return;
        } 
        
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
                for (int row = 0; row < rows; row++){
                        infoWord = list.remove();
                        for (int column = 0; column < this.k; column++){
                                bitvalue = Integer.parseInt(String.valueOf(infoWord.charAt(column)));
                                this.Info[row][column] = bitvalue; 
                        }
                }
        }		
}

public void generateInfoColumn () {
    
        if (this.GF != 2){
            return;
        } 
        
        // Generates all infowords and stores them in a 2D array named CW. 
        // https://stackoverflow.com/questions/2795678/fill-array-with-binary-numbers
        final int N = this.kColumn;
        LinkedList<String> list = new LinkedList<String>();
        String infoWord = "";

        // Fill list with info words
        for (int i=0; i < (1 << N); i++){
                 list.add(zeroPad(Integer.toBinaryString(i), N));
        }

        // Fill array [][] this.Info with info words
        int rows = (int) Math.pow(this.GF, this.kColumn);
        this.infoColumn = new Integer[rows][this.kColumn];
        Integer bitvalue;

        while (!list.isEmpty()){
                for (int row = 0; row < rows; row++){
                        infoWord = list.remove();
                        for (int column = 0; column < this.kColumn; column++){
                                bitvalue = Integer.parseInt(String.valueOf(infoWord.charAt(column)));
                                this.infoColumn[row][column] = bitvalue; 
                        }
            }
        }		
}

public void generateInfoGF8 (){
       
    final int N = 9;
    LinkedList<String> list = new LinkedList<String>();
    String infoWord = "";
    
    // Fill list with info words
    for (int i=0; i < (1 << N); i++){
          list.add(zeroPad(Integer.toBinaryString(i), N));
    }
    
    // Fill array [][] this.Info with info words
    int rows = (int) Math.pow(2, N);
    this.Info = new Integer[rows][G.length];
    Integer bitvalue;
    
    while (!list.isEmpty()){
                for (int row = 0; row < rows; row++){
                        infoWord = list.remove();
                        //System.out.println(infoWord + ", ");
                        for (int column = 0; column < N; column++){
                                bitvalue = Integer.parseInt(String.valueOf(infoWord.charAt(column)));
                                //System.out.print(bitvalue + ", ");
                                this.Info[row][column] = bitvalue; 
                        }
                }
        }
//        System.out.println("CW rows = " + Info.length + " Info columns = " + Info[0].length);
//        System.out.println(Arrays.deepToString(this.Info));  
}

public String alphaGenerateInfoGF8(){
    // Fancy print now
    final int N = 9;
    // Fill array [][] this.Info with info words
    int rows = (int) Math.pow(2, N);
    this.Info = new Integer[rows][G.length];
    
    
    // Create alpha notation matrix so a 3 by 3.
    Integer[][] alphaMatrix = new Integer[rows][3];
    
    int indexInfo = 0;
    for(int i=0; i<8; i++){
        for(int j=0; j<8; j++){
            for(int k=0; k<8; k++){
                alphaMatrix[indexInfo][0] = i;
                alphaMatrix[indexInfo][1] = j;
                alphaMatrix[indexInfo][2] = k;
                indexInfo++;
            }
        }
    }
    
    // Create fancy print
    
    String[] alpha = {"0", "1", "α", "α²", "α³", "α⁴", "α⁵", "α⁶", "α⁷" };
    String str = "";
    
    for (Integer[] row : alphaMatrix){
            //System.out.println(row[0] + "," + row[1] + "," + row[2]);
            
            // Corner case to acces last elem of alpha replace array
            if (row[0] == 7) row[0] = 8;
            if (row[1] == 7) row[1] = 8;
            if (row[2] == 7) row[2] = 8;
            
            
            str += alpha[row[0]];
            str += alpha[row[1]];
            str += alpha[row[2]] + "\n";
    }
    
    return str;
}

public List<String> makeSequence(int begin, int end) {
  List<String> ret = new ArrayList(end - begin + 1);
  String str = "";
  
  for(int i = begin; i < end; i++){
      ret.add(String.format("%03d", i % 8));
   }

  return ret;  
}

public Integer[] testMult () {
    int rows = this.G.length; // 9
    int columns = this.G[0].length; // 21
    
    System.out.println("Rows = " + rows + " columns = " + columns);
    
    Integer [] vector = {0,1,1,0,0,1,0,0,0};
    Integer [] result = new Integer [columns];
    
    Integer sum = 0;
    
    for (int i = 0; i < columns; i++){
        for (int j = 0; j < rows; j++){
            sum = sum + (G[j][i] * vector [j]);
        }
        result[i] = sum % 2;
        sum = 0;
    }
    
    System.out.println(Arrays.deepToString(result));
    return result;
}

public void generateCW_GF3 (Integer [][] _Info, Integer [][] _G, Integer[][] _CW, boolean column) {
        // Multiply Info with G and store result in CW array.
        
        if (column){
            this.CWColumn = new Integer[_Info.length][_G[0].length];
        } else if (!column){
            this.CW = new Integer[_Info.length][_G[0].length];
        }
          
        int sum = 0;
        for (int i = 0; i < _Info.length; i++){
                for (int j = 0; j < _G[0].length; j++){
                        for (int k = 0; k < _Info[0].length; k++){
                                //CW[i][j] += _Info[i][k] * _G[k][j];
                                sum = sum + _Info[i][k] * _G[k][j];
                        }
                        if (column){
                            CWColumn[i][j] = sum % GF;
                        } else if (!column){
                            CW[i][j] = sum % GF;
                        }
                        }
                        sum = 0;
        }
}  

public void generateCW () {
        // Multiply Info with G and store result in CW array.
        this.CW = new Integer[Info.length][G[0].length];
     
        int sum = 0;
        for (int i = 0; i < Info.length; i++){
                for (int j = 0; j < G[0].length; j++){
                        for (int k = 0; k < Info[0].length; k++){
                            //CW[i][j] += _Info[i][k] * _G[k][j];
                            sum = sum + Info[i][k] * G[k][j];
                        }
                        CW[i][j] = sum % GF;
                        sum = 0;
                }
        }
        
        if (this.GF == 3){
            this.CWColumn = this.CW;
        }
        
}   


public void generateCWColumn () {
        // Multiply Info with G and store result in CW array.
        this.CWColumn = new Integer [infoColumn.length][GColumn[0].length];
        
        int sum = 0;
        for (int i = 0; i < infoColumn.length; i++){
                for (int j = 0; j < GColumn[0].length; j++){
                        for (int k = 0; k < infoColumn[0].length; k++){
                            //CW[i][j] += _Info[i][k] * _G[k][j];
                            sum = sum + infoColumn[i][k] * GColumn[k][j];
                        }
                        CWColumn[i][j] = sum % GF;
                        sum = 0;
                }                 
        }
}   

public void generateCWGF8 () {
        // Multiply Info with G and store result in CW array.
        this.CW = new Integer[this.Info.length][this.G[0].length];
        
//        System.out.println("Info = " + Arrays.deepToString(this.Info)); 
//        System.out.println("CW = " + Arrays.deepToString(this.CW));
//        System.out.println("G = " + Arrays.deepToString(this.G));
        
        int sum = 0;
        for (int i = 0; i < Info.length; i++){
                for (int j = 0; j < G[0].length; j++){
                        for (int k = 0; k < Info[0].length; k++){
                                //CW[i][j] += Info[i][k] * G[k][j];
                                sum = sum + Info[i][k] * G[k][j];
                        }
                        CW[i][j] = sum % 2;
                        sum = 0;
                }
        }
        
        this.CWColumn = this.CW;
        
        System.out.println("Length of CW should be 21 and is: " + CW[0].length);
}



public String printArray (Integer [][] array){

    int rows = array.length;
    int columns = array[0].length;

    StringBuilder str = new StringBuilder();

    for (int row = 0; row < rows; row++){
            for (int column = 0; column < columns; column++){
                    str.append(array[row][column]);
                    str.append(" ");
            }
            str.append(System.getProperty("line.separator"));
    }

    return str.toString();
}

public void setAlphaErrors(Integer[][] userErrors){
    // Convert 7 to alpha^7 in binary notation.
 
    //    System.out.println(userErrors.length);
//    System.out.println("userErrors used to update binary errors: \n" + Arrays.deepToString(userErrors));
//    System.out.println(Arrays.deepToString(Sent));
    
    String str = "";
    int rows = userErrors.length;
    int columns = userErrors[0].length;
    
    for (int i=0; i< rows; i++){
        for (int j = 0; j < columns; j++){
            int indexBinary = j*3;
            Integer alpha = userErrors[i][j];
 
            updateSentGF8(i, indexBinary, alpha);
            str += userErrors[i][j];
        }
        System.out.println("setAlphaErrors: " + str);
        str = "";
    }
    

    
}

public void updateSentGF8(int row, int index, Integer alpha){
    
    if (alpha == -1){
        return;
    }
    
    if (alpha == 0) {
        Sent[row][index] = 0;
        Sent[row][index +1] = 0;
        Sent[row][index + 2] = 0;     
    }
    
    if (alpha == 1) {
        Sent[row][index] = 0;
        Sent[row][index +1] = 1;
        Sent[row][index + 2] = 0;     
    }
    
    if (alpha == 2) {
        Sent[row][index] = 0;
        Sent[row][index +1] = 0;
        Sent[row][index + 2] = 1;     
    }
    
    if (alpha == 3) {
        Sent[row][index] = 1;
        Sent[row][index +1] = 1;
        Sent[row][index + 2] = 0;        
    }
    
    if (alpha == 4) {
        Sent[row][index] = 0;
        Sent[row][index +1] = 1;
        Sent[row][index + 2] = 1;     
    }
    
    if (alpha == 5) {
        Sent[row][index] = 1;
        Sent[row][index +1] = 1;
        Sent[row][index + 2] = 1;     
    }
    
    if (alpha == 6) {
        Sent[row][index] = 1;
        Sent[row][index +1] = 0;
        Sent[row][index + 2] = 1;     
    }
    
    if (alpha == 7) {
        Sent[row][index] = 1;
        Sent[row][index +1] = 0;
        Sent[row][index + 2] = 0;     
    } 
}

public String printInfoAlpha(Integer[][] array){
    int rows = array.length;
    int columns = array[0].length;

    StringBuilder str = new StringBuilder();
    
    for(int row=0; row < rows; row++){
        for(int col=0; col < columns; col += 3){
            str.append(getAlphaInfo(array, row, col));         
        }
        str.append(System.getProperty("line.separator"));
    }
    
    return str.toString();
}

public String getAlphaInfo(Integer[][] array, int row, int column){
    
    Integer [] read = {0,0,0};
    String str = "";
    
    for (int i=0; i < 3; i++){
        read[i] = array[row][column + i];
    }
    
    // Compare read to hardcoded alpha's 
    if (Arrays.deepEquals(read, a_zero)) str = "0";
    if (Arrays.deepEquals(read, a_0)) str ="1";
    if (Arrays.deepEquals(read, a_1)) str ="α¹";
    if (Arrays.deepEquals(read, a_2)) str = "α²";
    if (Arrays.deepEquals(read, a_3)) str = "α³";
    if (Arrays.deepEquals(read, a_4)) str = "α⁴";
    if (Arrays.deepEquals(read, a_5)) str = "α⁵";
    if (Arrays.deepEquals(read, a_6)) str = "α⁶";
    if (Arrays.deepEquals(read, a_7)) str = "α⁷";
    
    return str;
}

public String printAlpha (Integer [][] array){

    int rows = array.length;
    int columns = array[0].length;
    int slidingWindow = 3;

    StringBuilder str = new StringBuilder();
    String nGram = "";

    // Loop through corner indices of 3 by 3 parts of the array.
    for (int row=0; row < rows; row += 3){
        for (int col=0; col < columns; col += 3){
            //System.out.println("Corner indices: " + row + ", " + col );
            str.append(read_3_3_array(array, row, col));
        }
        str.append(System.getProperty("line.separator"));
    }
    return str.toString();
}

public String getAlphaString(Integer[][] array){
    
    int rows = array.length;
    int columns = array[0].length;
    int slidingWindow = 3;

    StringBuilder str = new StringBuilder();
    String nGram = "";
   
    for (int row = 0; row < 7; row++){
            for (int column = 0; column < columns; column += 3){
                    // Create an n-gram
                    //str = str.append(array[row][column] + array[row][column +1] + array[row][column + 2]);
                    nGram = "";
                    nGram = nGram.concat(array[row][column].toString() + array[row][column +1].toString() + array[row][column + 2].toString());

                    nGram = nGram.replaceAll("000", "0  \t");
                    nGram = nGram.replaceAll("010", "α¹\t");
                    nGram = nGram.replaceAll("001", "α²\t");
                    nGram = nGram.replaceAll("110", "α³\t");
                    nGram = nGram.replaceAll("011", "α⁴\t");
                    nGram = nGram.replaceAll("111", "α⁵\t");
                    nGram = nGram.replaceAll("101", "α⁶\t");
                    nGram = nGram.replaceAll("100", "α⁷\t");

                    str.append(nGram);

            }
            str.append(System.getProperty("line.separator"));
    }
    
    return str.toString();
}

public String read_3_3_array(Integer[][] array, int row, int column){
    // Read 3x3 array and return alpha notation
    
    Integer [][] read = {{0,0,0}, {0,0,0}, {0,0,0}};
    String str = "";
    
    for (int i=0; i < 3; i++){
        for (int j=0; j < 3; j++){
            read[i][j] = array[row + i][column + j];
        }
    }
    
    // Compare read to hardcoded alpha's 
    if (Arrays.deepEquals(read, alpha_zero)) str = "0";
    if (Arrays.deepEquals(read, alpha_0)) str ="1";
    if (Arrays.deepEquals(read, alpha_1)) str ="α";
    if (Arrays.deepEquals(read, alpha_2)) str = "α²";
    if (Arrays.deepEquals(read, alpha_3)) str = "α³";
    if (Arrays.deepEquals(read, alpha_4)) str = "α⁴";
    if (Arrays.deepEquals(read, alpha_5)) str = "α⁵";
    if (Arrays.deepEquals(read, alpha_6)) str = "α⁶";
    if (Arrays.deepEquals(read, alpha_7)) str = "α⁷";
    
    return str;
}

public void fillProbability (double p) {
    int columns = CW[0].length;
    int rows = CWColumn[0].length;
    Sent = new Integer [rows][columns];
    System.out.println("columns = " + columns + " rows = " + rows);
    
    for (Integer [] row : Sent){
                Arrays.fill(row, 0);
    }
      
    if (p < 0 || p > 0.5){
        System.out.println("P must be between 0 and 0.5 and is: " + p);
        // TODO POPUP ERROR BIATCH;
    }
     
    for (int i=0; i < Sent.length; i++){
        for (int j=0; j < Sent[0].length; j++){
            
            if (Math.random() <= p ){
                Sent[i][j] = 1;
            }
        }
    }
}

public void fillGilbert(double pGG, double pBB){
    int columns = CW[0].length;
    int rows = CWColumn[0].length;
    Sent = new Integer [rows][columns];
    
    // Initialize Sent to zero. 
    for (Integer [] row : Sent){
                Arrays.fill(row, 0);
    }
    
    // Use good and bad state transition to model burst errors.
    int goodState = 1;
    
    for (Integer[] Sent1 : Sent) {
        for (int j = 0; j < Sent[0].length; j++) {
            // Good and bad state model here. 
            double chance = Math.random();
            
            switch (goodState) {
                case 1:  if (chance <= 1 - pGG) goodState = 0;
                break;
                case 0: if (chance <= 1 - pBB) goodState = 1;
                break;  
            }
            // Use new state to input errors
            if (goodState == 0) {
                Sent1[j] = 1;
            }
            
            // If GF3 then erros may be 0,1 or 2
            if (goodState == 0 && this.GF == 3){
                int result = 1;
                if (chance < 0.5) { result = 2;}
               
                Sent1[j] = result;
            }
            
        }
    }
    
    
}

public void fillZero (){
    int columns = CW[0].length;
    int rows = CWColumn[0].length;
    System.out.println("columns = " + columns + " rows = " + rows);
    
    Sent = new Integer [rows][columns];
    
    
    for (Integer [] row : Sent){
                Arrays.fill(row, 0);
    }
}

public void fillTest () {
        Sent = new Integer [n][n];
        for (Integer [] row : Sent){
                Arrays.fill(row, 0);
        }

        // Generate errors 
        Sent [0][0] = 1;
        Sent [0][1] = 1;
        Sent [1][1] = 1;
        Sent [2][2] = 1;
        Sent [3][3] = 1;
        
        
        if (GF == 8){
            Sent [0][2] = 1;
            Sent [1][0] = 1;
        }
}

public int compareRow (int index) {

        // INPUT: index of row to compare to all Codewords. 
        // OUTPUT: index of CW and weight pairs in sorted form.

        int rowsCW = CW.length;
        int columnsSent = Sent[0].length;
        LinkedList <Difference> list = new LinkedList <Difference>();

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
        int result = list.get(0).getIndexOfCW();
        return result;
  
}

public int compareColumn (int column) {
        int rowsSent = Sent.length;
        int rowsCW = CWColumn.length;

        LinkedList <Difference> list = new LinkedList<Difference>();

        int diff = 0;
        // COLUMN IS FIXED so loop through all rows of CW first
        for (int i = 0; i < rowsCW; i++){
                // FOR each row loop through columns in CW 
                for (int j = 0; j < rowsSent; j++){

                        if (CWColumn[i][j] != Sent[j][column]){
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

public void rowDecode (){
    int index;
    int rows = Sent.length;
    int columns = Sent[0].length;
    
    //System.out.println("Rows in Sent = " + Sent.length);
    for (int i = 0; i < rows; i++){
            index = compareRow(i);
            // swap row of Sent[index][] with CW[index][]
            for (int j = 0; j < columns; j++){
                    Sent[i][j] = CW[index][j];
            }
    }
}

public void columnDecode () {	
    int column;
    int rows = Sent.length;
    int columns = Sent[0].length;
    
    // Loop through all columns in Sent[][]
    for (int i = 0; i < columns; i++){
            column = compareColumn(i);
            // Change column of Sent[][i] to row of CW[i][]
            for (int j = 0; j < rows; j++){
                    Sent[j][i] = CWColumn[column][j];
            }
    }
}

}