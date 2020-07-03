package reinan;

import java.util.Scanner;


public class Test{
    private int num1;
    private int num2;
    private int soma;

    Test(){ 
        System.out.print("construtor");
    }
    Test(int num1,int num2, int soma){
        this.num1 = num1;
        this.num2 = num2;
        this.soma = soma;

    }

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getSoma() {
        return soma;
    }
    public void setSoma(int soma) {
        this.soma = soma;
    }
    //Scanner reinan = new Scanner(System.in);
    public int somar() {
        soma = num1 + num2;
        return soma;         
    }
    
    
    public static void main(String[] args) {
        
        
        Test valor = new Test();
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite seu nome");
        int numero1 = entrada.nextInt();
        valor.setNum1(numero1);

        System.out.println("Digite outro numero");
        int numero2 = entrada.nextInt();
        valor.setNum2(numero2);

        System.out.println("A soma é : " + valor.getSoma());
        entrada.close();

    }}
