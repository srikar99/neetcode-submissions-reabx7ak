-- Write your query below
select c.name from orders o right outer join customers c on c.id = o.customer_id; 