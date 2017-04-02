
package com.wang.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPersonResponse", namespace = "http://ws.wang.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPersonResponse", namespace = "http://ws.wang.com/")
public class GetPersonResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.wang.ws.Person> _return;

    /**
     * 
     * @return
     *     returns List<Person>
     */
    public List<com.wang.ws.Person> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.wang.ws.Person> _return) {
        this._return = _return;
    }

}
