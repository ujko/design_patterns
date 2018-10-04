package structural.proxy;

public class ProxyTest {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("adm", "pass");
        try {
            executor.runCommand("dir");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
