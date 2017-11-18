use teacher;

drop table if exists typed;

create table typed
    (
    typekey varchar(3) not null, educationallevel varchar(20), gender varchar(6),
    primary key(typekey)
	);
    
insert into typed
values
('P.M', 'primary', 'male'),
('P.F', 'primary', 'female'),
('S.M', 'secondary', 'male'),
('S.F', 'secondary', 'female'),
('T.M', 'tertiary', 'male'),
('T.F', 'tertiary', 'female');
