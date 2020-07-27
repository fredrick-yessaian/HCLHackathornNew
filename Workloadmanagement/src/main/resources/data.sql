

insert into USER_TBX (User_Id, First_Name, Last_Name, User_Group) values(usr_id_seq_name.NEXTVAL,'Staff1','Staff1','VEG');
insert into USER_TBX (User_Id, First_Name, Last_Name, User_Group) values(usr_id_seq_name.NEXTVAL,'Staff2','Staff2','VEG');
insert into USER_TBX (User_Id, First_Name, Last_Name, User_Group) values(usr_id_seq_name.NEXTVAL,'Staff3','Staff3','VEG');
insert into USER_TBX (User_Id, First_Name, Last_Name, User_Group) values(usr_id_seq_name.NEXTVAL,'Staff4','Staff4','NVEG');
insert into USER_TBX (User_Id, First_Name, Last_Name, User_Group) values(usr_id_seq_name.NEXTVAL,'Staff5','Staff5','NVEG');
insert into USER_TBX (User_Id, First_Name, Last_Name, User_Group) values(usr_id_seq_name.NEXTVAL,'Staff6','Staff6','NVEG');
insert into USER_TBX (User_Id, First_Name, Last_Name, User_Group) values(usr_id_seq_name.NEXTVAL,'Staff7','Staff7','DRK');
insert into USER_TBX (User_Id, First_Name, Last_Name, User_Group) values(usr_id_seq_name.NEXTVAL,'Staff8','Staff8','DRK');
insert into USER_TBX (User_Id, First_Name, Last_Name, User_Group) values(usr_id_seq_name.NEXTVAL,'Staff9','Staff9','DRK');


insert into ORDER_TBX (Order_Id, First_Name, Last_Name, Price, Order_Status) values(ORD_ID_SEQ_NAME.NEXTVAL,'Customer1','Customer1','23.00','NEW');
insert into ORDER_TBX (Order_Id, First_Name, Last_Name, Price, Order_Status) values(ORD_ID_SEQ_NAME.NEXTVAL,'Customer2','Customer2','23.00','NEW');
insert into ORDER_TBX (Order_Id, First_Name, Last_Name, Price, Order_Status) values(ORD_ID_SEQ_NAME.NEXTVAL,'Customer3','Customer3','24.56','NEW');
insert into ORDER_TBX (Order_Id, First_Name, Last_Name, Price, Order_Status) values(ORD_ID_SEQ_NAME.NEXTVAL,'Customer4','Customer4','15.30','NEW');
insert into ORDER_TBX (Order_Id, First_Name, Last_Name, Price, Order_Status) values(ORD_ID_SEQ_NAME.NEXTVAL,'Customer5','Customer5','24.56','NEW');


insert into ORDER_DETAILS_TBX (Order_Details_Id, Product_Name, Quantity, Order_Status, User_Id, Order_Id) values(ORD_DET_ID_SEQ_NAME.NEXTVAL,'Cheese Pizza','2','NEW','1003','1');
insert into ORDER_DETAILS_TBX (Order_Details_Id, Product_Name, Quantity, Order_Status, User_Id, Order_Id) values(ORD_DET_ID_SEQ_NAME.NEXTVAL,'Veg Pizza','3','NEW','1003','1');
insert into ORDER_DETAILS_TBX (Order_Details_Id, Product_Name, Quantity, Order_Status, User_Id, Order_Id) values(ORD_DET_ID_SEQ_NAME.NEXTVAL,'Veg Burger','5','NEW','1003','1');
insert into ORDER_DETAILS_TBX (Order_Details_Id, Product_Name, Quantity, Order_Status, User_Id, Order_Id) values(ORD_DET_ID_SEQ_NAME.NEXTVAL,'Chicken Pizza','2','NEW','1005','2');
insert into ORDER_DETAILS_TBX (Order_Details_Id, Product_Name, Quantity, Order_Status, User_Id, Order_Id) values(ORD_DET_ID_SEQ_NAME.NEXTVAL,'Pizza','3','NEW','1002','2');
insert into ORDER_DETAILS_TBX (Order_Details_Id, Product_Name, Quantity, Order_Status, User_Id, Order_Id) values(ORD_DET_ID_SEQ_NAME.NEXTVAL,'Coffee','5','NEW','1007','2');
insert into ORDER_DETAILS_TBX (Order_Details_Id, Product_Name, Quantity, Order_Status, User_Id, Order_Id) values(ORD_DET_ID_SEQ_NAME.NEXTVAL,'Meet Pizza','2','NEW','1006','5');
insert into ORDER_DETAILS_TBX (Order_Details_Id, Product_Name, Quantity, Order_Status, User_Id, Order_Id) values(ORD_DET_ID_SEQ_NAME.NEXTVAL,'Meet Burger','3','NEW','1004','3');
insert into ORDER_DETAILS_TBX (Order_Details_Id, Product_Name, Quantity, Order_Status, User_Id, Order_Id) values(ORD_DET_ID_SEQ_NAME.NEXTVAL,'Coke','5','NEW','1008','1');