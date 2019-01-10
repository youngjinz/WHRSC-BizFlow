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
 *         &lt;element name="Operation"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Add"/&gt;
 *               &lt;enumeration value="Update"/&gt;
 *               &lt;enumeration value="AddOrUpdate"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PersonIds" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PacsPersonIdentifiersType"/&gt;
 *         &lt;element name="UpdatePersonIds" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PacsPersonIdentifiersType" minOccurs="0"/&gt;
 *         &lt;element name="PersonInfo" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PacsPersonInfoDataType" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="AddCard" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PacsCardInformationType"/&gt;
 *           &lt;element name="UpdateCard" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PacsCardInformationType"/&gt;
 *           &lt;element name="SuspendCard" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PacsCardIdentifiersType"/&gt;
 *           &lt;element name="ReactivateCard" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PacsCardIdentifiersType"/&gt;
 *           &lt;element name="RevokeCard" type="{http://hspd12.hhs.gov/federated/enrollment/v1}PacsCardIdentifiersType"/&gt;
 *           &lt;element name="SuspendAllCards" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="ReactivateAllCards" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="TerminateAllCards" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="WantPersonInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WantCardInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WantPacsUpdateNotification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SuppressPacsUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "operation",
    "personIds",
    "updatePersonIds",
    "personInfo",
    "addCard",
    "updateCard",
    "suspendCard",
    "reactivateCard",
    "revokeCard",
    "suspendAllCards",
    "reactivateAllCards",
    "terminateAllCards",
    "wantPersonInfo",
    "wantCardInfo",
    "wantPacsUpdateNotification",
    "suppressPacsUpdate"
})
@XmlRootElement(name = "SetPacsPersonDataRequest")
public class SetPacsPersonDataRequest {

    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeaderType transactionHeader;
    @XmlElement(name = "Operation", required = true)
    protected String operation;
    @XmlElement(name = "PersonIds", required = true)
    protected PacsPersonIdentifiersType personIds;
    @XmlElement(name = "UpdatePersonIds")
    protected PacsPersonIdentifiersType updatePersonIds;
    @XmlElement(name = "PersonInfo")
    protected PacsPersonInfoDataType personInfo;
    @XmlElement(name = "AddCard")
    protected PacsCardInformationType addCard;
    @XmlElement(name = "UpdateCard")
    protected PacsCardInformationType updateCard;
    @XmlElement(name = "SuspendCard")
    protected PacsCardIdentifiersType suspendCard;
    @XmlElement(name = "ReactivateCard")
    protected PacsCardIdentifiersType reactivateCard;
    @XmlElement(name = "RevokeCard")
    protected PacsCardIdentifiersType revokeCard;
    @XmlElement(name = "SuspendAllCards")
    protected String suspendAllCards;
    @XmlElement(name = "ReactivateAllCards")
    protected String reactivateAllCards;
    @XmlElement(name = "TerminateAllCards")
    protected String terminateAllCards;
    @XmlElement(name = "WantPersonInfo", defaultValue = "false")
    protected Boolean wantPersonInfo;
    @XmlElement(name = "WantCardInfo", defaultValue = "false")
    protected Boolean wantCardInfo;
    @XmlElement(name = "WantPacsUpdateNotification", defaultValue = "false")
    protected Boolean wantPacsUpdateNotification;
    @XmlElement(name = "SuppressPacsUpdate", defaultValue = "false")
    protected Boolean suppressPacsUpdate;

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
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the personIds property.
     * 
     * @return
     *     possible object is
     *     {@link PacsPersonIdentifiersType }
     *     
     */
    public PacsPersonIdentifiersType getPersonIds() {
        return personIds;
    }

    /**
     * Sets the value of the personIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacsPersonIdentifiersType }
     *     
     */
    public void setPersonIds(PacsPersonIdentifiersType value) {
        this.personIds = value;
    }

    /**
     * Gets the value of the updatePersonIds property.
     * 
     * @return
     *     possible object is
     *     {@link PacsPersonIdentifiersType }
     *     
     */
    public PacsPersonIdentifiersType getUpdatePersonIds() {
        return updatePersonIds;
    }

    /**
     * Sets the value of the updatePersonIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacsPersonIdentifiersType }
     *     
     */
    public void setUpdatePersonIds(PacsPersonIdentifiersType value) {
        this.updatePersonIds = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PacsPersonInfoDataType }
     *     
     */
    public PacsPersonInfoDataType getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacsPersonInfoDataType }
     *     
     */
    public void setPersonInfo(PacsPersonInfoDataType value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the addCard property.
     * 
     * @return
     *     possible object is
     *     {@link PacsCardInformationType }
     *     
     */
    public PacsCardInformationType getAddCard() {
        return addCard;
    }

    /**
     * Sets the value of the addCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacsCardInformationType }
     *     
     */
    public void setAddCard(PacsCardInformationType value) {
        this.addCard = value;
    }

    /**
     * Gets the value of the updateCard property.
     * 
     * @return
     *     possible object is
     *     {@link PacsCardInformationType }
     *     
     */
    public PacsCardInformationType getUpdateCard() {
        return updateCard;
    }

    /**
     * Sets the value of the updateCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacsCardInformationType }
     *     
     */
    public void setUpdateCard(PacsCardInformationType value) {
        this.updateCard = value;
    }

    /**
     * Gets the value of the suspendCard property.
     * 
     * @return
     *     possible object is
     *     {@link PacsCardIdentifiersType }
     *     
     */
    public PacsCardIdentifiersType getSuspendCard() {
        return suspendCard;
    }

    /**
     * Sets the value of the suspendCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacsCardIdentifiersType }
     *     
     */
    public void setSuspendCard(PacsCardIdentifiersType value) {
        this.suspendCard = value;
    }

    /**
     * Gets the value of the reactivateCard property.
     * 
     * @return
     *     possible object is
     *     {@link PacsCardIdentifiersType }
     *     
     */
    public PacsCardIdentifiersType getReactivateCard() {
        return reactivateCard;
    }

    /**
     * Sets the value of the reactivateCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacsCardIdentifiersType }
     *     
     */
    public void setReactivateCard(PacsCardIdentifiersType value) {
        this.reactivateCard = value;
    }

    /**
     * Gets the value of the revokeCard property.
     * 
     * @return
     *     possible object is
     *     {@link PacsCardIdentifiersType }
     *     
     */
    public PacsCardIdentifiersType getRevokeCard() {
        return revokeCard;
    }

    /**
     * Sets the value of the revokeCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PacsCardIdentifiersType }
     *     
     */
    public void setRevokeCard(PacsCardIdentifiersType value) {
        this.revokeCard = value;
    }

    /**
     * Gets the value of the suspendAllCards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspendAllCards() {
        return suspendAllCards;
    }

    /**
     * Sets the value of the suspendAllCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspendAllCards(String value) {
        this.suspendAllCards = value;
    }

    /**
     * Gets the value of the reactivateAllCards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReactivateAllCards() {
        return reactivateAllCards;
    }

    /**
     * Sets the value of the reactivateAllCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReactivateAllCards(String value) {
        this.reactivateAllCards = value;
    }

    /**
     * Gets the value of the terminateAllCards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminateAllCards() {
        return terminateAllCards;
    }

    /**
     * Sets the value of the terminateAllCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminateAllCards(String value) {
        this.terminateAllCards = value;
    }

    /**
     * Gets the value of the wantPersonInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantPersonInfo() {
        return wantPersonInfo;
    }

    /**
     * Sets the value of the wantPersonInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantPersonInfo(Boolean value) {
        this.wantPersonInfo = value;
    }

    /**
     * Gets the value of the wantCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantCardInfo() {
        return wantCardInfo;
    }

    /**
     * Sets the value of the wantCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantCardInfo(Boolean value) {
        this.wantCardInfo = value;
    }

    /**
     * Gets the value of the wantPacsUpdateNotification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantPacsUpdateNotification() {
        return wantPacsUpdateNotification;
    }

    /**
     * Sets the value of the wantPacsUpdateNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantPacsUpdateNotification(Boolean value) {
        this.wantPacsUpdateNotification = value;
    }

    /**
     * Gets the value of the suppressPacsUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressPacsUpdate() {
        return suppressPacsUpdate;
    }

    /**
     * Sets the value of the suppressPacsUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressPacsUpdate(Boolean value) {
        this.suppressPacsUpdate = value;
    }

}
