package dev;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
/** Definition de la classe.*/
public final class TestTabAlgos {
/** Declaration de constantes utilise comme valeur de test.*/
/**definition variable de type integer.*/
public static final int VAL_1 = 1;
/**definition variable de type integer.*/
public static final int VAL_2 = 10;
/**definition variable de type integer.*/
public static final int VAL_3 = 5;
/**definition variable de type integer.*/
public static final int VAL_4 = 25;
/**definition variable de type integer.*/
public static final int VAL_5 = 15;
/**definition variable de type double.*/
public static final double VALEUR_MOYENNE = 11.2;
/**Test de la plus grande d'un tableau.*/
@Test
public void testplusGrand() {
int[] tab = {VAL_1, VAL_2, VAL_3, VAL_4, VAL_5};
int max = TabAlgos.plusGrand(tab);
int testmax = VAL_4;
assertEquals(testmax, max);
}
/**Test de tableau à valeurs nulle.*/
@Test
public void testTableauIsNull() {
int[] testtab = null;
Exception ex = assertThrows(Exception.class, () -> TabAlgos.moyenne(testtab));
assertEquals("Le tableau est nulle ou vide", ex.getMessage());
}
/**Test de la moyenne des valeurs du tableau.*/
@Test
public void testmoyenne() {
int[] tab = {VAL_1, VAL_2, VAL_3, VAL_4, VAL_5};
double calcmoyenne = TabAlgos.moyenne(tab);
double testmoyenne = VALEUR_MOYENNE;
assertEquals(testmoyenne, calcmoyenne, 0.0);
}
/**Test comparaison tableaux égaux.*/
@Test
public void   testegaux() {
int[] testtableau1 = {VAL_1, VAL_2, VAL_3, VAL_4, VAL_5};
int[] testtableau2 = {VAL_1, VAL_2, VAL_3, VAL_4, VAL_5};
boolean testegalite = true;
boolean egalite = TabAlgos.egaux(testtableau1, testtableau2);
assertEquals(testegalite, egalite);
}
/**Test tableaux similaires.*/
@Test
public void  testsimilaires() {
int[] testtableau1 = {VAL_1, VAL_2, VAL_3, VAL_4, VAL_5};
int[] testtableau2 = {VAL_1, VAL_2, VAL_3, VAL_4, VAL_5};
boolean testsimilarite = true;
boolean similarite = TabAlgos.similaires(testtableau1, testtableau2);
assertEquals(testsimilarite, similarite);
}
}
