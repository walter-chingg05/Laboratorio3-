/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author walle
 */
public class parqueadero {
    
    
     float precioparqueaderocarros;
    float precioparqueaderomotos;
    float precioparqueaderobicicletas;
    static int maximacapacidadcarro=12;
    static int maximacapacidadmotos=8;
    static int maximacapacidadbicicletas=6;
    
    
    parqueadero (float PC,float PM,float PB, int MC, int MM , int MB)

{
    this.precioparqueaderocarros= PC;
    this.precioparqueaderomotos= PM;
    this.precioparqueaderobicicletas= PB;
    this.maximacapacidadcarro= MC;
    this.maximacapacidadmotos= MM;
    this.maximacapacidadbicicletas= MB;
}
    
    parqueadero(){}
    
public  void contador(String tipo)
 {
     int posicion=(Vehiculo.listaVehiculos.size()-1);
     switch (tipo) {
            case "Carro":
                maximacapacidadcarro--;
                if (maximacapacidadcarro==0)
                {
                    JOptionPane.showMessageDialog(null, "Cupo LLeno, Carros");
                } else if (maximacapacidadcarro<0) {
           
                Vehiculo.listaVehiculos.remove(posicion);
                Vehiculo.placa.remove(posicion);
                tarifa.remove(posicion);
                Vehiculo.tiempoingreso.remove(posicion);
//                vehiculo.tiemposalida.remove(posicion);
//                vehiculo.tiempo.remove(posicion);
                
                
                maximacapacidadcarro++;
                JOptionPane.showMessageDialog(null, "Cupo LLeno, Carros");
                }
                break;
            case "Moto":
                maximacapacidadmotos--;
                 if (maximacapacidadmotos==0)
                {
                    JOptionPane.showMessageDialog(null, "Cupo LLeno, Motos");
                } 
                break;
            case "Bicicleta":
                maximacapacidadbicicletas--;
                break;
            default:
                break;
        }
    
 }
Vehiculo obj= new Vehiculo();
 static     ArrayList<Integer> tarifa=  new ArrayList<Integer>();
  public void tarifa(String tipo)
    {
        
        switch (tipo) {
            case "Carro":
                
                if (obj.hora_entrada>=1080) 
                {
                tarifa.add(80);
                 }
                else
                {
                tarifa.add(75);
                }
                // System.out.println("tarifa "+ tarifa);
                break;
            case "Moto":
                if (obj.hora_entrada>=1080) 
                {
                tarifa.add(25);
                 }
                else
                {
                tarifa.add(20);
                }
                // System.out.println("tarifa "+ tarifa);
                break;
            case "Bicicleta":
                if (obj.hora_entrada>=1080) 
                {
                tarifa.add(15);
                 }
                else
                {
                tarifa.add(10);
                }
                //System.out.println("tarifa "+ tarifa);
                break;
            default:
                break;
        }
        
        
    }
 
  public void salida(int indice)
  {
      String tipo= Vehiculo.listaVehiculos.get(indice);
      switch (tipo) {
            case "Carro":
                maximacapacidadcarro++;
                break;
            case "Moto":
                maximacapacidadmotos++;
                break;
            case "Bicicleta":
                maximacapacidadbicicletas++;
                break;
            default:
                break;
        }
      Vehiculo.listaVehiculos.remove(indice);
      Vehiculo.placa.remove(indice);
      tarifa.remove(indice);
  }
    
}

