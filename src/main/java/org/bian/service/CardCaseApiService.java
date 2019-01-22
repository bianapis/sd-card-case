/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardCaseApiService {

	CardCaseBaseWithIdAndRoot executePost(CardCaseBase request);
	
	CardCaseBaseWithIdAndRoot executePut(String crReferenceId, CardCaseBase request);
	
	CardCaseRecordBaseWithIdAndRoot record(String crReferenceId, CardCaseRecordBase request);
	
	CardCaseBaseWithIdAndRoot requestPost(CardCaseBase request);
	
	CardCaseBaseWithIdAndRoot requestPut(String crReferenceId, CardCaseBase request);
	
	CardCaseBaseWithIdAndRoot retrieve(String crReferenceId);
	
	CardCaseArbitrationBaseWithIdAndRoot retrieveArbitrations(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CardCaseChargebackBaseWithIdAndRoot retrieveChargebacks(String crReferenceId, String bqReferenceId);
	
	CardCaseConsolidationBaseWithIdAndRoot retrieveConsolidations(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	CardCaseResolutionBaseWithIdAndRoot retrieveResolutions(String crReferenceId, String bqReferenceId);
	
	CardCaseBaseWithIdAndRoot update(String crReferenceId, CardCaseBase request);
	
}
