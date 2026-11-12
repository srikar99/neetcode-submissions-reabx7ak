-- Write your query below
select c.name from customers c right outer join orders o on c.id <> o.customer_id; 