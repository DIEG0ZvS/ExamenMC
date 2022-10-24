package PREGUNTA1;

import java.util.Scanner;

public class calendario {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese año");
        int anio = sc.nextInt();

        for (int i = 1;i <= 2;i++)
        {
            System.out.println("\nMes: "+i);
            System.out.println("Dom\tLun\tMar\tMie\tJue\tVie\tSab");
            int dias = diaMes(anio, i);
            int contDia = 0;
            for(int j = 1; j <= dias; j++)
            {
                System.out.print(j+ "\t");
                contDia++;
                if (contDia == 7)
                {
                    System.out.println();
                    contDia = 0;
                }
            }
        }
    }


    public static int diaMes(int anio, int mes)
    {
        if (mes == 1)
        {
            return 31;
        } else
        {
            return 28;
        }
    }
}