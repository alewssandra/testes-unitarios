package modelo;

public class Matematica {
    
    public Matematica(){}
    
    public float soma(float operando1, float operando2){
        return operando1 + operando2;
    }
    
    public float subtrai(float operando1, float operando2){
        return operando1 - operando2;
    }
    
    public float multiplica(float operando1, float operando2){
        return operando1 * operando2;
    }
    
    public float divide(float operando1, float operando2){
        if(operando2 == 0){
            return 0;
        }
        return operando1 / operando2;
    }
}
