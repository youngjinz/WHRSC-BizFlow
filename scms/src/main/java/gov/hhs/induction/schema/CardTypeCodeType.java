//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 11:07:08 PM EST 
//


package gov.hhs.induction.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardTypeCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PIV"/&gt;
 *     &lt;enumeration value="NON_PIV"/&gt;
 *     &lt;enumeration value="EXT_PIV"/&gt;
 *     &lt;enumeration value="EXT_PIV_I"/&gt;
 *     &lt;enumeration value="RLA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardTypeCodeType")
@XmlEnum
public enum CardTypeCodeType {


    /**
     * 
     * 						PIV card type
     * 		        	
     * 
     */
    PIV,

    /**
     * 
     * 						NON-PIV card type
     * 		        	
     * 
     */
    NON_PIV,

    /**
     * 
     * 						External PIV card issued by another federal government agency
     * 		        	
     * 
     */
    EXT_PIV,

    /**
     * 
     * 						External PIV Interopable card issued by a non federal government issuer
     * 		        	
     * 
     */
    EXT_PIV_I,

    /**
     * 
     * 						Restricted Local Access card type
     * 		        	
     * 
     */
    RLA;

    public String value() {
        return name();
    }

    public static CardTypeCodeType fromValue(String v) {
        return valueOf(v);
    }

}
