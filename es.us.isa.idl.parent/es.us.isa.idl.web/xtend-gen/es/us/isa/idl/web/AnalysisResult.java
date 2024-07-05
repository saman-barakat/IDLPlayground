package es.us.isa.idl.web;

import java.util.List;
import java.util.Map;

public class AnalysisResult {
	private boolean valid;
	private Map<String, List<String>> analysisResult;
	
	public AnalysisResult() {}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public Map<String, List<String>> getAnalysisResult() {
		return analysisResult;
	}

	public void setAnalysisResult(Map<String, List<String>> analysisResult) {
		this.analysisResult = analysisResult;
	}
	
	
	

}
