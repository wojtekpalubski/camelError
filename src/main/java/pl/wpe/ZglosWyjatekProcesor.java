package pl.wpe;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.Set;

public class ZglosWyjatekProcesor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        throw new Exception("Blad zapisu diagnostyki");
    }
}
