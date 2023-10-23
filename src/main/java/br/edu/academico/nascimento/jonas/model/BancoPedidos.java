package br.edu.academico.nascimento.jonas.model;

import java.util.ArrayList;
import java.util.List;

public class BancoPedidos {
	private static BancoPedidos instance;
	
	private List<Pedido> listaPedidos;
	
	private BancoPedidos() {
		listaPedidos = new ArrayList<>();
	}
	
	public static BancoPedidos getInstance() {
		if(instance == null) 
			instance = new BancoPedidos();
		
		return instance;
	}
	
	public void salvarPedido(Pedido pedido) {
		this.listaPedidos.add(pedido);
	}
	
	public List<Pedido> listarPedidos(){
		return new ArrayList<>(listaPedidos);
	}
	
	public Pedido obterPedido(int id) {
		return listaPedidos.stream().filter(pedido -> pedido.getId() == id).findFirst().get();
	}
	
	public void atualizarPedido(Pedido attPedido) {
		Pedido pedido = obterPedido(attPedido.getId());
		
		pedido.setId(attPedido.getId());
		pedido.setDataPedido(attPedido.getDataPedido());
		pedido.setNomeProduto(attPedido.getNomeProduto());
		pedido.setPrecoProduto(attPedido.getPrecoProduto());
		pedido.setCpfCliente(attPedido.getCpfCliente());
	}
	
	public void removerPedido(int id) {
		listaPedidos.removeIf(pedido -> pedido.getId() == id);
	}
}
