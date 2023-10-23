package br.edu.academico.nascimento.jonas.model;

import java.math.BigDecimal;
import java.util.Date;

public class Pedido {
	public static int ultimoPedido;
	
	private int id;
	private String nomeProduto;
	private BigDecimal precoProduto;
	private Date dataPedido;
	private String cpfCliente;
	
	public Pedido() {
		this.giveId();
	}

	public Pedido(String nomeProduto, BigDecimal precoProduto, Date dataPedido, String cpfCliente) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.dataPedido = dataPedido;
		this.cpfCliente = cpfCliente;
		
		this.giveId();
	}
	
	private void giveId() {
		Pedido.ultimoPedido ++;
		this.id = Pedido.ultimoPedido;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(BigDecimal precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", nomeProduto=" + nomeProduto + ", precoProduto=" + precoProduto + ", dataPedido="
				+ dataPedido + ", cpfCliente=" + cpfCliente + "]";
	}

	
}
