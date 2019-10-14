package za.ac.cput.sqldemo.Repository;

public interface IRepository<C, ID> {
    C create(C c);

    C read(ID id);

    C update(C c);

    void delete(ID id);
}
