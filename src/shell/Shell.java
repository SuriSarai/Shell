/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shell;

/**
 *
 * @author Suri
 */
public class Shell {
public static Integer[] shell(Integer[] arreglo){
		int inta, i, aux;
		boolean band;
		inta = arreglo.length;
		while(inta > 0){
			inta = inta / 2;
			band = true;
			while(band){
				band = false;
				i = 0;
				while ((i+inta) <=arreglo.length-1){//2.1.1
					if (arreglo[i] > arreglo[i + inta]){
						aux = arreglo[i];
						arreglo[i] = arreglo[i+inta];
						arreglo[i+inta] = aux;
						band = true;
					}
					i = i +1;
				}
			}
		}
		
		return arreglo;
	}
	
	

}
