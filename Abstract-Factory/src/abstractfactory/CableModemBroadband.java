package abstractfactory;

public class CableModemBroadband implements Broadband {
    private final String bName;
    public CableModemBroadband() {
        bName="CABLEMODEM";
    }

    @Override
    public String getBroadbandName() {
        return bName;
    }
}
