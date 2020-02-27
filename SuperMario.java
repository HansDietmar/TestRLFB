
/**
 * Beschreiben Sie hier die Klasse SuperMario.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SuperMario extends SPIELFIGUR
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    boolean latzHose;

    /**
     * Konstruktor für Objekte der Klasse SuperMario
     */
    public SuperMario()
    {
       super(5,5,5);
       latzHose=true;
    }

       public String CharakterbeschreibungAusgeben(){
        if(latzHose) return "Ich trag ne Latzhose";
        else return "";
        
        }
    
    public void jump()
    {
        
    }
}
