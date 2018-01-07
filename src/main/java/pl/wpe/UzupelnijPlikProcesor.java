package pl.wpe;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class UzupelnijPlikProcesor implements Processor {
    Logger log = Logger.getLogger(UzupelnijPlikProcesor.class);
    public void process(Exchange exchange) throws Exception {
        String tresc = exchange.getIn().getBody(String.class);
        exchange.getIn().setBody(tresc+" ----- ");
    }
}
