import Certificate_Pack.ICertificate;
import Perfume_Pack.IPerfume;

public class CertificateAdapter implements IPerfume {
    ICertificate certificate;

    public CertificateAdapter(ICertificate certificate) {
        this.certificate = certificate;
    }

    @Override
    public String getName() {
        return certificate.getName();
    }

    @Override
    public double getPrice() {
        return certificate.getPrice();
    }
}
