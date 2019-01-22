/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardCaseApiServiceImpl implements CardCaseApiService {

	public CardCaseBaseWithIdAndRoot executePost(CardCaseBase request){
		return JsonReader.read("executePost-CardCaseBaseWithIdAndRoot.json",new TypeReference<CardCaseBaseWithIdAndRoot>(){});
	}
	
	public CardCaseBaseWithIdAndRoot executePut(String crReferenceId, CardCaseBase request){
		return JsonReader.read("executePut-CardCaseBaseWithIdAndRoot.json",new TypeReference<CardCaseBaseWithIdAndRoot>(){});
	}
	
	public CardCaseRecordBaseWithIdAndRoot record(String crReferenceId, CardCaseRecordBase request){
		return JsonReader.read("record-CardCaseRecordBaseWithIdAndRoot.json",new TypeReference<CardCaseRecordBaseWithIdAndRoot>(){});
	}
	
	public CardCaseBaseWithIdAndRoot requestPost(CardCaseBase request){
		return JsonReader.read("requestPost-CardCaseBaseWithIdAndRoot.json",new TypeReference<CardCaseBaseWithIdAndRoot>(){});
	}
	
	public CardCaseBaseWithIdAndRoot requestPut(String crReferenceId, CardCaseBase request){
		return JsonReader.read("requestPut-CardCaseBaseWithIdAndRoot.json",new TypeReference<CardCaseBaseWithIdAndRoot>(){});
	}
	
	public CardCaseBaseWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CardCaseBaseWithIdAndRoot.json",new TypeReference<CardCaseBaseWithIdAndRoot>(){});
	}
	
	public CardCaseArbitrationBaseWithIdAndRoot retrieveArbitrations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardCaseArbitrationBaseWithIdAndRoot.json",new TypeReference<CardCaseArbitrationBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CardCaseChargebackBaseWithIdAndRoot retrieveChargebacks(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardCaseChargebackBaseWithIdAndRoot.json",new TypeReference<CardCaseChargebackBaseWithIdAndRoot>(){});
	}
	
	public CardCaseConsolidationBaseWithIdAndRoot retrieveConsolidations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardCaseConsolidationBaseWithIdAndRoot.json",new TypeReference<CardCaseConsolidationBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CardCaseResolutionBaseWithIdAndRoot retrieveResolutions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardCaseResolutionBaseWithIdAndRoot.json",new TypeReference<CardCaseResolutionBaseWithIdAndRoot>(){});
	}
	
	public CardCaseBaseWithIdAndRoot update(String crReferenceId, CardCaseBase request){
		return JsonReader.read("update-CardCaseBaseWithIdAndRoot.json",new TypeReference<CardCaseBaseWithIdAndRoot>(){});
	}
	
}
