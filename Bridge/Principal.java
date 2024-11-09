
/**
 * Método Main que implementa o uso das classes
 * 
 * @author Amanda Martins
 * @version 07/11/2024
 */
public class Principal
{

    public static void main(String[] aaaaaaaaaaaaaaaaaaa){
        ControleRemoto tv1 = new TvQueFicaMuda(new TV(1,100));
        ControleRemoto tv2 = new TvQuePausa(new TV(1,200));
        BlurayReproduzir blu1 = new BlurayReproduzir(new Bluray()) {
            @Override
            public void botaoNove() {

            }
        };
        BlurayReproduzir blu2 = new BlurayReproduzir(new Bluray()) {
            @Override
            public void botaoNove() {

            }
        };
        JogarPlayStation jogo1 = new JogarPlayStation();
    
        System.out.println("Testando a TV que fica muda:");
        tv1.botaoCinco();
        tv1.botaoSeis();
        tv1.botaoNove();
        
        System.out.println("Testando a TV que pausa:");
        tv2.botaoCinco();
        tv2.botaoSeis();
        tv2.botaoNove();

        System.out.print("Iniciando Bluray!\n");
        blu1.botaoUm();
        blu2.botaoTres();
        blu2.botaoDois();
        blu1.botaoTres();

        System.out.print("Iniciando PlayStation 5!\n");
        jogo1.botaoQuatro();
        jogo1.botaoOito();
        jogo1.botaoSete();
        jogo1.botaoOito();
        jogo1.botaoDez();
    }

}
