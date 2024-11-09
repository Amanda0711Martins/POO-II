
/**
 *  Representa uma TV que pausa ao pressionar o botão nove.
 * 
 * @author Amanda Martins
 * @version 07/11/2024
 */
public class TvQuePausa extends ControleRemoto
{
    private boolean pausada=false;
    public void unPause(){pausada=false;}
    
    public TvQuePausa(Dispositivo _disp){super(_disp);}
    
    public void botaoNove(){
        System.out.println("TV Pausada!");
        pausada=true;
    }
    
}
