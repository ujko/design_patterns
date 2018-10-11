package behavioral.command;

public class CommandTest {
    public static void main(String[] args) {
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
        FileInvoker file = new FileInvoker(openFileCommand);
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
