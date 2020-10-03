package creational.factory.factoryPattern;

public class F16A extends F16 {
    @Override
    protected F16 makeF16() {
        super.makeF16();
        this.engine = new F16AEngine();
        return this;
    }
}
