
/**
 * Representa uma televisão.
 * 
 * @author Amanda Martins
 * @version 07/11/2024
 */
public class TV extends Dispositivo
{
    public TV(int estado_, int maximo_){estado=estado_;maximo=maximo_;}
    
    public void botaoCinco(){
        System.out.println("Canal Down");
        estado--;
    }
    
    public void botaoSeis(){
        System.out.println("Canal UP"); estado++;
    }

}
