package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	
	public Celda getCelda1() {
		return celda1;
	}


	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}


	public Celda getCelda2() {
		return celda2;
	}


	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}


	public Celda getCelda3() {
		return celda3;
	}


	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}


	public Celda getCelda4() {
		return celda4;
	}


	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public void configurarMaquina(String codigo1,String codigo2, String codigo3, String codigo4){
		this.celda1 = new Celda(codigo1);
		this.celda2 = new Celda(codigo2);
		this.celda3 = new Celda(codigo3);
		this.celda4 = new Celda(codigo4);
	}
	public void mostrarConfiguracion(){
		System.out.println("CELDA 1: "+ celda1.getCodigo());
		System.out.println("CELDA 2: "+celda2.getCodigo());
		System.out.println("CELDA 3: "+celda3.getCodigo());
		System.out.println("CELDA 4: "+celda4.getCodigo());
		System.out.println(saldo);
	}
	
	public Celda buscarCelda(String codigo){
		if(codigo==celda1.getCodigo()){
			return celda1;
		} else if (codigo==celda2.getCodigo()){
			return celda2;
		} else if (codigo==celda3.getCodigo()){
			return celda3;
		} else if (codigo==celda4.getCodigo()){
			return celda4;
		} else {
			return null;
		}
	}
	
	public void cargarProducto(Producto producto, String codigo, int stock){
		Celda celdaRecuperada = buscarCelda(codigo);
		if (celdaRecuperada != null){
		celdaRecuperada.ingresarProducto(producto, stock);
		}else {
			System.out.println("La celda no existe!!!!!");}
		}
	
	public void mostrarProductos(){
		
		System.out.println("**********Celda: "+celda1.getCodigo());
		System.out.println("Stock: "+celda1.getStock());
		if (celda1.getProducto()!= null){
			System.out.println("Nombre producto:"+celda1.getProducto().getNombre());
			System.out.println("Pecio producto: "+celda1.getProducto().getPrecio());
			System.out.println("Codigo producto: "+celda1.getProducto().getCodigo());
		}
		else {
			System.out.println("La celda no tiene producto!!!");
		}
		
		System.out.println("**********Celda: "+celda2.getCodigo());
		System.out.println("Stock: "+celda2.getStock());
		if (celda2.getProducto()!= null){
			System.out.println("Nombre producto:"+celda2.getProducto().getNombre());
			System.out.println("Pecio producto: "+celda2.getProducto().getPrecio());
			System.out.println("Codigo producto: "+celda2.getProducto().getCodigo());
		}
		else {
			System.out.println("La celda no tiene producto!!!");
		}
		
		System.out.println("**********Celda: "+celda3.getCodigo());
		System.out.println("Stock: "+celda3.getStock());
		if (celda3.getProducto()!= null){
			System.out.println("Nombre producto: "+celda3.getProducto().getNombre());
			System.out.println("Pecio producto: "+celda3.getProducto().getPrecio());
			System.out.println("Codigo producto: "+celda3.getProducto().getCodigo());
		}
		else {
			System.out.println("La celda no tiene producto!!!");
		}
		
		System.out.println("**********Celda: "+celda4.getCodigo());
		System.out.println("Stock: "+celda4.getStock());
		if (celda4.getProducto()!= null){
		System.out.println("Nombre producto:"+celda4.getProducto().getNombre());
		System.out.println("Pecio producto: "+celda4.getProducto().getPrecio());
		System.out.println("Codigo producto: "+celda4.getProducto().getCodigo());
		}
		else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("Saldo: "+ this.saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigo){
		if(codigo==celda1.getCodigo()){
			return celda1.getProducto();
		} else if (codigo==celda2.getCodigo()){
			return celda2.getProducto();
		} else if (codigo==celda3.getCodigo()){
			return celda3.getProducto();
		} else if (codigo==celda4.getCodigo()){
			return celda4.getProducto();
		} else {
			return null;
		}
	}
	
	public double consultarPrecio(String codigo){
		if(codigo==celda1.getCodigo()){
			return celda1.getProducto().getPrecio();
		} else if (codigo==celda2.getCodigo()){
			return celda2.getProducto().getPrecio();
		} else if (codigo==celda3.getCodigo()){
			return celda3.getProducto().getPrecio();
		} else {
			return celda4.getProducto().getPrecio();
		} 
	}
	
	public Celda buscarCeldaProducto(String codigo){
		
		if(celda1.getProducto()!=null){
		if(codigo==celda1.getProducto().getCodigo()){
			return celda1;
		}else {
			return null;
		}}
		if(celda2.getProducto()!=null){
			if(codigo==celda2.getProducto().getCodigo()){
			return celda2;
			}else {
				return null;
		}}
			
		if(celda3.getProducto()!=null){
			if(codigo==celda3.getProducto().getCodigo()){
			return celda3;
			}else {
				return null;
		}}
		if(celda4.getProducto()!=null){
			if(codigo==celda4.getProducto().getCodigo()){
			return celda4;
			}else {
				return null;
		}}
		else return null;
	}
	
	public void incrementarProductos(String codigo, int stock){
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		if (celdaEncontrada != null){
			celdaEncontrada.setStock(celdaEncontrada.getStock()+stock);
			}else {
				System.out.println("El producto no existe!!!!!");}
			}
	
	public void vender (String codigo){
		if (codigo!=null){
		System.out.println(">>>>>>>Nueva venta<<<<<<<");
		if(codigo==celda1.getCodigo()){
			celda1.setStock(celda1.getStock()-1);
			this.saldo += celda1.getProducto().getPrecio();
		
		} else if (codigo==celda2.getCodigo()){
			celda2.setStock(celda2.getStock()-1);
			this.saldo += celda2.getProducto().getPrecio();
		
		} else if (codigo==celda3.getCodigo()){
			celda3.setStock(celda3.getStock()-1);
			this.saldo += celda3.getProducto().getPrecio();

		} else if (codigo== celda4.getCodigo()) {
			celda4.setStock(celda4.getStock()-1);
			this.saldo += celda4.getProducto().getPrecio();
		} 
		mostrarProductos();		
		System.out.println(">>>>>>>Fin de la venta<<<<<<<");
		
		} else {
			System.out.println("La celda no existe!!!!");}
		}
	
	public double venderConCambio(String codigo, double pago){
		if(codigo==celda1.getCodigo()){
			celda1.setStock(celda1.getStock()-1);
			this.saldo += celda1.getProducto().getPrecio();
			return pago - celda1.getProducto().getPrecio();
		
		} else if (codigo==celda2.getCodigo()){
			celda2.setStock(celda2.getStock()-1);
			this.saldo += celda2.getProducto().getPrecio();
			return pago - celda2.getProducto().getPrecio();
		
		} else if (codigo==celda3.getCodigo()){
			celda3.setStock(celda3.getStock()-1);
			this.saldo += celda3.getProducto().getPrecio();
			return pago - celda3.getProducto().getPrecio();
		
		} else {
			celda4.setStock(celda4.getStock()-1);
			this.saldo += celda4.getProducto().getPrecio();
			return pago - celda4.getProducto().getPrecio();
		} 
	}
	
	
	
}
