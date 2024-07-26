package structural.flyweight;

import java.util.HashMap;

public class PlayerFactory {
    HashMap<String, Player> players= new HashMap<String, Player> ();

    public Player getPLayer(String type) {
        if(players.containsKey(type)) {
            return players.get(type);
        } else {
            switch(type) {
                case "Terrorist": {
                Player player = new Terrorist();
                players.put("Terrorist", player);
                return player;
                }
            case "CounterTerrorist": {
            Player player = new CounterTerrorist();
            players.put("CounterTerrorist", player);
            return player;
            }
            default: return null;
            }
        }
    }
}

