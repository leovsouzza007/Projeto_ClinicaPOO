package service;
import java.util.List;
public interface Repository<T>{void salvar(T item); List<T> listar(); T buscarPorId(int id); void remover(int id);}