package de.unistuttgart.informatik.fius.jvk.tasks;

import java.util.Iterator;

import de.unistuttgart.informatik.fius.icge.simulation.Position;
import de.unistuttgart.informatik.fius.icge.simulation.Simulation;
import de.unistuttgart.informatik.fius.icge.simulation.entity.CollectableEntity;
import de.unistuttgart.informatik.fius.icge.simulation.tasks.Task;
import de.unistuttgart.informatik.fius.icge.simulation.tools.PlayfieldModifier;
import de.unistuttgart.informatik.fius.jvk.provided.entity.*;
import de.unistuttgart.informatik.fius.jvk.provided.factories.*;
import de.unistuttgart.informatik.fius.jvk.provided.shapes.*;


public class Sheet3Task1 implements Task {
    
    
    @Override
    public void run(Simulation sim) {
        preparePlayingField(sim);
        PlayfieldModifier pm = new PlayfieldModifier(sim.getPlayfield());
        
        // use this neo for b), c) and d) and e)
        Neo neo = new Neo();
        pm.placeEntityAt(neo, new Position(0, 0));
        
        //use this neo for f)
        Neo neoF = new Neo();
        pm.placeEntityAt(neoF, new Position(0, 2));
        
        //use this neo for g)
        Neo neoG = new Neo();
        pm.placeEntityAt(neoG, new Position(0, 4));
        
        //use this neo for h)
        Neo neoH = new Neo();
        pm.placeEntityAt(neoH, new Position(0, 6));
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void preparePlayingField(Simulation sim) {
        
        PlayfieldModifier pm = new PlayfieldModifier(sim.getPlayfield());

        // place walls
        Shape walls = new UnionShape(
            new Rectangle(new Position(-1, 1), new Position(6, 3)),
            new Rectangle(new Position(-1, 3), new Position(11, 5)),
            new Rectangle(new Position(-1, 5), new Position(11, 7))
        );
        pm.placeEntityAtEachPosition(new WallFactory(), walls);
        

        // place coins

        pm.placeEntityAt(new Coin(), new Position(30, 2));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 15, new Position(30, 18));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 8, new Position(40, 18));
        
        //f)
        pm.placeMultipleEntitiesAt(() -> new Coin(), 15, new Position(0, 2));
        
        //g)
        pm.placeMultipleEntitiesAt(new CoinFactory(), 4, new Position(1, 4));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 7, new Position(2, 4));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 2, new Position(3, 4));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 9, new Position(4, 4));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 6, new Position(5, 4));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 5, new Position(6, 4));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 2, new Position(7, 4));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 0, new Position(8, 4));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 8, new Position(9, 4));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 1, new Position(10, 4));
        
        //h)
        pm.placeMultipleEntitiesAt(new CoinFactory(), 7, new Position(1, 6));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 5, new Position(2, 6));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 6, new Position(3, 6));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 12, new Position(4, 6));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 4, new Position(5, 6));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 0, new Position(6, 6));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 10, new Position(7, 6));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 1, new Position(8, 6));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 8, new Position(9, 6));
        pm.placeMultipleEntitiesAt(new CoinFactory(), 4, new Position(10, 6));
    }
}
