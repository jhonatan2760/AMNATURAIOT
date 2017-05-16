package br.com.fiap;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.fiap.client.EstoqueClient;

@ManagedBean
public class EstoqueBean {

	private EstoqueClient estoque;
	
	public EstoqueBean(){
		
	}
	
	public void doRun(){
		System.out.println("Ok");
	}
	
	@PostConstruct
	public void init(){
		this.estoque = new EstoqueClient();
	}
	
	public String getResponse(){
		return this.estoque.getJson();
	}
}
