package example;

import com.stockquote.cool.StockQuote;
import com.stockquote.cool.StockQuoteSoap;

import javax.xml.namespace.QName;

/**
 * Created by student on 10/5/2015.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    com.stockquote.cool.StockQuoteSoap service = new StockQuote().getPort(StockQuoteSoap.class);
    //invoke business method
    System.out.println(service.getQuote("TWTR"));
  }
}
