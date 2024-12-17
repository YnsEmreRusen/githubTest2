package yunusemrerusen.yer.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import yunusemrerusen.yer.Entity.Core.Orders;

public interface OrdersDao extends JpaRepository<Orders, Integer> {

}
