package pl.wpe;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class PlikWalidacjaProcesor implements Processor {
    Logger log = Logger.getLogger(PlikWalidacjaProcesor.class);

    public void process(Exchange exchange) throws Exception {
        log.info("Start procesor");
        String tresc = exchange.getIn().getBody(String.class);
        log.info("Plik: "+tresc);
        if (tresc.startsWith("blad")){
            log.error("Plik bledny");
            throw new BlednyPlikException("Plik jest bledny");
        }
        else{
            log.info("Plik poprawny");
        }
    }
}
