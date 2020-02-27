/**
 * Beschreiben Sie hier die Klasse BATMAN
 * 
 * @author (Christian Bale) 
 * @version (Version 1)
 */
public class BATMAN extends SPIELFIGUR
{
    private int alter;
    private int staerke;

    /**
     * Konstruktor für Objekte der Klasse BATMAN
     */
    public BATMAN()
    {
        super(5, 10, 10);  // Diese Zeile ist wichtig! Aufruf des Konstruktors der Oberklasse.
        // Damit werden die Werte der Attribute Stärke, Geschwindigkeit und Geschicklichkeit gesetzt.
        
        // Nun die Initalisierung der Attribute der Unterklasse
        alter = 25;
        staerke = 9000;
    }

    /**
     * Methode zur Rueckgabe einer Charakterbeschreibung
     * 
     * @return Charakterbeschreibung 
     */
    public String CharakterbeschreibungAusgeben()
    {
        return "Was man im Inneren ist, zählt nicht. Das was wir tun, zeigt wer wir sind. ";
    }
    
     /**
     * Gibt die Spielereigenschaften auf dem Ausgabefenster aus.
     * Überschreibt die Methode der Oberklasse
     */
    public void SpielerEigenschaftenAusgeben()
    {
        System.out.println("Alter: " + alter);
        System.out.println("Stärke: " + staerke);
        // Aufruf der gleichnamigen Methode der Oberklasse
        super.SpielerEigenschaftenAusgeben();
    }
 
}