package abstractfactory;

public class DslBroadband implements Broadband {

    private final String bName;
    public DslBroadband() {
        bName="DSL";
    }

    @Override
    public String getBroadbandName() {
        return bName;
    }
}
