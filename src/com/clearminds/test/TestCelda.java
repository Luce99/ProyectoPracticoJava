package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		System.out.println(celda.getProducto().getNombre());
		/*En la linea 8 de la calse TestCelda ocurre el error 
		 "NullPointerException"	a causa de la variable celda.getProducto().getNombre()
		  quien llama a un producto que aún no tiene asignado quien a su vez llama a un
		  nombre que tampoco tiene asignado, y así se produce el doble null	*/
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("Codigo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}