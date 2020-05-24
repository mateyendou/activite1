package dev;

/**
* Ma class d'exemple.
*/
public class Exemple {
/**definition d'une variable de type string.*/
 private final String t;
 /**definition d'une variable de type int.*/
 private final int v;
 /**@param t1 la valeur du paramètre.*/
public Exemple(final String t1) {
t = t1;
}
/**
* @return la valeur de v
*/
public int getV() {
return this.v;
}
/**@param v1 la valeur a attribuer à v.*/
public final void setV(final int v1) {
this.v = v1;
}
/**
* @return t si v est positif
*/
public final String getT() {
if (v > 0) {
return t;
}
}
}
