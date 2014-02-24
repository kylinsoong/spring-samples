package org.spring.samples.ws;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;

public class SpringWSClientTest {
	
	@Autowired
    private WebServiceTemplate webServiceTemplate;
	
	public void test() {
		webServiceTemplate.sendAndReceive(new WebServiceMessageCallback(){

			public void doWithMessage(WebServiceMessage message)
					throws IOException, TransformerException {
				// TODO Auto-generated method stub
				
			}}, new WebServiceMessageCallback(){

				public void doWithMessage(WebServiceMessage message)
						throws IOException, TransformerException {
					// TODO Auto-generated method stub
					
				}});
	}

	public static void main(String[] args) {
		
		
	}

}
