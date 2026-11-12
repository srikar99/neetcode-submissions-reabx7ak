-- Write your query below
select c.name from customers c join orders o on c.id <> o.customer_id; 