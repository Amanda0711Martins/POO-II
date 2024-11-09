
/**
 * Classe base para representar um controle remoto.
 * 
 * @author Amanda Martins
 * @version 07/11/2024
 */
public abstract class ControleRemoto
{
    private Dispositivo disp;
    
    public ControleRemoto(Dispositivo novo_){disp=novo_;}

    public ControleRemoto() {

    }

    public void botaoCinco(){disp.botaoCinco();}
    public void botaoSeis(){disp.botaoSeis();}
    
    public void feedbackDispositivo(){disp.feedbackDispositivo();}
    
    public abstract void botaoNove();

}
