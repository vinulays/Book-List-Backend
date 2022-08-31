create table books(
	BOOK_ID int Not Null AUTO_INCREMENT,
    BOOK_TITLE varchar(255) Not Null,
    BOOK_AUTHOR varchar(255),
    ISBN_NUMBER varchar(255),
    NUMBER_OF_PAGES int(255),
    PRICE double,
    PRIMARY KEY(BOOK_ID)
);
create table user(
	USER_ID int Not Null AUTO_INCREMENT,
    USER_EMAIL varchar(255) Not Null,
    USER_PASSWORD varchar(255),
    PRIMARY KEY(USER_ID)
);

insert into user (USER_EMAIL, USER_PASSWORD) values ('admin@gmail.com', 'admin');

insert into books (BOOK_TITLE, BOOK_AUTHOR, ISBN_NUMBER, NUMBER_OF_PAGES, PRICE) values('American Psyco', 'Bret Easton', '9781447277705', 273, 7.99);
insert into books (BOOK_TITLE, BOOK_AUTHOR, ISBN_NUMBER, NUMBER_OF_PAGES, PRICE) values('THE WHEEL OF TIME - THE EYE OF THE WORLD', 'Robet Jordan', '9780356516851', 141, 1.78);
insert into books (BOOK_TITLE, BOOK_AUTHOR, ISBN_NUMBER, NUMBER_OF_PAGES, PRICE) values ('THE COLOR OF MONEY','Walter Tevis',9781474600828 ,311, 19.99);
insert into books (BOOK_TITLE, BOOK_AUTHOR, ISBN_NUMBER, NUMBER_OF_PAGES, PRICE) values ('Rich Dad and Poor Dad', 'Robert T. Kiyosaki', 91180351541212, 429,53.34);