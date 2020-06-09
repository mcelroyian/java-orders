package local.imcelroy.orders.models;

import javax.persistence.*;

@Entity
@Table(name = 'orders')
public class Orders
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum;

    private double ordamount;
    private double advanceamount;

// NEEDS STUFF HERE
    private long custcode;
    private String orderdescription;
}
