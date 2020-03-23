insert into customer values (1001,'Navya','Bangalore');
insert into customer values (1002,'Kavya','Chennai');

insert into cartorder values (2001,200,1001);
insert into cartorder values (2002,300,1002);

insert into cart values (3001,1001);
insert into cart values (3002,1002);

insert into item (id,name,price,discount,cart_order__id,cart__id) values (5001,'Les Miserables',500,5,2001,null);
insert into item (id,name,price,discount,cart_order__id,cart__id) values (5002,'Leo Tolstoy',400,5,2001,null);
insert into item (id,name,price,discount,cart_order__id,cart__id) values (5003,'Great Expectations',600,15,2001,null);
insert into item (id,name,price,discount,cart_order__id,cart__id) values (5004,'A Walk To Remember',400,9,null,3002);
insert into item (id,name,price,discount,cart_order__id,cart__id) values (5005,'India After Gandhi',500,25,null,3002);
