package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardCaseChargebackBaseWithIdAndRoot
 */
public class CardCaseChargebackBaseWithIdAndRoot   {
  private String cardCaseChargebackTaskReference = null;

  private String cardCaseReference = null;

  private String chargebackInstruction = null;

  private String cardTransactionRecordReference = null;

  private String cardTransactionProductInstanceReference = null;

  private String cardTransactionNetworkReference = null;

  private String cardTransactionIssuingBankReference = null;

  private String cardTransactionMerchantAcquiringBankReference = null;

  private String cardTransactionType = null;

  private String cardTransactionCurrency = null;

  private String cardTransactionAmountType = null;

  private String cardTransactionAmount = null;

  private String cardTransactionMerchantReference = null;

  private String cardTransactionLocationReference = null;

  private String cardTransactionProductServiceReference = null;

  private String cardTransactionDateTime = null;

  private String cardTransactionFXConversionCharge = null;

  private String cardTransactionInterchargeFee = null;

  private Object cardTransactionAuthorizationRecord = null;

  private Object cardCaseRecord = null;

  private String cardCaseResolutionSchedule = null;

  private String cardCaseStatus = null;

  private Object cardCaseChargebackTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to chargeback processing applied to the card case 
   * @return cardCaseChargebackTaskReference
  **/

  public String getCardCaseChargebackTaskReference() {
    return cardCaseChargebackTaskReference;
  }

  public void setCardCaseChargebackTaskReference(String cardCaseChargebackTaskReference) {
    this.cardCaseChargebackTaskReference = cardCaseChargebackTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: instruction to book chargeback for the transaction  
   * @return chargebackInstruction
  **/

  public String getChargebackInstruction() {
    return chargebackInstruction;
  }

  public void setChargebackInstruction(String chargebackInstruction) {
    this.chargebackInstruction = chargebackInstruction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: refers to the card transaction for the chargeback 
   * @return cardTransactionRecordReference
  **/

  public String getCardTransactionRecordReference() {
    return cardTransactionRecordReference;
  }

  public void setCardTransactionRecordReference(String cardTransactionRecordReference) {
    this.cardTransactionRecordReference = cardTransactionRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: account number associated with the card transaction  
   * @return cardTransactionProductInstanceReference
  **/

  public String getCardTransactionProductInstanceReference() {
    return cardTransactionProductInstanceReference;
  }

  public void setCardTransactionProductInstanceReference(String cardTransactionProductInstanceReference) {
    this.cardTransactionProductInstanceReference = cardTransactionProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: network the card transaction is handled by 
   * @return cardTransactionNetworkReference
  **/

  public String getCardTransactionNetworkReference() {
    return cardTransactionNetworkReference;
  }

  public void setCardTransactionNetworkReference(String cardTransactionNetworkReference) {
    this.cardTransactionNetworkReference = cardTransactionNetworkReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Card Transaction Issuing Bank Reference 
   * @return cardTransactionIssuingBankReference
  **/

  public String getCardTransactionIssuingBankReference() {
    return cardTransactionIssuingBankReference;
  }

  public void setCardTransactionIssuingBankReference(String cardTransactionIssuingBankReference) {
    this.cardTransactionIssuingBankReference = cardTransactionIssuingBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Card Transaction Merchant Acquiring Bank Reference 
   * @return cardTransactionMerchantAcquiringBankReference
  **/

  public String getCardTransactionMerchantAcquiringBankReference() {
    return cardTransactionMerchantAcquiringBankReference;
  }

  public void setCardTransactionMerchantAcquiringBankReference(String cardTransactionMerchantAcquiringBankReference) {
    this.cardTransactionMerchantAcquiringBankReference = cardTransactionMerchantAcquiringBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Card Transaction Type 
   * @return cardTransactionType
  **/

  public String getCardTransactionType() {
    return cardTransactionType;
  }

  public void setCardTransactionType(String cardTransactionType) {
    this.cardTransactionType = cardTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: Card Transaction Currency 
   * @return cardTransactionCurrency
  **/

  public String getCardTransactionCurrency() {
    return cardTransactionCurrency;
  }

  public void setCardTransactionCurrency(String cardTransactionCurrency) {
    this.cardTransactionCurrency = cardTransactionCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: original amount, billing currency amount, conversion rate, FX mark 
   * @return cardTransactionAmountType
  **/

  public String getCardTransactionAmountType() {
    return cardTransactionAmountType;
  }

  public void setCardTransactionAmountType(String cardTransactionAmountType) {
    this.cardTransactionAmountType = cardTransactionAmountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Card Transaction Amount 
   * @return cardTransactionAmount
  **/

  public String getCardTransactionAmount() {
    return cardTransactionAmount;
  }

  public void setCardTransactionAmount(String cardTransactionAmount) {
    this.cardTransactionAmount = cardTransactionAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Card Transaction Merchant Reference 
   * @return cardTransactionMerchantReference
  **/

  public String getCardTransactionMerchantReference() {
    return cardTransactionMerchantReference;
  }

  public void setCardTransactionMerchantReference(String cardTransactionMerchantReference) {
    this.cardTransactionMerchantReference = cardTransactionMerchantReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: point of sale location 
   * @return cardTransactionLocationReference
  **/

  public String getCardTransactionLocationReference() {
    return cardTransactionLocationReference;
  }

  public void setCardTransactionLocationReference(String cardTransactionLocationReference) {
    this.cardTransactionLocationReference = cardTransactionLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: e.g. purchased service/product 
   * @return cardTransactionProductServiceReference
  **/

  public String getCardTransactionProductServiceReference() {
    return cardTransactionProductServiceReference;
  }

  public void setCardTransactionProductServiceReference(String cardTransactionProductServiceReference) {
    this.cardTransactionProductServiceReference = cardTransactionProductServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: Card Transaction Date/Time 
   * @return cardTransactionDateTime
  **/

  public String getCardTransactionDateTime() {
    return cardTransactionDateTime;
  }

  public void setCardTransactionDateTime(String cardTransactionDateTime) {
    this.cardTransactionDateTime = cardTransactionDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: applied currency conversion charge 
   * @return cardTransactionFXConversionCharge
  **/

  public String getCardTransactionFXConversionCharge() {
    return cardTransactionFXConversionCharge;
  }

  public void setCardTransactionFXConversionCharge(String cardTransactionFXConversionCharge) {
    this.cardTransactionFXConversionCharge = cardTransactionFXConversionCharge;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: applied intercharge fee 
   * @return cardTransactionInterchargeFee
  **/

  public String getCardTransactionInterchargeFee() {
    return cardTransactionInterchargeFee;
  }

  public void setCardTransactionInterchargeFee(String cardTransactionInterchargeFee) {
    this.cardTransactionInterchargeFee = cardTransactionInterchargeFee;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: details the reference, amount, timestamp of the transaction authorization 
   * @return cardTransactionAuthorizationRecord
  **/

  public Object getCardTransactionAuthorizationRecord() {
    return cardTransactionAuthorizationRecord;
  }

  public void setCardTransactionAuthorizationRecord(Object cardTransactionAuthorizationRecord) {
    this.cardTransactionAuthorizationRecord = cardTransactionAuthorizationRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: updated to indicate chargeback processed 
   * @return cardCaseStatus
  **/

  public String getCardCaseStatus() {
    return cardCaseStatus;
  }

  public void setCardCaseStatus(String cardCaseStatus) {
    this.cardCaseStatus = cardCaseStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: processing record of the chargeback processing applied to the card case 
   * @return cardCaseChargebackTaskRecord
  **/

  public Object getCardCaseChargebackTaskRecord() {
    return cardCaseChargebackTaskRecord;
  }

  public void setCardCaseChargebackTaskRecord(Object cardCaseChargebackTaskRecord) {
    this.cardCaseChargebackTaskRecord = cardCaseChargebackTaskRecord;
  }


}

