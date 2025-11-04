package test;

import entidades.Cliente;
import entidades.Producto;
import repo.Repositorio;

public class TestMain {
    public static void main(String[] args) {
        Repositorio<Cliente> clienteRepositorio = new Repositorio<>();
        clienteRepositorio.agregar(new Cliente("Eloy"));
        clienteRepositorio.agregar(new Cliente("Susana"));

        for (Cliente cliente : clienteRepositorio.obtenerTodos()) {
            System.out.println(cliente);
        }


        Repositorio<Producto> productoRepositorio = new Repositorio<>();
        productoRepositorio.agregar(new Producto("Leche"));
        productoRepositorio.agregar(new Producto("Arroz"));
        productoRepositorio.agregar(new Producto("Huevo"));

        for (Producto producto : productoRepositorio.obtenerTodos()) {
            System.out.println(producto);
        }
    }
}
