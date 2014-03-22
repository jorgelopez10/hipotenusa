/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operacion;

/**
 *
 * @author T3
 */
public class OPERACION {
    double catetoadyacente = 0;
    double catetoopuesto = 0;
    double resultado = 0;
    public void asignarnumeros(double catetoadyacente, double catetoopuesto)
    {
        this.catetoadyacente = catetoadyacente;
        this.catetoopuesto = catetoopuesto;
    }
    public double resultado()
    {
        resultado = Math.hypot(catetoadyacente, catetoopuesto);
        return resultado;
    }
}
