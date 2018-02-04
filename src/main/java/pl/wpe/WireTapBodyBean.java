package pl.wpe;

import java.util.Objects;

public class WireTapBodyBean {
    private Integer numer;
    private String komunikat;

    public WireTapBodyBean utworzNowy(Integer numer, String komunikat){
        this.numer=numer;
        this.komunikat=komunikat;
        return this;
    }

    @Override
    public String toString() {
        return "WireTapBodyBean{" +
                "numer=" + numer +
                ", komunikat='" + komunikat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WireTapBodyBean)) return false;
        WireTapBodyBean that = (WireTapBodyBean) o;
        return Objects.equals(getNumer(), that.getNumer()) &&
                Objects.equals(getKomunikat(), that.getKomunikat());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNumer(), getKomunikat());
    }

    public Integer getNumer() {
        return numer;
    }

    public void setNumer(Integer numer) {
        this.numer = numer;
    }

    public String getKomunikat() {
        return komunikat;
    }

    public void setKomunikat(String komunikat) {
        this.komunikat = komunikat;
    }
}
