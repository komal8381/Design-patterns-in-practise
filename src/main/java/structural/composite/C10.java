package structural.composite;

import structural.adapter.IAircraft;

public class C10 implements IAlliancePart, IAircraft {
    public void fly() {

    }

    public int getPersonnel() {
        return 5;
    }
}
