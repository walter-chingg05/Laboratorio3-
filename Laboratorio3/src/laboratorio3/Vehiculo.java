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
public class Vehiculo {
  static ArrayList<String> tiempoingreso =new ArrayList<String>();
 static ArrayList<String> tiemposalida =new ArrayList<String>();
 static ArrayList<Integer> tiempo =new ArrayList<Integer>();
 static ArrayList<Integer> valor =new ArrayList<Integer>();
 
 public static String tipovehiculo;
 public boolean vehiculoenparqueadero;

Vehiculo(String tipovehiculo,String tiempoingreso,String tiemposalida,Boolean vehiculoenparqueadero)
{
    this.tipovehiculo= tipovehiculo;
    this.vehiculoenparqueadero= vehiculoenparqueadero;
    //this.tiempoingreso
    //this.tiemposalida =new ArrayList<Integer>();
    
}

    Vehiculo() {
      
    }
    
    
static ArrayList<String> listaVehiculos=  new ArrayList<String>();
 static     ArrayList<String> placa=  new ArrayList<String>();

   
public String vehiculo(String tipovehiculo, String nplaca)
{
  // tipo_vehiculo =jComboBoxTIPO.getSelectedItem().toString();
    
        switch (tipovehiculo) {
          
            case "Carro":
                System.out.println("selceciono "+ tipovehiculo);
                listaVehiculos.add(tipovehiculo);
                placa.add(nplaca);
                
              
                 break;
            case "Moto":
                System.out.println("selceciono "+ tipovehiculo);
                listaVehiculos.add(tipovehiculo);
                placa.add(nplaca);
                break;
            case "Bicicleta":
                System.out.println("selceciono "+ tipovehiculo);
                listaVehiculos.add(tipovehiculo);
                placa.add(nplaca);
               break;
            default:
                break;
        } 
     
        return tipovehiculo;
        
} static int hora_entrada=0;
int posicion=(listaVehiculos.size());

public int entrada(String hora,String min)
{
    hora_entrada=((Integer.parseInt(hora)*60)+Integer.parseInt(min));
    //if (hora_entrada>=360  && hora_entrada<=1320  ) 
       // {
    tiempoingreso.add(hora+":"+min);
   
   
 
    System.out.println("hora: "+hora_entrada );
     //}else   
        //{
           //  JOptionPane.showMessageDialog(null, "Fuera Del Horario De Funcionamiento");
//      listaVehiculos.remove(posicion);
               // placa.remove(posicion);
//            tiempoingreso.remove(posicion);
          //  hora_entrada=-1;
        //}
    return hora_entrada;
}
 static int hora_salida=0;
public int salida(String hora,String min)
{
    hora_salida=((Integer.parseInt(hora)*60)+Integer.parseInt(min));
    
        
    

    if ( hora_salida<=1320 && hora_salida>=360  ) 
        {
    tiemposalida.add(hora+":"+min);
   
   
 
    System.out.println("hora: "+hora_salida );
    
    }else   
        {
             JOptionPane.showMessageDialog(null, "Fuera Del Horario De Funcionamiento");
           
        }
   
    
    
    return hora_salida;
}
 int num=0;
public void calculo(int indice)
{ 
    
   
   
     
        if (hora_entrada>hora_salida) 
        {
            num=+hora_entrada-hora_salida;
             tiempo.add(indice, num);
             
        }
        else
        {
            num=hora_salida-hora_entrada;
             tiempo.add(indice, num);
        }
       
        
       
            if (num>=600) 
            {
                valor.add(indice, 13000);
            }
            
            else
            {
             Integer ne=  parqueadero.tarifa.get(indice);
                valor.add(indice, ne*num);
            }
   
            
       
        
    System.out.println("total:" +(num)+"$");
}
int indice;
public int buscar(String buscar)
{
   
   
     indice=placa.indexOf(buscar);
       
        if (indice>=0) {
            System.out.println("se encuentra en "+indice+"eeee"+listaVehiculos.get(indice)+"fff"+placa.get(indice));
           // vehiculoenparqueadero=true;
            
            return indice;
        } 
        else{
            //vehiculoenparqueadero=false;
            indice=-1;
         return indice;  
        }
           
           
       
}
}
