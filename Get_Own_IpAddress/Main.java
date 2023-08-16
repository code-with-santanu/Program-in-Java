import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws Exception
    {
        IpAddress obj = new IpAddress();
        InetAddress machineIp = InetAddress.getLocalHost();
        System.out.println("Your machine Ip is: " + machineIp);
    }
}
