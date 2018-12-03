package com.company;
java.lang.Object
    JackOLantern

public class JackOLantern {
    private String[][] faceFeatures;
    public JackOLantern(String[][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace, int row, int column){
        faceFeatures[row][column] = replace;
    }

    public void fill(String str){
        for (int i=0li<faceFeatures.length; i++){
            for(int j=0; j<faceFeatures[i].length; j++){
                faceFeatures[i][j] = str;
            }
        }
    }

    public String toString(){
        String output = " ";
        for (int i=0; i<faceFeatures.length; i++){
            for intj=0; j<faceFeatures[i].length; j++){
    output+= "\n";
            }
            return output;
        }
    }

}

