
/**
 * WOMBATs sind niedliche kleine Tiere aus Ozeanien.
 * 
 * @author (Peter Brichzin) 
 * @version (Version 1)
 */
public class WOMBAT extends SPIELFIGUR
{
    private String fell;

    /**
     * Konstruktor fuer Objekte der Klasse WOMBAT
     */
    public WOMBAT()
    {
        super(5, 10, 10); // Diese Zeile ist wichtig! Aufruf des Konstruktors der Oberklasse.
        // Damit werden die Werte der Attribute Stärke, Geschwindigkeit und Geschicklichkeit gesetzt.
        
        // Nun die Initalisierung der Attribute der Unterklasse
        fell = "kuschelig";         
    }

    /**
    /**
     * Methode zur Rueckgabe einer Charakterbeschreibung
     * Implementierung der abstrakten Methode der Oberklasse
     * 
     * @return Charakterbeschreibung 
     */
    public String CharakterbeschreibungAusgeben()
    {
        return "Wombats sind kleine Artgenossen mit kuscheligem Fell, die es aber auch in sich haben!";
        
    }
    
    /**
     * Gibt die Spielereigenschaften auf dem Ausgabefenster aus.
     * Überschreibt die Methode der Oberklasse
     */
    public void SpielerEigenschaftenAusgeben()
    {
        System.out.println("Fell :"+ fell);
        // Aufruf der gleichnamigen Methode der Oberklasse
        super.SpielerEigenschaftenAusgeben();
    }
 
    
}
