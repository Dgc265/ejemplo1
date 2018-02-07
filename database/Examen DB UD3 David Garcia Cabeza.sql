/*David Garcia Cabeza*/
/* 1*/
select m.num_colegiado, m.apellidos, m.especialidad,max(v.fecha)as 'ultimaVisita',count(*) as 'NumeroVisitas',
	sum(IFNULL(precio, 100)) as'IngresosObtenidos'
from medicos m inner join visitas v on  m.num_colegiado = v.medico
group by v.medico
order by v.fecha;

/*Creacion de la vista del ejercicio 1*/
Create view estadisticas as select m.num_colegiado, m.apellidos, m.especialidad,max(v.fecha)as 'ultimaVisita',count(*) as 'NumeroVisitas',
	sum(IFNULL(precio, 100)) as'IngresosObtenidos'
from medicos m inner join visitas v on  m.num_colegiado = v.medico
group by v.medico
order by v.fecha;


/*2*/
select apellidos,''as'nombre',fecha_nac,timestampdiff(year,fecha_nac,current_date()) as 'EdadActual',universidad,' 'as'localidad',
	concat('Medico especialista en',' ',IFNULL(especialidad,'Sin especialidad')) as 'riesgo'
from medicos
where month(fecha_nac)in(06,07,08)


union

select MID(apenom,1,11),MID(apenom,13,16),fecha_nac,timestampdiff(year,fecha_nac,current_date()) as 'Edad','' as'universidad',localidad,
	concat('Su IMC es',' ',round((peso/power(altura,2))))
from pacientes
where month(fecha_nac) in(06,07,08)
order by EdadActual;

/*3*/
select apenom'Apellidos y Nombre',IFNULL(id_visita,'No visitado') as 'idVisita',fecha,IFNULL(precio,'Pendiente de pago')as' precio'
from pacientes p left join visitas v on p.dni=v.paciente
order by p.dni,v.fecha;


/*4*/
select dni,apenom as 'Apellidos y Nombre',altura
from pacientes
where altura > (select AVG(altura)
from pacientes p inner join visitas v inner join medicos m on p.dni=v.paciente and v.medico=m.num_colegiado
where especialidad ='psiquiatria');


