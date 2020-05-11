package com.jubureba.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Fisica"),
	PESSOAJURIFICA(2, "Pessoa Juridica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) { //possivel de executar mesmo sem passar objetos
		if (cod == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) { //pecorre todos os valores do TipoCliente
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id invalido:  " + cod);
	}
	
}
