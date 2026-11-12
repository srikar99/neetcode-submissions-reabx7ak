-- Write your query below
select c.name from customers c inner join orders o on c.id <> o.customer_id; 