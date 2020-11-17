/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr.calc;

/**
 *
 * @author pep
 *
 * Simplificar la Fraccion resultado
 */
public class CalculadoraDeFracciones {

    private Fraccion operador1;

    private Fraccion operador2;

    public CalculadoraDeFracciones(Fraccion operador1, Fraccion operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    /**
     * a/b + c/d = ((ad)+(bc)) / (bd)
     *
     * @return
     */
    public Fraccion suma() {
        return new Fraccion(operador1.getNumerador() * operador2.getDenominador() + operador1.getDenominador() * operador2.getNumerador(),
                operador1.getDenominador() * operador2.getDenominador());
    }

    public Fraccion resta() {
        return new Fraccion(operador1.getNumerador() * operador2.getDenominador() - operador1.getDenominador() * operador2.getNumerador(),
                operador1.getDenominador() * operador2.getDenominador());
    }

    /**
     * producto de dos fracciones operador1 * operador2
     */
    /**
     * division de dos fracciones operador1 / operador2
     *
     */
    /**
     * Maximo comun divisor, el numero mas grande que divide dos numeros
     *
     * por ejemplo mcd(12, 9) = 3 Fraccion(12, 9) -> Fraccion(4, 3)
     *
     * @param d1
     * @param d2
     * @return
     */
    private double mcd(double d1, double d2) {
        return 1.0;
    }

    private Fraccion simplify(Fraccion fraccion) {
        double mcd = mcd(fraccion.getNumerador(), fraccion.getDenominador());
        return new Fraccion(fraccion.getNumerador() / mcd, fraccion.getDenominador() / mcd);
    }

}
