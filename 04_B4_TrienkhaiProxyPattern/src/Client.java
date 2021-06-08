public class Client {
    public static void main(String[] args) {
        String url = "https://anhnbt.com/images/logo-anhnbt.png";
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.77 Safari/537.36";
        String destination = "C:\\Users\\Nguyen Viet Tien\\Desktop\\Codegym\\03_Baitap\\02_Module2\\22_StructuralDesignPattern\\04_B4_TrienkhaiProxyPattern\\Picture.jpg";

        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        fileDownloaderProxy.download(userAgent, url, destination);

    }
}
