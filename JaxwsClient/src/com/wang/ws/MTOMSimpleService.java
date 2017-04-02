
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
@WebServiceClient(name = "MTOMSimpleService", targetNamespace = "http://ws.wang.com/", wsdlLocation = "http://localhost:8080/JaxwsProject/ws/MTOMSimpleService?wsdl")
public class MTOMSimpleService
    extends Service
{

    private final static URL MTOMSIMPLESERVICE_WSDL_LOCATION;
    private final static WebServiceException MTOMSIMPLESERVICE_EXCEPTION;
    private final static QName MTOMSIMPLESERVICE_QNAME = new QName("http://ws.wang.com/", "MTOMSimpleService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/JaxwsProject/ws/MTOMSimpleService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MTOMSIMPLESERVICE_WSDL_LOCATION = url;
        MTOMSIMPLESERVICE_EXCEPTION = e;
    }

    public MTOMSimpleService() {
        super(__getWsdlLocation(), MTOMSIMPLESERVICE_QNAME);
    }

    public MTOMSimpleService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MTOMSIMPLESERVICE_QNAME, features);
    }

    public MTOMSimpleService(URL wsdlLocation) {
        super(wsdlLocation, MTOMSIMPLESERVICE_QNAME);
    }

    public MTOMSimpleService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MTOMSIMPLESERVICE_QNAME, features);
    }

    public MTOMSimpleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MTOMSimpleService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MTOMSimple
     */
    @WebEndpoint(name = "MTOMSimplePort")
    public MTOMSimple getMTOMSimplePort() {
        return super.getPort(new QName("http://ws.wang.com/", "MTOMSimplePort"), MTOMSimple.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MTOMSimple
     */
    @WebEndpoint(name = "MTOMSimplePort")
    public MTOMSimple getMTOMSimplePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.wang.com/", "MTOMSimplePort"), MTOMSimple.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MTOMSIMPLESERVICE_EXCEPTION!= null) {
            throw MTOMSIMPLESERVICE_EXCEPTION;
        }
        return MTOMSIMPLESERVICE_WSDL_LOCATION;
    }

}