
package paquete_factura;


public class Producto {
   private  int codigo;
    private  String  descripcion;
    private String unidad;
    private double valor;
    
    public Producto(int codigo, String descripcion, String unidad,  double precio_unit){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.valor = precio_unit;
    }
    
    public int obtener_codigo(){
        return  this.codigo;
    }
    
    public String obtener_descrpcion(){
        return  this.descripcion;
    }
    
    public String obtener_unidad(){
        return  this.unidad;
    }
    
    public double obtener_valor(){
        return this.valor; 
    }
    
    public void modValor(double x){
        this.valor = x;
    }
}
