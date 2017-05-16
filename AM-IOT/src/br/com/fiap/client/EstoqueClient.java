package br.com.fiap.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class EstoqueClient {

	private Client client;
	private WebResource res;
	
	public EstoqueClient(){
		this.client = Client.create();
		this.res = this.client.resource("http://127.0.0.1:1880/hora");
	}
	
	public String getJson(){
		return this.res.getRequestBuilder().get(String.class);
	}
	
}
