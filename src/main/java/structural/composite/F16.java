package structural.composite;

import structural.adapter.IAircraft;

public class F16 implements IAlliancePart, IAircraft {

    public void fly() {

    }

    public int getPersonnel() {
        return 2;
    }
}
