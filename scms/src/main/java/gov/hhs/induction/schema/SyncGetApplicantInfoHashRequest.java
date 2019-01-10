//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 11:07:08 PM EST 
//


package gov.hhs.induction.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionHeader" type="{http://hspd12.hhs.gov/federated/enrollment/v1}TransactionHeaderType"/&gt;
 *         &lt;element name="SearchOPDIV" type="{http://hspd12.hhs.gov/federated/enrollment/v1}OpdivCodeType" minOccurs="0"/&gt;
 *         &lt;element name="SearchPersonIdRange" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PersonIdRangeType"/&gt;
 *         &lt;element name="ResultSlices" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactionHeader",
    "searchOPDIV",
    "searchPersonIdRange",
    "resultSlices"
})
@XmlRootElement(name = "SyncGetApplicantInfoHashRequest")
public class SyncGetApplicantInfoHashRequest {

    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeaderType transactionHeader;
    @XmlElement(name = "SearchOPDIV")
    @XmlSchemaType(name = "string")
    protected OpdivCodeType searchOPDIV;
    @XmlElement(name = "SearchPersonIdRange", required = true)
    protected PersonIdRangeType searchPersonIdRange;
    @XmlElement(name = "ResultSlices", defaultValue = "1")
    protected Integer resultSlices;

    /**
     * Gets the value of the transactionHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionHeaderType }
     *     
     */
    public TransactionHeaderType getTransactionHeader() {
        return transactionHeader;
    }

    /**
     * Sets the value of the transactionHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionHeaderType }
     *     
     */
    public void setTransactionHeader(TransactionHeaderType value) {
        this.transactionHeader = value;
    }

    /**
     * Gets the value of the searchOPDIV property.
     * 
     * @return
     *     possible object is
     *     {@link OpdivCodeType }
     *     
     */
    public OpdivCodeType getSearchOPDIV() {
        return searchOPDIV;
    }

    /**
     * Sets the value of the searchOPDIV property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpdivCodeType }
     *     
     */
    public void setSearchOPDIV(OpdivCodeType value) {
        this.searchOPDIV = value;
    }

    /**
     * Gets the value of the searchPersonIdRange property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdRangeType }
     *     
     */
    public PersonIdRangeType getSearchPersonIdRange() {
        return searchPersonIdRange;
    }

    /**
     * Sets the value of the searchPersonIdRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdRangeType }
     *     
     */
    public void setSearchPersonIdRange(PersonIdRangeType value) {
        this.searchPersonIdRange = value;
    }

    /**
     * Gets the value of the resultSlices property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultSlices() {
        return resultSlices;
    }

    /**
     * Sets the value of the resultSlices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultSlices(Integer value) {
        this.resultSlices = value;
    }

}
