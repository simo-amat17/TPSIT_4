/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retta;

/**
 *
 * @author Amatucci Simone 4INB 23/03/2017
 */
public class Retta {
    private double a;
    private double b;
    private double c;
    private double ordinata;
    private double ascissa;
    public Retta(double x1, double x2, double x3){
      this.a = x1;
      this.b = x2;
      this.c = x3;
    }
    public String getTipo(){
      String tipo = "obliqua";
      if(this.a == 0){
          tipo = "orizzontale";
      }
      if(this.b == 0){
          tipo = "verticale";
      }
      return tipo;
    } 
    public boolean appartenenza(double x, double y){
       double appartiene = (a * x)+(b * y)+ c;
       if(appartiene == 0){
         return true; 
       }else{
       return false;
       }
    } 
    public String stampa(){
      String equazione = this.a +" x + " + this.b+" y + "+ this.c+" = 0";
      if(a==0){
          equazione = this.b +" y + "+ this.c+" = 0";
      }
      if(b ==0){
          equazione = this.a +" x + "+ this.c+" = 0";
      }
      if(c==0){
          equazione = this.a+" x +"+this.b+" y = 0";
      }
      if((a ==0)&&(c ==0)){
          equazione = this.b+"y = 0";
      }
      if((b ==0)&&(c ==0)){
          equazione = this.a+"y = 0";
      }
      return equazione;
    }
    
}
