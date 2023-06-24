package e2p1_haroldcamas_12311242;

public class Numero {
    private int base;
    private String numero;
    
    Numero(int baseO, int numeroO){
        this.base = baseO;
        this.numero = decToBase(numeroO,base);
    }
    
    public char numToChar(int num){
        char caracter = 'a';
        if (num >= 10){
            caracter = (char) (num + 87);
        }
        else {
            caracter = (char) (num + 48);
        }
        return caracter;
    }
    
    public int charToNum(char ch){
        int number;
        if (ch >= 97 && ch <= 122){
            number = (int) (ch - 87);
        }
        else{
            number = (int) (ch - 48);
        }
        return number;
    }
    
    public String decToBase(int number,int Base){
        int residuo = 0;
        int resultado = number;
        String cadena = "";
        
        while(resultado >= Base){
            residuo = resultado%Base;
            resultado = resultado/Base;
            cadena += numToChar(residuo);
        }
        cadena += numToChar(resultado);
        cadena = vuelta(cadena);
        return cadena;
    }
    
    public int baseToDec(String cadena, int Base){
        int acumulador = 0;
        for (int i = 0; i < cadena.length(); i++){
            acumulador += charToNum(cadena.charAt(i)) * Math.pow(Base, cadena.length() - 1 - i);
        }
        return acumulador;
    }
    
    public String vuelta(String cadena){
        String nueva = "";
        for (int i = cadena.length() - 1; i > -1; i--){
            nueva += cadena.charAt(i);
        }
        return nueva;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public int getBase(){
        return this.base;
    }
}