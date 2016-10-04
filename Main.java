/*Primeiro-Projeto
Jogo da velha
*/

package projetojv;
import java.util.Scanner;

public class ProjetoJV {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        jogoJV ta = new jogoJV();
                
        String posi;
        
        int valida = 0, jogadas = 0;
                
        while(true){
            System.out.println("----------------");  
            ta.mostrar();
            System.out.println("----------------"); 
         
//Jogador 1   
        do{
            
            System.out.println("jogador 1, digite posicao: ");
            posi = leia.next();
            
            while(!ta.v(posi)){
                System.out.println("Jogada Invalida!");
                System.out.print("jogador 1, digite posicao: ");
                posi = leia.next();
                valida = 0;
            }
            
                ta.jo(posi, "X");
                valida = 1;
                
                
        }while(valida == 0);    
            jogadas ++;
            valida = 0;
            ta.mostrar();
            if(!ta.winner(jogadas).equals("null")){
                break;
            }
//-------------------------------------------------------------------------            
    //Jogador 2   
        do{
            
            System.out.println("jogador 2, digite posicao: ");
            posi = leia.next();
            
            while(!ta.v(posi)){
                System.out.println("Jogada Invalida!");
                System.out.print("jogador 2, digite posicao: ");
                posi = leia.next();
                valida = 0;
            }
            
                ta.jo(posi, "O");
                valida = 1;
                
                
        }while(valida == 0);    
            jogadas ++;
            valida = 0;
            ta.mostrar();
            if(!ta.winner(jogadas).equals("null")){
                break;
            }
//-----------------------------------------------------------------------------            
        }
    //**********************************************************************   
    //Vencedor?   
    System.out.println("O "+ ta.winner(jogadas)+ " venceu!");
    }
    
}
