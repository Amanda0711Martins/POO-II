public abstract class BlurayReproduzir extends ControleRemoto {
    public BlurayReproduzir(Dispositivo _disp){super();}

    public void botaoUm(){
        System.out.println("Reproduzindo Top Gun Maverick");
    }
    public void botaoDois(){
        System.out.println("Reproduzindo Homem Aranha");
    }
    public void botaoTres(){
        System.out.println("Em Pausa!");
    }

}
