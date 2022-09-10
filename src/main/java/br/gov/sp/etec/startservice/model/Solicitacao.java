package br.gov.sp.etec.startservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Solicitacao {
    
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeSolicitacao;
    private String tipoSolicitacao;
    
    
    public String getNomeSolicitacao() {
    	return this.nomeSolicitacao;
    }
    
    public void setNomeSolicitacao(String nomeSolicitacao) {
    this.nomeSolicitacao = nomeSolicitacao;
    }

	public String getTipoSolicitacao() {
		return tipoSolicitacao;
	}

	public void setTipoSolicitacao(String tipoSolicitacao) {
		this.tipoSolicitacao = tipoSolicitacao;
	}
}
