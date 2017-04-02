
package com.wang.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "echoDataResponse", namespace = "http://ws.wang.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "echoDataResponse", namespace = "http://ws.wang.com/")
public class EchoDataResponse {

    @XmlElement(name = "arg0", namespace = "", nillable = true)
    private byte[] arg0;

    /**
     * 
     * @return
     *     returns byte[]
     */
    public byte[] getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(byte[] arg0) {
        this.arg0 = arg0;
    }

}
