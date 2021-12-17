package abstractfactory;

abstract class AbstractFactory {
    public abstract Broadband getBroadband(String broadband);
    public abstract Plan getPlan(String plan);
}
