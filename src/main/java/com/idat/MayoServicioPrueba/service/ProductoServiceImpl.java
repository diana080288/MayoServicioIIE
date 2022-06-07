package com.idat.MayoServicioPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.model.Productos;
import com.idat.MayoServicioPrueba.repository.ProductoRepository;

//anotacion service
@Service
public class ProductoServiceImpl implements ProductoService {
	
	// anotacion autowide y agregar la interface de productorepository
	@Autowired
	private ProductoRepository repository;
	

	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		repository.guardarProducto(producto);

	}

	@Override
	public void actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub
		repository.actualizarProducto(producto);

	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repository.eliminarProducto(id);

	}

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return repository.listarProductos();
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		return repository.obtenerProductoId(id);
	}

}
