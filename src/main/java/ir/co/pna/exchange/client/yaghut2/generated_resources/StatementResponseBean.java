//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.06 at 01:42:25 PM IRDT 
//


package ir.co.pna.exchange.client.yaghut2.generated_resources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statementResponseBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statementResponseBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasMoreItem" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/&gt;
 *         &lt;element name="statementBeans" type="{http://service.yaghut.modern.tosan.com/}statementBean" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="totalRecord" type="{http://www.w3.org/2001/XMLSchema}long" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statementResponseBean", namespace = "http://service.yaghut.modern.tosan.com/", propOrder = {
    "hasMoreItem",
    "statementBeans",
    "totalRecord"
})
public class StatementResponseBean {

    @XmlElement(namespace = "")
    protected boolean hasMoreItem;
    @XmlElement(namespace = "", nillable = true)
    protected List<StatementBean> statementBeans;
    @XmlElement(namespace = "")
    protected long totalRecord;

    /**
     * Gets the value of the hasMoreItem property.
     * 
     */
    public boolean isHasMoreItem() {
        return hasMoreItem;
    }

    /**
     * Sets the value of the hasMoreItem property.
     * 
     */
    public void setHasMoreItem(boolean value) {
        this.hasMoreItem = value;
    }

    /**
     * Gets the value of the statementBeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementBeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementBeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementBean }
     * 
     * 
     */
    public List<StatementBean> getStatementBeans() {
        if (statementBeans == null) {
            statementBeans = new ArrayList<StatementBean>();
        }
        return this.statementBeans;
    }

    /**
     * Gets the value of the totalRecord property.
     * 
     */
    public long getTotalRecord() {
        return totalRecord;
    }

    /**
     * Sets the value of the totalRecord property.
     * 
     */
    public void setTotalRecord(long value) {
        this.totalRecord = value;
    }

}
