package pokemon;

public class Principal {
    
      public static void main(String[] args) {
        Pokemon meuPokemon = new Pokemon("Squirtle", "Agua", 72);
        Pokemon outroPokemon = new Pokemon("Charmander", "Fogo", 81);
        
        
        Batalha batalha1 = new Batalha();
               
        System.out.println("Seu Pokémon: ");
        meuPokemon.imprimiPokemon();
        System.out.println("Pokémon Inimigo: ");
        outroPokemon.imprimiPokemon();
        
        batalha1.meuPokemon(meuPokemon.getNome(),meuPokemon.getVida());
        batalha1.outroPokemon(outroPokemon.getNome(),outroPokemon.getVida());
        
        batalha1.startBattle();               
  }
}