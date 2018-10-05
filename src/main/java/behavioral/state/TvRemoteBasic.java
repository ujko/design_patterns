package behavioral.state;

public class TvRemoteBasic {
    private String state = "";

    public void setState(String state) {
        this.state = state;
    }

    public void doAction() {
        if (state.equalsIgnoreCase("ON")) {
            System.out.println("TV is turned ON");
        } else if (state.equalsIgnoreCase("OFF")) {
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String[] args) {
        TvRemoteBasic remoteBasic = new TvRemoteBasic();
        remoteBasic.setState("ON");
        remoteBasic.doAction();
        remoteBasic.setState("OFF");
        remoteBasic.doAction();
    }
}
