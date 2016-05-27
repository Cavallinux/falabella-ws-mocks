
package com.falabella.ws.service.evaluacliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listaRechazos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listaRechazos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RECHAZO" type="{http://control.evaluacionEnlinea.ws.bancofalabella.cl/}rechazo" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaRechazos", propOrder = {
    "rechazo"
})
public class ListaRechazos {

    @XmlElement(name = "RECHAZO", required = true)
    protected List<Rechazo> rechazo;

    /**
     * Gets the value of the rechazo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rechazo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECHAZO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rechazo }
     * 
     * 
     */
    public List<Rechazo> getRECHAZO() {
        if (rechazo == null) {
            rechazo = new ArrayList<Rechazo>();
        }
        return this.rechazo;
    }

}
