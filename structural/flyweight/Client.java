package structural.flyweight;

public class Client {
   public static void main(String[] args) {
       PlayerFactory playerFactory = new PlayerFactory();
       Player player = playerFactory.getPLayer("Terrorist");
       player.mission();
       Player player2 = playerFactory.getPLayer("CounterTerrorist");
       player2.mission();
       Player player3 = playerFactory.getPLayer("Terrorist");
       System.out.println(player.hashCode());
       System.out.println(player3.hashCode());
       /*
       output
       Mission is
       Mission is
       1482968390
       1482968390
       */
   } 
}
