package br.com.backend.pedido.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.backend.pedido.model.Fornecedor;
import lombok.Getter;
import lombok.Setter;

public class FornecedorDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public FornecedorDto() {
		
	}

	public FornecedorDto(Fornecedor fornecedor) {
		super();
		this.idFornecedor = fornecedor.getIdFornecedor();
		this.nome = fornecedor.getNome();
		this.cnpj = fornecedor.getCnpj();
		this.cpf = fornecedor.getCpf();
		this.endereco = fornecedor.getEndereco();
		this.numero = fornecedor.getNumero();
		this.complemento = fornecedor.getComplemento();
		this.email = fornecedor.getEmail();
		this.celular = fornecedor.getCelular();
		this.dataCadastro = fornecedor.getDataCadastro();
	}
;
	@Getter @Setter
	private Long idFornecedor;
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String cnpj;
		
	@Getter @Setter
	private String cpf;
	
	@Getter @Setter
	private String endereco;
	
	@Getter @Setter
	private String numero;
	
	@Getter @Setter
	private String complemento;
	
	@Getter @Setter
	private String email;

	@Getter @Setter
	private String celular;
	
	@Getter @Setter
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@Override
	public String toString() {
		return "FornecedorDto [idFornecedor=" + idFornecedor + ", nome=" + nome + ", cnpj=" + cnpj + ", cpf=" + cpf
				+ ", endereco=" + endereco + ", numero=" + numero + ", complemento=" + complemento + ", email=" + email
				+ ", celular=" + celular + ", dataCadastro=" + dataCadastro + "]";
	}
	
	
	
	

}
