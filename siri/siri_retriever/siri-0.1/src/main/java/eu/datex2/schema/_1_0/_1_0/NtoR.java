//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.14 at 03:28:36 PM PST 
//


package eu.datex2.schema._1_0._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Enumerations alphabetically ordered between N and R.
 * 
 * <p>Java class for NtoR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NtoR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="precipitationTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}PrecipitationTypeEnum"/>
 *         &lt;element name="poorRoadInfrastructureEnum" type="{http://datex2.eu/schema/1_0/1_0}PoorRoadInfrastructureEnum"/>
 *         &lt;element name="roadMaintenanceTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}RoadMaintenanceTypeEnum"/>
 *         &lt;element name="ntoRExtension" type="{http://datex2.eu/schema/1_0/1_0}ExtensionType" minOccurs="0"/>
 *         &lt;element name="roadsideAssistanceTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}RoadsideAssistanceTypeEnum"/>
 *         &lt;element name="publicEventTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}PublicEventTypeEnum"/>
 *         &lt;element name="roadworksScaleEnum" type="{http://datex2.eu/schema/1_0/1_0}RoadworksScaleEnum"/>
 *         &lt;element name="operatorActionStatusEnum" type="{http://datex2.eu/schema/1_0/1_0}OperatorActionStatusEnum"/>
 *         &lt;element name="overallImpactEnum" type="{http://datex2.eu/schema/1_0/1_0}OverallImpactEnum"/>
 *         &lt;element name="probabilityOfOccurrenceEnum" type="{http://datex2.eu/schema/1_0/1_0}ProbabilityOfOccurrenceEnum"/>
 *         &lt;element name="networkManagementTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}NetworkManagementTypeEnum"/>
 *         &lt;element name="periodByPhaseOfDayEnum" type="{http://datex2.eu/schema/1_0/1_0}PeriodByPhaseOfDayEnum"/>
 *         &lt;element name="placesAdviceEnum" type="{http://datex2.eu/schema/1_0/1_0}PlacesAdviceEnum"/>
 *         &lt;element name="roadworksDurationEnum" type="{http://datex2.eu/schema/1_0/1_0}RoadworksDurationEnum"/>
 *         &lt;element name="relativeTrafficFlowEnum" type="{http://datex2.eu/schema/1_0/1_0}RelativeTrafficFlowEnum"/>
 *         &lt;element name="obstructionTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}ObstructionTypeEnum"/>
 *         &lt;element name="reroutingTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}ReroutingTypeEnum"/>
 *         &lt;element name="poorEnvironmentTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}PoorEnvironmentTypeEnum"/>
 *         &lt;element name="personCategoryEnum" type="{http://datex2.eu/schema/1_0/1_0}PersonCategoryEnum"/>
 *         &lt;element name="pollutantTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}PollutantTypeEnum"/>
 *         &lt;element name="operatorActionOriginEnum" type="{http://datex2.eu/schema/1_0/1_0}OperatorActionOriginEnum"/>
 *         &lt;element name="nonWeatherRelatedRoadConditionTypeEnum" type="{http://datex2.eu/schema/1_0/1_0}NonWeatherRelatedRoadConditionTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NtoR", propOrder = {
    "precipitationTypeEnum",
    "poorRoadInfrastructureEnum",
    "roadMaintenanceTypeEnum",
    "ntoRExtension",
    "roadsideAssistanceTypeEnum",
    "publicEventTypeEnum",
    "roadworksScaleEnum",
    "operatorActionStatusEnum",
    "overallImpactEnum",
    "probabilityOfOccurrenceEnum",
    "networkManagementTypeEnum",
    "periodByPhaseOfDayEnum",
    "placesAdviceEnum",
    "roadworksDurationEnum",
    "relativeTrafficFlowEnum",
    "obstructionTypeEnum",
    "reroutingTypeEnum",
    "poorEnvironmentTypeEnum",
    "personCategoryEnum",
    "pollutantTypeEnum",
    "operatorActionOriginEnum",
    "nonWeatherRelatedRoadConditionTypeEnum"
})
public abstract class NtoR {

    @XmlElement(required = true)
    protected PrecipitationTypeEnum precipitationTypeEnum;
    @XmlElement(required = true)
    protected PoorRoadInfrastructureEnum poorRoadInfrastructureEnum;
    @XmlElement(required = true)
    protected RoadMaintenanceTypeEnum roadMaintenanceTypeEnum;
    protected ExtensionType ntoRExtension;
    @XmlElement(required = true)
    protected RoadsideAssistanceTypeEnum roadsideAssistanceTypeEnum;
    @XmlElement(required = true)
    protected PublicEventTypeEnum publicEventTypeEnum;
    @XmlElement(required = true)
    protected RoadworksScaleEnum roadworksScaleEnum;
    @XmlElement(required = true)
    protected OperatorActionStatusEnum operatorActionStatusEnum;
    @XmlElement(required = true)
    protected OverallImpactEnum overallImpactEnum;
    @XmlElement(required = true)
    protected ProbabilityOfOccurrenceEnum probabilityOfOccurrenceEnum;
    @XmlElement(required = true)
    protected NetworkManagementTypeEnum networkManagementTypeEnum;
    @XmlElement(required = true)
    protected PeriodByPhaseOfDayEnum periodByPhaseOfDayEnum;
    @XmlElement(required = true)
    protected PlacesAdviceEnum placesAdviceEnum;
    @XmlElement(required = true)
    protected RoadworksDurationEnum roadworksDurationEnum;
    @XmlElement(required = true)
    protected RelativeTrafficFlowEnum relativeTrafficFlowEnum;
    @XmlElement(required = true)
    protected ObstructionTypeEnum obstructionTypeEnum;
    @XmlElement(required = true)
    protected ReroutingTypeEnum reroutingTypeEnum;
    @XmlElement(required = true)
    protected PoorEnvironmentTypeEnum poorEnvironmentTypeEnum;
    @XmlElement(required = true)
    protected PersonCategoryEnum personCategoryEnum;
    @XmlElement(required = true)
    protected PollutantTypeEnum pollutantTypeEnum;
    @XmlElement(required = true)
    protected OperatorActionOriginEnum operatorActionOriginEnum;
    @XmlElement(required = true)
    protected NonWeatherRelatedRoadConditionTypeEnum nonWeatherRelatedRoadConditionTypeEnum;

    /**
     * Gets the value of the precipitationTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationTypeEnum }
     *     
     */
    public PrecipitationTypeEnum getPrecipitationTypeEnum() {
        return precipitationTypeEnum;
    }

    /**
     * Sets the value of the precipitationTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationTypeEnum }
     *     
     */
    public void setPrecipitationTypeEnum(PrecipitationTypeEnum value) {
        this.precipitationTypeEnum = value;
    }

    /**
     * Gets the value of the poorRoadInfrastructureEnum property.
     * 
     * @return
     *     possible object is
     *     {@link PoorRoadInfrastructureEnum }
     *     
     */
    public PoorRoadInfrastructureEnum getPoorRoadInfrastructureEnum() {
        return poorRoadInfrastructureEnum;
    }

    /**
     * Sets the value of the poorRoadInfrastructureEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoorRoadInfrastructureEnum }
     *     
     */
    public void setPoorRoadInfrastructureEnum(PoorRoadInfrastructureEnum value) {
        this.poorRoadInfrastructureEnum = value;
    }

    /**
     * Gets the value of the roadMaintenanceTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link RoadMaintenanceTypeEnum }
     *     
     */
    public RoadMaintenanceTypeEnum getRoadMaintenanceTypeEnum() {
        return roadMaintenanceTypeEnum;
    }

    /**
     * Sets the value of the roadMaintenanceTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadMaintenanceTypeEnum }
     *     
     */
    public void setRoadMaintenanceTypeEnum(RoadMaintenanceTypeEnum value) {
        this.roadMaintenanceTypeEnum = value;
    }

    /**
     * Gets the value of the ntoRExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNtoRExtension() {
        return ntoRExtension;
    }

    /**
     * Sets the value of the ntoRExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNtoRExtension(ExtensionType value) {
        this.ntoRExtension = value;
    }

    /**
     * Gets the value of the roadsideAssistanceTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideAssistanceTypeEnum }
     *     
     */
    public RoadsideAssistanceTypeEnum getRoadsideAssistanceTypeEnum() {
        return roadsideAssistanceTypeEnum;
    }

    /**
     * Sets the value of the roadsideAssistanceTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideAssistanceTypeEnum }
     *     
     */
    public void setRoadsideAssistanceTypeEnum(RoadsideAssistanceTypeEnum value) {
        this.roadsideAssistanceTypeEnum = value;
    }

    /**
     * Gets the value of the publicEventTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public PublicEventTypeEnum getPublicEventTypeEnum() {
        return publicEventTypeEnum;
    }

    /**
     * Sets the value of the publicEventTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public void setPublicEventTypeEnum(PublicEventTypeEnum value) {
        this.publicEventTypeEnum = value;
    }

    /**
     * Gets the value of the roadworksScaleEnum property.
     * 
     * @return
     *     possible object is
     *     {@link RoadworksScaleEnum }
     *     
     */
    public RoadworksScaleEnum getRoadworksScaleEnum() {
        return roadworksScaleEnum;
    }

    /**
     * Sets the value of the roadworksScaleEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadworksScaleEnum }
     *     
     */
    public void setRoadworksScaleEnum(RoadworksScaleEnum value) {
        this.roadworksScaleEnum = value;
    }

    /**
     * Gets the value of the operatorActionStatusEnum property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorActionStatusEnum }
     *     
     */
    public OperatorActionStatusEnum getOperatorActionStatusEnum() {
        return operatorActionStatusEnum;
    }

    /**
     * Sets the value of the operatorActionStatusEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorActionStatusEnum }
     *     
     */
    public void setOperatorActionStatusEnum(OperatorActionStatusEnum value) {
        this.operatorActionStatusEnum = value;
    }

    /**
     * Gets the value of the overallImpactEnum property.
     * 
     * @return
     *     possible object is
     *     {@link OverallImpactEnum }
     *     
     */
    public OverallImpactEnum getOverallImpactEnum() {
        return overallImpactEnum;
    }

    /**
     * Sets the value of the overallImpactEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverallImpactEnum }
     *     
     */
    public void setOverallImpactEnum(OverallImpactEnum value) {
        this.overallImpactEnum = value;
    }

    /**
     * Gets the value of the probabilityOfOccurrenceEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public ProbabilityOfOccurrenceEnum getProbabilityOfOccurrenceEnum() {
        return probabilityOfOccurrenceEnum;
    }

    /**
     * Sets the value of the probabilityOfOccurrenceEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProbabilityOfOccurrenceEnum }
     *     
     */
    public void setProbabilityOfOccurrenceEnum(ProbabilityOfOccurrenceEnum value) {
        this.probabilityOfOccurrenceEnum = value;
    }

    /**
     * Gets the value of the networkManagementTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkManagementTypeEnum }
     *     
     */
    public NetworkManagementTypeEnum getNetworkManagementTypeEnum() {
        return networkManagementTypeEnum;
    }

    /**
     * Sets the value of the networkManagementTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkManagementTypeEnum }
     *     
     */
    public void setNetworkManagementTypeEnum(NetworkManagementTypeEnum value) {
        this.networkManagementTypeEnum = value;
    }

    /**
     * Gets the value of the periodByPhaseOfDayEnum property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodByPhaseOfDayEnum }
     *     
     */
    public PeriodByPhaseOfDayEnum getPeriodByPhaseOfDayEnum() {
        return periodByPhaseOfDayEnum;
    }

    /**
     * Sets the value of the periodByPhaseOfDayEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodByPhaseOfDayEnum }
     *     
     */
    public void setPeriodByPhaseOfDayEnum(PeriodByPhaseOfDayEnum value) {
        this.periodByPhaseOfDayEnum = value;
    }

    /**
     * Gets the value of the placesAdviceEnum property.
     * 
     * @return
     *     possible object is
     *     {@link PlacesAdviceEnum }
     *     
     */
    public PlacesAdviceEnum getPlacesAdviceEnum() {
        return placesAdviceEnum;
    }

    /**
     * Sets the value of the placesAdviceEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacesAdviceEnum }
     *     
     */
    public void setPlacesAdviceEnum(PlacesAdviceEnum value) {
        this.placesAdviceEnum = value;
    }

    /**
     * Gets the value of the roadworksDurationEnum property.
     * 
     * @return
     *     possible object is
     *     {@link RoadworksDurationEnum }
     *     
     */
    public RoadworksDurationEnum getRoadworksDurationEnum() {
        return roadworksDurationEnum;
    }

    /**
     * Sets the value of the roadworksDurationEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadworksDurationEnum }
     *     
     */
    public void setRoadworksDurationEnum(RoadworksDurationEnum value) {
        this.roadworksDurationEnum = value;
    }

    /**
     * Gets the value of the relativeTrafficFlowEnum property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeTrafficFlowEnum }
     *     
     */
    public RelativeTrafficFlowEnum getRelativeTrafficFlowEnum() {
        return relativeTrafficFlowEnum;
    }

    /**
     * Sets the value of the relativeTrafficFlowEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeTrafficFlowEnum }
     *     
     */
    public void setRelativeTrafficFlowEnum(RelativeTrafficFlowEnum value) {
        this.relativeTrafficFlowEnum = value;
    }

    /**
     * Gets the value of the obstructionTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ObstructionTypeEnum }
     *     
     */
    public ObstructionTypeEnum getObstructionTypeEnum() {
        return obstructionTypeEnum;
    }

    /**
     * Sets the value of the obstructionTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObstructionTypeEnum }
     *     
     */
    public void setObstructionTypeEnum(ObstructionTypeEnum value) {
        this.obstructionTypeEnum = value;
    }

    /**
     * Gets the value of the reroutingTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link ReroutingTypeEnum }
     *     
     */
    public ReroutingTypeEnum getReroutingTypeEnum() {
        return reroutingTypeEnum;
    }

    /**
     * Sets the value of the reroutingTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReroutingTypeEnum }
     *     
     */
    public void setReroutingTypeEnum(ReroutingTypeEnum value) {
        this.reroutingTypeEnum = value;
    }

    /**
     * Gets the value of the poorEnvironmentTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link PoorEnvironmentTypeEnum }
     *     
     */
    public PoorEnvironmentTypeEnum getPoorEnvironmentTypeEnum() {
        return poorEnvironmentTypeEnum;
    }

    /**
     * Sets the value of the poorEnvironmentTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoorEnvironmentTypeEnum }
     *     
     */
    public void setPoorEnvironmentTypeEnum(PoorEnvironmentTypeEnum value) {
        this.poorEnvironmentTypeEnum = value;
    }

    /**
     * Gets the value of the personCategoryEnum property.
     * 
     * @return
     *     possible object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public PersonCategoryEnum getPersonCategoryEnum() {
        return personCategoryEnum;
    }

    /**
     * Sets the value of the personCategoryEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public void setPersonCategoryEnum(PersonCategoryEnum value) {
        this.personCategoryEnum = value;
    }

    /**
     * Gets the value of the pollutantTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public PollutantTypeEnum getPollutantTypeEnum() {
        return pollutantTypeEnum;
    }

    /**
     * Sets the value of the pollutantTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public void setPollutantTypeEnum(PollutantTypeEnum value) {
        this.pollutantTypeEnum = value;
    }

    /**
     * Gets the value of the operatorActionOriginEnum property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorActionOriginEnum }
     *     
     */
    public OperatorActionOriginEnum getOperatorActionOriginEnum() {
        return operatorActionOriginEnum;
    }

    /**
     * Sets the value of the operatorActionOriginEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorActionOriginEnum }
     *     
     */
    public void setOperatorActionOriginEnum(OperatorActionOriginEnum value) {
        this.operatorActionOriginEnum = value;
    }

    /**
     * Gets the value of the nonWeatherRelatedRoadConditionTypeEnum property.
     * 
     * @return
     *     possible object is
     *     {@link NonWeatherRelatedRoadConditionTypeEnum }
     *     
     */
    public NonWeatherRelatedRoadConditionTypeEnum getNonWeatherRelatedRoadConditionTypeEnum() {
        return nonWeatherRelatedRoadConditionTypeEnum;
    }

    /**
     * Sets the value of the nonWeatherRelatedRoadConditionTypeEnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonWeatherRelatedRoadConditionTypeEnum }
     *     
     */
    public void setNonWeatherRelatedRoadConditionTypeEnum(NonWeatherRelatedRoadConditionTypeEnum value) {
        this.nonWeatherRelatedRoadConditionTypeEnum = value;
    }

}
