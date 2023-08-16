import java.net.InetAddress;

public class IpAddress {
    public InetAddress getIpAddress() throws Exception
    {
        return InetAddress.getLocalHost();
    }
}
