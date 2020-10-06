package ac.th.kmitl;

import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}
