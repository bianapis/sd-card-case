package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardCaseBaseWithIdAndRoot
 */
public class CardCaseBaseWithIdAndRoot   {
  private String cardCaseReference = null;

  private String cardCaseType = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String customerContactRecordReference = null;

  private String cardTransactionReference = null;

  private Object cardTransactionRecord = null;

  private String caseLocation = null;

  private String dateTime = null;

  private String employeeBusinessUnitReference = null;

  private Object cardCaseRecord = null;

  private String cardCaseResolutionSchedule = null;

  private String cardCaseStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: product/service associated with card case 
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to contact record assembled during contact  
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: one or more product card transactions associated with the case 
   * @return cardTransactionReference
  **/

  public String getCardTransactionReference() {
    return cardTransactionReference;
  }

  public void setCardTransactionReference(String cardTransactionReference) {
    this.cardTransactionReference = cardTransactionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: all details of the transaction  
   * @return cardTransactionRecord
  **/

  public Object getCardTransactionRecord() {
    return cardTransactionRecord;
  }

  public void setCardTransactionRecord(Object cardTransactionRecord) {
    this.cardTransactionRecord = cardTransactionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: physical address or electronic venue the customer case was detected 
   * @return caseLocation
  **/

  public String getCaseLocation() {
    return caseLocation;
  }

  public void setCaseLocation(String caseLocation) {
    this.caseLocation = caseLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: when the customer case was initiated 
   * @return dateTime
  **/

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: unit where the customer case was raised 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: consolidated details of the case 
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


}

