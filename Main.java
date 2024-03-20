package trabalhop2.SistemaDeJogos;

public class Main{
    public static void main(String[] args){
        // ===================== Desenvolvedoras ==============================

        Desenvolvedora rockstar  = new Desenvolvedora("Rockstar Games");
        Desenvolvedora cdProject = new Desenvolvedora("CD Project");
        Desenvolvedora ea = new Desenvolvedora("Eletronic Arts");
        Desenvolvedora santaMonica = new Desenvolvedora("Santa Monica");
        Desenvolvedora valve = new Desenvolvedora("Valve");
        Desenvolvedora activision = new Desenvolvedora("Actvision Blizzard");

        //====================== Categorias ====================================
        
        Categoria acao = new Categoria("Ação");
        Categoria rpg = new Categoria("RPG");
        Categoria esporte = new Categoria("Esporte");
        Categoria fps = new Categoria("FPS");
        Categoria corrida = new Categoria("Corrida");
        
        // ===================== Jogos =========================================

        Jogo gtav = new Jogo("GTA V", "2341-2", 250.00, acao, rockstar);
        Jogo redDead2 = new Jogo("Red Dead Redemption 2", "7890-1", 199.99, acao, rockstar);
        Jogo maxPayne3 = new Jogo("Max Payne 3", "5678-3", 49.99, acao, rockstar);
        Jogo bully = new Jogo("Bully", "1234-5", 29.99, acao, rockstar);
        Jogo theWitcher3 = new Jogo("The Witcher 3", "3242-1", 150.00, rpg, cdProject);
        Jogo cyberPunk2077 = new Jogo("CyperPunk 2077", "3245-9", 300.00, rpg, cdProject);
        Jogo gow = new Jogo("God Of War 2018", "2456-2", 240.0, acao, santaMonica);
        Jogo fifa23 = new Jogo("Fifa", "3059-2", 300.00, esporte, ea);
        Jogo csgo = new Jogo("Counter-Strike: Global Ofensive", "3234-12", 29.99, fps, valve);
        Jogo nfs = new Jogo("Need For Speed", "2385-2", 240.00, corrida, ea);
        Jogo cod = new Jogo("Call of Duty", "3234-9", 350.00, fps, activision);
        
        //======================PROMOÇÕES=======================================

        Promocao blackFriday = new Promocao("Promoção de Black Friday", 50.0);
        Promocao pascoa = new Promocao("Promoção de Páscoa", 30.0);
        Promocao fimDeAno = new Promocao("Promoção de Fim de Ano", 80.0);

        System.out.println(pascoa.adicionarJogo(redDead2));
        System.out.println(fimDeAno.adicionarJogo(fifa23));
        blackFriday.adicionarJogo(gow);
        
        // ===================== Funcionarios ================================

        Funcionario func1 = new Funcionario("Astolfo", "111.234.421-55", "astolfin123@gmail.com", "aodosd34", "rua astolfo pereira bastos", 4250.00, "1231234-56");

        // ===================== Clientes ====================================

        Cliente cli1 = new Cliente("mauro", "111.111.111-90", "usuario@gmail.com", "mauro123", "rua do mauro", "434-13", "boleto");

        Cliente cli2 = new Cliente("Joaozin", "345.347.123-80", "joaozin@gmail.com", "jooaozin123", "Rua do joaozin", "2324-1", "cartao");


    }
}