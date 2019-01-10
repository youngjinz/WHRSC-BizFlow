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
 * <p>Java class for NameSalutationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameSalutationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="5"/&gt;
 *     &lt;enumeration value="Mr"/&gt;
 *     &lt;enumeration value="Mrs"/&gt;
 *     &lt;enumeration value="Ms"/&gt;
 *     &lt;enumeration value="Dr"/&gt;
 *     &lt;enumeration value="Prof"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NameSalutationType", namespace = "http://hspd12.hhs.gov/scms/idProofing/v1")
@XmlEnum
public enum NameSalutationType {

    @XmlEnumValue("Mr")
    MR("Mr"),
    @XmlEnumValue("Mrs")
    MRS("Mrs"),
    @XmlEnumValue("Ms")
    MS("Ms"),
    @XmlEnumValue("Dr")
    DR("Dr"),
    @XmlEnumValue("Prof")
    PROF("Prof");
    private final String value;

    NameSalutationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameSalutationType fromValue(String v) {
        for (NameSalutationType c: NameSalutationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
