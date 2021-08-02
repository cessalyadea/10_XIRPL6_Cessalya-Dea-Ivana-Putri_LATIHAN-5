/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan.pkg5;

/**
 *
 * @author LENOVO
 */
public class Latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriks1[][] = new int[2][2];
       
        matriks1[0][0] = -5;
        matriks1[0][1] = 3;
        matriks1[1][0] = 7;
        matriks1[1][1] = 2;
        
       
        int matriks2[][] = new int[2][2];
       
        matriks2[0][0] = 3;
        matriks2[0][1] = 1;
        matriks2[1][0] = 5;
        matriks2[1][1] = -2;
        
        
        System.out.println("Hasil dari Matriks A - B adalah  ");
        
       
        for (int i=0; i<matriks1.length; i++){
            for (int a=0; a<matriks1[0].length; a++){
               
                int HasilElemenMatriks = matriks1[i][a] - matriks2[i][a];
               
                System.out.print( HasilElemenMatriks + " ");
            }       
           
            System.out.println();
        }
}
    }
    

