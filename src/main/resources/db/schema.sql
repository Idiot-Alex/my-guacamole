create table if not exists t_admin(
admin_id bigint not null primary key,
user_name varchar(255),
password varchar(255),
create_time timestamp,
update_time timestamp,
status int
);

create table if not exists t_client(
client_id bigint not null primary key,
client_name varchar(255),
host_name varchar(255),
port int,
user_name varchar(255),
password varchar(255),
protocol varchar(10),
create_time timestamp,
update_time timestamp,
status int
);

create table if not exists t_label(
label_id bigint not null primary key,
label_name varchar(255),
create_time timestamp,
update_time timestamp,
status int
);

create table if not exists t_client_label(
client_label_id bigint not null primary key,
client_id bigint,
label_id bigint,
create_time timestamp,
update_time timestamp,
status int
);