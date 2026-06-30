// package Week-1.Design-Patterns.DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {
        return "Customer ID: " + id + ", Name: Maria";
    }

}
