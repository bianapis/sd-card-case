package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardCaseResolutionBaseWithIdAndRoot
 */
public class CardCaseResolutionBaseWithIdAndRoot   {
  private String cardCaseResolutionTaskReference = null;

  private String cardCaseReference = null;

  private String cardCaseType = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private Object cardCaseRootCauseRecord = null;

  private Object cardCaseResolutionRecord = null;

  private String correspondenceReference = null;

  private String documentReference = null;

  private String employeeBusinessUnitReference = null;

  private String paymentOrderReference = null;

  private Object cardCaseRecord = null;

  private String cardCaseResolutionSchedule = null;

  private String cardCaseStatus = null;

  private Object cardCaseResolutionTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the card case resolution task 
   * @return cardCaseResolutionTaskReference
  **/

  public String getCardCaseResolutionTaskReference() {
    return cardCaseResolutionTaskReference;
  }

  public void setCardCaseResolutionTaskReference(String cardCaseResolutionTaskReference) {
    this.cardCaseResolutionTaskReference = cardCaseResolutionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Card Case Reference 
   * @return cardCaseReference
  **/

  public String getCardCaseReference() {
    return cardCaseReference;
  }

  public void setCardCaseReference(String cardCaseReference) {
    this.cardCaseReference = cardCaseReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. disputed charges, merchant fraud 
   * @return cardCaseType
  **/

  public String getCardCaseType() {
    return cardCaseType;
  }

  public void setCardCaseType(String cardCaseType) {
    this.cardCaseType = cardCaseType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: product/service associated with case 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: customer associated with case 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Card Case Root 
   * @return cardCaseRootCauseRecord
  **/

  public Object getCardCaseRootCauseRecord() {
    return cardCaseRootCauseRecord;
  }

  public void setCardCaseRootCauseRecord(Object cardCaseRootCauseRecord) {
    this.cardCaseRootCauseRecord = cardCaseRootCauseRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: details resolution actions and execution responsibilities 
   * @return cardCaseResolutionRecord
  **/

  public Object getCardCaseResolutionRecord() {
    return cardCaseResolutionRecord;
  }

  public void setCardCaseResolutionRecord(Object cardCaseResolutionRecord) {
    this.cardCaseResolutionRecord = cardCaseResolutionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: confirmation messages sent to involved parties 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: case related documents catalogued 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: unit responsible for the card case resolution actions 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: if financial adjustments are required to resolve the customer case 
   * @return paymentOrderReference
  **/

  public String getPaymentOrderReference() {
    return paymentOrderReference;
  }

  public void setPaymentOrderReference(String paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: consolidated details of the case, includes root 
   * @return cardCaseRecord
  **/

  public Object getCardCaseRecord() {
    return cardCaseRecord;
  }

  public void setCardCaseRecord(Object cardCaseRecord) {
    this.cardCaseRecord = cardCaseRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: target dates for processing/resolution 
   * @return cardCaseResolutionSchedule
  **/

  public String getCardCaseResolutionSchedule() {
    return cardCaseResolutionSchedule;
  }

  public void setCardCaseResolutionSchedule(String cardCaseResolutionSchedule) {
    this.cardCaseResolutionSchedule = cardCaseResolutionSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Card Case Status 
   * @return cardCaseStatus
  **/

  public String getCardCaseStatus() {
    return cardCaseStatus;
  }

  public void setCardCaseStatus(String cardCaseStatus) {
    this.cardCaseStatus = cardCaseStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: processing record of the card case resolution task                             
   * @return cardCaseResolutionTaskRecord
  **/

  public Object getCardCaseResolutionTaskRecord() {
    return cardCaseResolutionTaskRecord;
  }

  public void setCardCaseResolutionTaskRecord(Object cardCaseResolutionTaskRecord) {
    this.cardCaseResolutionTaskRecord = cardCaseResolutionTaskRecord;
  }


}

