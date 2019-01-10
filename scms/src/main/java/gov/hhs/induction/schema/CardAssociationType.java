//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 11:07:08 PM EST 
//


package gov.hhs.induction.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAssociationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardAssociationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FTE"/&gt;
 *     &lt;enumeration value="PHS"/&gt;
 *     &lt;enumeration value="CONTRACTOR"/&gt;
 *     &lt;enumeration value="AFFILIATE"/&gt;
 *     &lt;enumeration value="SCEP STUDENT"/&gt;
 *     &lt;enumeration value="VOLUNTEER"/&gt;
 *     &lt;enumeration value="MRC"/&gt;
 *     &lt;enumeration value="NDMS"/&gt;
 *     &lt;enumeration value="STUDENT"/&gt;
 *     &lt;enumeration value="STEP STUDENT"/&gt;
 *     &lt;enumeration value="SSEP STUDENT"/&gt;
 *     &lt;enumeration value="VISITOR"/&gt;
 *     &lt;enumeration value="TENANT"/&gt;
 *     &lt;enumeration value="SERVICE PROVIDER"/&gt;
 *     &lt;enumeration value="TEMPORARY"/&gt;
 *     &lt;enumeration value="OSEP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardAssociationType")
@XmlEnum
public enum CardAssociationType {


    /**
     * 
     * 						Full Time Employee
     * 		        	
     * 
     */
    FTE("FTE"),

    /**
     * 
     * 						Public Health Services
     * 		        	
     * 
     */
    PHS("PHS"),

    /**
     * 
     * 						Contractor
     * 		        	
     * 
     */
    CONTRACTOR("CONTRACTOR"),

    /**
     * 
     * 						Affiliate
     * 		        	
     * 
     */
    AFFILIATE("AFFILIATE"),

    /**
     * 
     * 						Student Career Experience Program
     * 		        	
     * 
     */
    @XmlEnumValue("SCEP STUDENT")
    SCEP_STUDENT("SCEP STUDENT"),

    /**
     * 
     * 						Volunteer
     * 		        	
     * 
     */
    VOLUNTEER("VOLUNTEER"),

    /**
     * 
     * 						Medical Reserve Corps
     * 		        	
     * 
     */
    MRC("MRC"),

    /**
     * 
     * 						National Disaster Medical Service
     * 		        	
     * 
     */
    NDMS("NDMS"),

    /**
     * 
     * 						Student
     * 		        	
     * 
     */
    STUDENT("STUDENT"),

    /**
     * 
     * 						Student Temporary Employment Program
     * 		        	
     * 
     */
    @XmlEnumValue("STEP STUDENT")
    STEP_STUDENT("STEP STUDENT"),

    /**
     * 
     * 						Summer Student Employment Program
     * 		        	
     * 
     */
    @XmlEnumValue("SSEP STUDENT")
    SSEP_STUDENT("SSEP STUDENT"),

    /**
     * 
     * 						Visitor
     * 		        	
     * 
     */
    VISITOR("VISITOR"),

    /**
     * 
     * 						Tenant
     * 		        	
     * 
     */
    TENANT("TENANT"),

    /**
     * 
     * 						Service Provider
     * 		        	
     * 
     */
    @XmlEnumValue("SERVICE PROVIDER")
    SERVICE_PROVIDER("SERVICE PROVIDER"),

    /**
     * 
     * 						Temporary
     * 		        	
     * 
     */
    TEMPORARY("TEMPORARY"),

    /**
     * 
     * 						Office of Security and Emergency Preparedness
     * 		        	
     * 
     */
    OSEP("OSEP");
    private final String value;

    CardAssociationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardAssociationType fromValue(String v) {
        for (CardAssociationType c: CardAssociationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
