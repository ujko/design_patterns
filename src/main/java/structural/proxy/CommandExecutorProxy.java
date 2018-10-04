package structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String pwd) {
        if("adm".equals(user) && "pass".equals(pwd)) {
            isAdmin = true;
        }
        commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin) {
            commandExecutor.runCommand(cmd);
        } else {
            if(cmd.trim().startsWith("rm")) {
                throw new Exception("rm command not allowed for non-admin users");
            } else {
                commandExecutor.runCommand(cmd);
            }
        }
    }
}
