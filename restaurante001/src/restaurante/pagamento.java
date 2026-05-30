package restaurante;

public class pagamento {
	
	private int id_pagamento;
	private double valor_total;
	private String tipo_pagamento;
	private boolean status_pagamento;
	
	public void realizar_pagamento() {
		if(valor_total > 0) {
			status_pagamento = true;
			System.out.println("pagamento aprovado");		}
		else {
		status_pagamento = false;
		System.out.println("pagamento recusado");}
	
	}
	
	public int getId_pagamento() {
		return id_pagamento;
	}
	
	public void setId_pagamento(int id_pagamento) {
		this.id_pagamento = id_pagamento;
	}
	
	public double getValor_total() {
		return valor_total;
	}
	
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	
	public String getTipo_pagamento() {
		return tipo_pagamento;
	}
	
	public void setTipo_pagamento(String tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}
	
	public boolean isStatus_pagamento() {
		return status_pagamento;
	}
	
	public void setStatus_pagamento(boolean status_pagamento) {
		this.status_pagamento = status_pagamento;
	}
	
}
