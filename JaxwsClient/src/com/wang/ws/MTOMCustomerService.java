
package com.wang.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MTOMCustomerService", targetNamespace = "http://ws.wang.com/", wsdlLocation = "file:/C:/Users/Administrator/git/webservice/JaxwsClient/wsdl/MTOMCustomerService.wsdl")
public class MTOMCustomerService
    extends Service
{

    private final static URL MTOMCUSTOMERSERVICE_WSDL_LOCATION;
    private final static WebServiceException MTOMCUSTOMERSERVICE_EXCEPTION;
    private final static QName MTOMCUSTOMERSERVICE_QNAME = new QName("http://ws.wang.com/", "MTOMCustomerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Administrator/git/webservice/JaxwsClient/wsdl/MTOMCustomerService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MTOMCUSTOMERSERVICE_WSDL_LOCATION = url;
        MTOMCUSTOMERSERVICE_EXCEPTION = e;
    }

    public MTOMCustomerService() {
        super(__getWsdlLocation(), MTOMCUSTOMERSERVICE_QNAME);
    }

    public MTOMCustomerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MTOMCUSTOMERSERVICE_QNAME, features);
    }

    public MTOMCustomerService(URL wsdlLocation) {
        super(wsdlLocation, MTOMCUSTOMERSERVICE_QNAME);
    }

    public MTOMCustomerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MTOMCUSTOMERSERVICE_QNAME, features);
    }

    public MTOMCustomerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MTOMCustomerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MTOMCustomer
     */
    @WebEndpoint(name = "MTOMCustomerServicePort")
    public MTOMCustomer getMTOMCustomerServicePort() {
        return super.getPort(new QName("http://ws.wang.com/", "MTOMCustomerServicePort"), MTOMCustomer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MTOMCustomer
     */
    @WebEndpoint(name = "MTOMCustomerServicePort")
    public MTOMCustomer getMTOMCustomerServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.wang.com/", "MTOMCustomerServicePort"), MTOMCustomer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MTOMCUSTOMERSERVICE_EXCEPTION!= null) {
            throw MTOMCUSTOMERSERVICE_EXCEPTION;
        }
        return MTOMCUSTOMERSERVICE_WSDL_LOCATION;
    }

}