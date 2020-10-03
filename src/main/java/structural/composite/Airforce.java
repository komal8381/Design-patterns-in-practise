package structural.composite;

import structural.adapter.IAircraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Airforce implements IAlliancePart {

    private List<IAlliancePart> planes;

    public Airforce() {
        planes = new ArrayList<IAlliancePart>();
    }

    public void add(IAlliancePart plane) {
        planes.add(plane);
    }

    public int getPersonnel() {
        Iterator<IAlliancePart> it = planes.iterator();
        int staff=0;
        while(it.hasNext()){
            staff +=it.next().getPersonnel();
        }
        return staff;
    }
}
