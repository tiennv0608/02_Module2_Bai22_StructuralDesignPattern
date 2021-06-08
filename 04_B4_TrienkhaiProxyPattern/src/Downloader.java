import java.io.IOException;
import java.net.MalformedURLException;

public interface Downloader {
    void download(String userAgent, String url, String dest);
}
