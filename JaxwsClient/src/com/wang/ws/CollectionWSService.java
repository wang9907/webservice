
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
@WebServiceClient(name = "CollectionWSService", targetNamespace = "http://ws.wang.com/", wsdlLocation = "http://localhost:8080/JaxwsProject/CollectionWSService?wsdl")
public class CollectionWSService
    extends Service
{

    private final static URL COLLECTIONWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException COLLECTIONWSSERVICE_EXCEPTION;
    private final static QName COLLECTIONWSSERVICE_QNAME = new QName("http://ws.wang.com/", "CollectionWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/JaxwsProject/CollectionWSService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COLLECTIONWSSERVICE_WSDL_LOCATION = url;
        COLLECTIONWSSERVICE_EXCEPTION = e;
    }

    public CollectionWSService() {
        super(__getWsdlLocation(), COLLECTIONWSSERVICE_QNAME);
    }

    public CollectionWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COLLECTIONWSSERVICE_QNAME, features);
    }

    public CollectionWSService(URL wsdlLocation) {
        super(wsdlLocation, COLLECTIONWSSERVICE_QNAME);
    }

    public CollectionWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COLLECTIONWSSERVICE_QNAME, features);
    }

    public CollectionWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CollectionWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CollectionWS
     */
    @WebEndpoint(name = "CollectionWSPort")
    public CollectionWS getCollectionWSPort() {
        return super.getPort(new QName("http://ws.wang.com/", "CollectionWSPort"), CollectionWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CollectionWS
     */
    @WebEndpoint(name = "CollectionWSPort")
    public CollectionWS getCollectionWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.wang.com/", "CollectionWSPort"), CollectionWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COLLECTIONWSSERVICE_EXCEPTION!= null) {
            throw COLLECTIONWSSERVICE_EXCEPTION;
        }
        return COLLECTIONWSSERVICE_WSDL_LOCATION;
    }

}
