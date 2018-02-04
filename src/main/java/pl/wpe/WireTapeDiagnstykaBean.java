package pl.wpe;

import org.apache.camel.Exchange;

import java.util.Objects;

public class WireTapeDiagnstykaBean {
    private String komunikat1;
    private String komunikat2;

    public void utworzKomunikatDiagnostyczny(Exchange exchange){
        String kom=exchange.getIn().getHeader("EPO_JAKIS_NAGLOWEK", String.class);
        WireTapeDiagnstykaBean  diag=new WireTapeDiagnstykaBean();
        diag.setKomunikat1(kom);
        exchange.getIn().setBody(diag);
    }

    public String getKomunikat1() {
        return komunikat1;
    }

    public void setKomunikat1(String komunikat1) {
        this.komunikat1 = komunikat1;
    }

    public String getKomunikat2() {
        return komunikat2;
    }

    public void setKomunikat2(String komunikat2) {
        this.komunikat2 = komunikat2;
    }

    @Override
    public String toString() {
        return "WireTapeDiagnstykaBean{" +
                "komunikat1='" + komunikat1 + '\'' +
                ", komunikat2='" + komunikat2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WireTapeDiagnstykaBean)) return false;
        WireTapeDiagnstykaBean that = (WireTapeDiagnstykaBean) o;
        return Objects.equals(komunikat1, that.komunikat1) &&
                Objects.equals(komunikat2, that.komunikat2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(komunikat1, komunikat2);
    }
}
