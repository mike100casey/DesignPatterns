package template_method;

import adapter_penalty.Goalkeeper;
import adapter_penalty.GoalkeeperAdapter;
import decorator_penalty.PlayersGear;
import decorator_penalty.Hat;
import decorator_penalty.TrackSuitPants;
import strategy_penalty.Position;

/**
 * Created by Michael on 11/28/2015.
 */
public class Tester {

    public static void main(String[] args) {

        OutfieldPlayer penaltyTaker = new OutfieldPlayer(new PlacementMethod());
        penaltyTaker.takePenalty();
        penaltyTaker.changeMethod(new PowerMethod());
        penaltyTaker.takePenalty();
        System.out.println("---------------------------------------");

        PlayersGear goalkeeperGear = new Goalkeeper();
        goalkeeperGear = new Hat(goalkeeperGear);
        goalkeeperGear = new TrackSuitPants(goalkeeperGear);
        System.out.println(goalkeeperGear.getDescription());
        System.out.println("---------------------------------------");

        OutfieldPlayer goalie = new OutfieldPlayer(new GoalkeeperAdapter(new Goalkeeper()));
        goalie.takePenalty();
        System.out.println("---------------------------------------");

        Position goalkeeper = new Position(new Goalkeeper());
        goalkeeper.playerPosition();

    }
}
