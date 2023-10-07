package Deitel.C02._14;

/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
/**
 * Printer. <BR> 
 * Bibliografia : Java como programar, Deitel, 10º edição <BR>
 * Capítulo   2 : Introdução a aplicativos Java – entrada/saída e operadores <BR>
 * Exercício 14 : (Printer 1 2 3 4)
 * Autor        : Emiliano Costa<BR> 
 * 
 */ 
public class Printer 
{/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    
    public static void main(String[] args)
    {
        System.out.println("Exercicio 14.");
        resposta_Item_A();
        resposta_Item_B();
        resposta_Item_C();
    }

    public static void resposta_Item_A()
    {
        System.out.println("A: usando uma instrução System.out.println");
        System.out.println("1 2 3 4");
    }
    

    public static void resposta_Item_B()
    {
        System.out.println("B: usando quatro instruções System.out.print");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4\n");
    }

    
    public static void resposta_Item_C()
    {
        System.out.println("C: usando uma instrução System.out.printf");
        System.out.printf("%d %d %d %d \n",1,2,3,4);
    }
    
    
}/*FIM Printer::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
