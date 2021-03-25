/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act7java;

/**
 *
 * @author LDranzer
 */
public class Fibonacci {
    
    public int tamaño;
    public String nombre;
    
    public Fibonacci() { 
}

public Fibonacci(String nombre, int tamaño){
    this.nombre = nombre;
    this.tamaño = tamaño;
}

public void mostrarSerie(){
    System.out.println(this.nombre+" de tamaño "+this.tamaño+":");
    for (int i = 0; i < tamaño; i++) {
        System.out.print(fibonacci(i)+" ");
    }
    System.out.println();
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public int getTamaño() {
    return tamaño;
}

public void setTamaño(int tamaño) {
    this.tamaño = tamaño;
}

int fibonacci(int n)
{
    if (n>1){
       return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
    }
    else if (n==1) {  // caso base
        return 1;
    }
    else if (n==0){  // caso base
        return 0;
    }
    else{ //error
        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        return -1; 
    }
}

}
