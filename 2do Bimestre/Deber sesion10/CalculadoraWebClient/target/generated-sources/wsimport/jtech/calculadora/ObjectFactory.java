
package jtech.calculadora;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jtech.calculadora package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NegativeNumberException_QNAME = new QName("http://calculadora.jtech/", "NegativeNumberException");
    private final static QName _Suma_QNAME = new QName("http://calculadora.jtech/", "suma");
    private final static QName _SumaResponse_QNAME = new QName("http://calculadora.jtech/", "sumaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jtech.calculadora
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link NegativeNumberException }
     * 
     */
    public NegativeNumberException createNegativeNumberException() {
        return new NegativeNumberException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeNumberException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.jtech/", name = "NegativeNumberException")
    public JAXBElement<NegativeNumberException> createNegativeNumberException(NegativeNumberException value) {
        return new JAXBElement<NegativeNumberException>(_NegativeNumberException_QNAME, NegativeNumberException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.jtech/", name = "suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.jtech/", name = "sumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

}
