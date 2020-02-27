
/**
 * Beschreiben Sie hier die Klasse PACMAN.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class PACMAN extends SPIELFIGUR
{
    // Attribute 
    boolean fressbar;

    /**
     * Konstruktor für Objekte der Klasse PACMAN
     */
    PACMAN()
    {
        super(5, 5, 5); 
        
        fressbar = false;
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
        return "Pacman wins!";
        
    }
    
    /**
     * Gibt die Spielereigenschaften auf dem Ausgabefenster aus.
     * Überschreibt die Methode der Oberklasse
     */
    public void SpielerEigenschaftenAusgeben()
    {
        System.out.println("fressbar :"+ fressbar);
        // Aufruf der gleichnamigen Methode der Oberklasse
        super.SpielerEigenschaftenAusgeben();
    }
}
