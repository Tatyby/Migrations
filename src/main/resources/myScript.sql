select product_name from ORDERS
                             LEFT JOIN CUSTOMERS
                                       on ORDERS.customer_id=CUSTOMERS.id
where CUSTOMERS.name= :name;