/*Primeiro-Projeto
Jogo da velha
*/

package projetojv;

public class jogoJV {
    
     private String[][] a = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    
    // mostrar a tabela.
     
     public String mostrar(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){ 
                System.out.printf(" |" + a[i][j]+ "| ");
            }
                System.out.println("\n");
    }
        return null;
   }
//********************************************************************         
//Validação da posição.
   public boolean v (String p){
   
       for(int i=0; i<3; i++){
           for(int j=0; j<3; j++){
               if(a[i][j].equals(p))
                   return true;
           }
               
       }
       return false;
   }
//******************************************************************************     
     // Subistituição.
   public void jo (String p, String j){
       
       switch (p) {
           
            case "1":
                a[0][0]= j;
                break;
            case "2":
                a[0][1]= j;
                break;
            case "3":
                a[0][2]= j;
                break;
            case "4":
                a[1][0]= j;
                break;
            case "5":
                a[1][1]= j;
                break;
            case "6":
                a[1][2]= j;
                break;
            case "7":
                a[2][0]= j;
                break;
            case "8":
                a[2][1]= j;
                break;
            case "9":
                a[2][2]= j;
                break;
            default:
                break;
       
         }
   
    }
//******************************************************************************
     
   // Verificação de vencedor.
   public String winner(int jogadas){
       
       String[] co = new String[8];
         String vencedor = "null";
        if(jogadas == 9){
            vencedor = "Empate!";
        }
        
        co[0] = a[0][0]+ a[0][1]+ a[0][2];
        co[1] = a[1][0]+ a[1][1]+ a[1][2];
        co[2] = a[2][0]+ a[2][1]+ a[2][2];
          
        co[3] = a[0][0]+ a[1][0]+ a[2][0];
        co[4] = a[0][1]+ a[1][1]+ a[2][2];
        co[5] = a[0][2]+ a[1][1]+ a[2][2];  
          
        co[6] = a[0][0]+ a[1][1]+ a[2][2];
        co[7] = a[0][2]+ a[1][1]+ a[2][0];
     
         for (String co1 : co) {
             if (co1.equals("XXX")) {
                 vencedor = "Player 1";
             } else if (co1.equals("OOO")) {
                 vencedor = "Player 2";
             }
         }
        return vencedor;
    }
//****************************************************************************   
   
   
   
   
}
