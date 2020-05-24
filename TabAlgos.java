package dev;
/** Definition de la classe.*/
public final class TabAlgos {
/** Constructeur par défaut.*/
private TabAlgos() {
//Constructor par défaut
}
/**@return valeur la plus grande d'un tableau.
 *@param tab tableau d'entiers.
 */
public static int plusGrand(final int[] tab) {
int max = 0;
for (int i = 0; i < tab.length; i++) {
if (tab[i] > max) {
max = tab[i];
}
}
return max;
}
/**@return moyenne des valeurs du tableau.
 *@throw IllegalArgumentException si tab et null ou vide.
*@param tab tableau d'entiers.
*/
public static double moyenne(final int[] tab) {
if (tab == null || tab.length == 0) {
throw new IllegalArgumentException("Le tableau est nulle ou vide");
} else {
double total = 0;
for (int i = 0; i < tab.length; i++) {
total = total + tab[i];
}
return total / tab.length;
}
}
/** Compare le contenu de 2 tableaux en tenant compte de l'ordre.
* @return true si les 2 tableaux contiennent les mêmes éléments.
* @param tab1 tableau d'entiers.
* @param tab2 tableau d'entiers.
*         avec les mêmes nombres d'occurences.
*         (avec les elements dans le meme ordre).
*/
public static boolean egaux(final int[] tab1, final int[] tab2) {
if (tab1 == tab2) {
return true;
}
if (tab1 == null || tab2 == null) {
return false;
}
if (tab1.length != tab2.length) {
return false;
}
for (int i = 0; i < tab1.length; i++) {
if (tab1[i] != tab2[i]) {
return false;
}
}
return true;
}
/** Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
* @return true si les 2 tableaux contiennent les mêmes éléments
* @param tab1 tableau d'entiers.
* @param tab2 tableau d'entiers.
*         avec les mêmes nombres d'occurrence.
*         (pas forcément dans le meme ordre).
*/
public static boolean similaires(final int[] tab1, final int[] tab2) {
if (tab1 == tab2) {
return true;
}
if (tab1 == null || tab2 == null) {
return false;
}
if (tab1.length != tab2.length) {
return false;
}
int temp;
for (int i = 1; i < tab1.length; i++) {
for (int j = i; j > 0; j--) {
if (tab1[j] < tab1[j - 1]) {
temp = tab1[j];
tab1[j] = tab1[j - 1];
tab1[j - 1] = temp;
}
}
}
for (int i = 1; i < tab2.length; i++) {
for (int j = i; j > 0; j--) {
if (tab2[j] < tab2[j - 1]) {
temp = tab2[j];
tab2[j] = tab2[j - 1];
tab2[j - 1] = temp;
}
}
}
for (int i = 0; i < tab1.length; i++) {
if (tab1[i] != tab2[i]) {
return false;
}
}
return true;
}
}
