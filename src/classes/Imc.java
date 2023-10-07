package classes;

public class Imc {
    float imc;
    
    public float calcImc(float altura, float peso){
        imc = peso / (altura * altura);
        
        return this.imc;
    }
    
    public String classify(float imc){
        if(imc < 18.5){
            return "Abaixo do Peso!";
        }else if(imc >= 18.6 && imc <= 24.9){
           return "Peso Ideal, Parabéns!";
        }else if(imc >= 25.0 && imc <= 29.9){
            return "Levemente Acima do Peso!";
        }else if (imc >= 30.0 && imc <= 34.9){
            return "Obesidade Grau 1!";
        }else if(imc >= 35.0 && imc <= 39.9){
            return "Obesidade Grau 2! (Severa)";
        }else if(imc > 40){
            return "Obesidade Grau 3! (Mórbida)";
        }
        
        return null;
    }
}