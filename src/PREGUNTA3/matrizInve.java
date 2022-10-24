package PREGUNTA3;

public class matrizInve {
    public matrizInve() {
    }
    public static void main(String args[]) {

        int n = 3; //Relacion con la Matriz
        int Matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};  //Contenido de la matriz

        //Imprimiendo de orden inverso
        for (int i=n - 1;i>-1;i--){    //numero de filas
            for (int j=n - 1;j>-1;j--){     //numero de columnas
                System.out.print("["+Matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}