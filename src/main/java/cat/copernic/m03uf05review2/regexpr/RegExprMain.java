/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pep
 */
public class RegExprMain {

    /**
     * Expresión regular que valide NIF
     */
    static boolean validateNif(String nif) {
        Pattern p = Pattern.compile("^$");
        Matcher m1 = p.matcher(nif);
        return m1.matches();
    }

    /**
     * Expresión regular que valide NIE
     */
    /**
     * Expresión regular que valide un telefono de movil
     */
    /**
     * Expresión regular que valide un telefono de España
     */
    /**
     * Expresión regular que valide una matricula: 4 digitos espacio 3 letras
     * mayúscula sin vocales
     */
    /**
     * Expresión regular que valide una fecha formato dd/mm/aaaa
     */
    /**
     * Expresión regular que valide un email
     */
    
    
    /**
     * @param args the command line arguments Regular expressions are a way to
     * describe a set of strings based on common characteristics shared by each
     * string in the set
     *
     * A Pattern object is a compiled representation of a regular expression
     *
     * A Matcher object is the engine that interprets the pattern and performs
     * match operations against an input string
     *
     * A PatternSyntaxException object is an unchecked exception that indicates
     * a syntax error in a regular expression pattern
     *
     */
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^(\\p{Lower}|\\p{Digit})+$");
        Matcher m1 = p.matcher("a9");
        Matcher m2 = p.matcher("ab8");
        boolean b1 = m1.matches();
        boolean b2 = m2.matches();
        System.out.println(b1);
        System.out.println(b2);
    }

}
