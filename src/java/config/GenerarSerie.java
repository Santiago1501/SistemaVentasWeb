
package config;


public class GenerarSerie {
    int dato;
    String numero;
    
    public String numeroserie(int d){
        dato=d+1;
        if(dato>=10000000 && dato<=100000000){
            numero=""+dato;
        }
        if(dato>=1000000 && dato<=10000000){
            numero="0"+dato;
        }
        if(dato>=100000 && dato<=1000000){
            numero="00"+dato;
        }
        if(dato>=10000 && dato<=100000){
            numero="000"+dato;
        }
        if(dato>=1000 && dato<=10000){
            numero="0000"+dato;
        }
        if(dato>=100 && dato<=1000){
            numero="00000"+dato;
        }
        if(dato>=10 && dato<=100){
            numero="000000"+dato;
        }
        if(dato<10){
            numero="0000000"+dato;
        }
        
        return numero;
    }
    
}
