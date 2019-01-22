package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardCaseRecordBaseWithIdAndRoot
 */
public class CardCaseRecordBaseWithIdAndRoot   {
  private String cardCaseRecordReference = null;

  private String recordingRecordStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: for card case specific feedback 
   * @return cardCaseRecordReference
  **/

  public String getCardCaseRecordReference() {
    return cardCaseRecordReference;
  }

  public void setCardCaseRecordReference(String cardCaseRecordReference) {
    this.cardCaseRecordReference = cardCaseRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Recording Record Status 
   * @return recordingRecordStatus
  **/

  public String getRecordingRecordStatus() {
    return recordingRecordStatus;
  }

  public void setRecordingRecordStatus(String recordingRecordStatus) {
    this.recordingRecordStatus = recordingRecordStatus;
  }


}

