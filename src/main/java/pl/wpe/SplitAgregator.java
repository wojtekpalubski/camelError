package pl.wpe;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

public class SplitAgregator implements AggregationStrategy {
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

            if (oldExchange == null) {
                return newExchange;
            }
            String body = newExchange.getIn().getBody(String.class);
            String existing = oldExchange.getIn().getBody(String.class);
            oldExchange.getIn().setBody(existing + "\n" + body);
            return oldExchange;
        }

}
