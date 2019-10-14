package za.ac.cput.sqldemo.Service;

public interface IService <C, ID> {
    C create(C c);

    C read(ID id);

    C update(C c);

    void delete(ID id);
}
