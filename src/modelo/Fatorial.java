package modelo;

public class Fatorial {
    
    public Fatorial(){}     
    
    public int calcula(int n){
        
        if(n<=0)
            return 1;
        else
            return calcula(n-1)*n;
        
    }

}