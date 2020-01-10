insert into brand (name) values ('PUMA');
insert into brand (name) values ('ADIDAS');
insert into brand (name) values ('REEBOK');
insert into brand (name) values ('LP');
insert into brand (name) values ('ALLENSOLLY');


insert into category (name) values ('SHIRT');
insert into category (name) values ('PANT');
insert into category (name) values ('CAP');
insert into category (name) values ('SHOE');


insert into product (id,name,price,brand,color,size,sku,seller,category) values (1,'sleeve less Shirt', 1000, 'PUMA', 'red', 'L', 'SKU001', 'ABC', 'SHIRT');
insert into product (id,name,price,brand,color,size,sku,seller,category) values (2,'running shoe', 5000, 'PUMA', 'red', 'L', 'SKU002', 'ABC', 'SHOE');
insert into product (id,name,price,brand,color,size,sku,seller,category) values (3,'sports shoe', 4000, 'PUMA', 'white', '9', 'SKU003', 'ABC', 'SHOE');
insert into product (id,name,price,brand,color,size,sku,seller,category) values (4,'shirt', 1200, 'ADIDAS', 'yellow', 'XL', 'SKU004', 'XYZ', 'SHIRT');
insert into product (id,name,price,brand,color,size,sku,seller,category) values (5,'cap', 500, 'ADIDAS', 'blue', 'S', 'SKU005', 'XYZ', 'CAP');
insert into product (id,name,price,brand,color,size,sku,seller,category) values (6,'sports shirt', 900, 'ADIDAS', 'white', 'L', 'SKU006', 'MNO', 'SHIRT');
insert into product (id,name,price,brand,color,size,sku,seller,category) values (7,'jogger', 1000, 'ALLENSOLLY', 'grey', 'L', 'SKU007', 'MNO', 'PANT');
insert into product (id,name,price,brand,color,size,sku,seller,category) values (8,'pant', 1000, 'ALLENSOLLY', 'white', 'M', 'SKU008', 'MNO', 'PANT');
insert into product (id,name,price,brand,color,size,sku,seller,category) values (9,'Tshirt', 899, 'LP', 'green', 'L', 'SKU009', 'ABC', 'SHIRT');
insert into product (id,name,price,brand,color,size,sku,seller,category) values (10,'night pant', 999, 'LP', 'black', 'XXL', 'SKU010', 'XYZ', 'PANT');
commit;