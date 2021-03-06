package com.serverless;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Map<String, Object>, ApiGatewayResponse> {
	ResponderModel responder = new ResponderModel();
	private static final Logger LOG = Logger.getLogger(Handler.class);

	@Override
	public ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {
		LOG.info("received: " + input);
		Map<String,String> queryStringParameters =  (Map<String,String>)input.get("queryStringParameters");
        String question = queryStringParameters.get("q");
		LOG.info("**QUESTION**: " + question);

		String message = responder.answer(question);
		LOG.info("**MESSAGE**: " + message);
		
		Map<String, String> headers = new HashMap<>();
		headers.put("X-Powered-By", "AWS Lambda & Serverless");
		headers.put("Content-Type", "application/json");
		
		return ApiGatewayResponse.builder()
				.setStatusCode(200)
				.setObjectBody(message)
				.setHeaders(headers)
				.build();
	}
}
