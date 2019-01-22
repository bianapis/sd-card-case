/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class CardCaseApiController {

	@Autowired
	CardCaseApiService service;
	
	@Process.ExecutePost
	public BianResponse<CardCaseBaseWithIdAndRoot> executePost(@RequestBody BianRequest<CardCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Process.ExecutePut
	public BianResponse<CardCaseBaseWithIdAndRoot> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<CardCaseRecordBaseWithIdAndRoot> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardCaseRecordBase> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RequestPost
	public BianResponse<CardCaseBaseWithIdAndRoot> requestPost(@RequestBody BianRequest<CardCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Process.RequestPut
	public BianResponse<CardCaseBaseWithIdAndRoot> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CardCaseBaseWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("arbitrations")
	@Process.Retrieve
	public BianResponse<CardCaseArbitrationBaseWithIdAndRoot> retrieveArbitrations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveArbitrations(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("chargebacks")
	@Process.Retrieve
	public BianResponse<CardCaseChargebackBaseWithIdAndRoot> retrieveChargebacks(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveChargebacks(crReferenceId, bqReferenceId));
	}
	
	@BQ("consolidations")
	@Process.Retrieve
	public BianResponse<CardCaseConsolidationBaseWithIdAndRoot> retrieveConsolidations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveConsolidations(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("resolutions")
	@Process.Retrieve
	public BianResponse<CardCaseResolutionBaseWithIdAndRoot> retrieveResolutions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveResolutions(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<CardCaseBaseWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
