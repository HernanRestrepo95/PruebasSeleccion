select 
p.id, 
p.nombre,
sum(case when m.id_tipo_mov = 2 then m.cantidad else 0 end) - 
sum(case when m.id_tipo_mov = 1 then m.cantidad else 0 end) stock,
sum(case when m.id_tipo_mov = 1 then m.cantidad * p.costo else 0 end) ingresos,
sum(case when m.id_tipo_mov = 2 then m.cantidad * p.costo else 0 end) egresos,
sum(case when m.id_tipo_mov = 1 then m.cantidad * p.costo else 0 end) -
sum(case when m.id_tipo_mov = 2 then m.cantidad * p.costo else 0 end) ganacias
from movimientos m
inner join producto p on m.id_producto = p.id
where m.fecha <= '2018-12-18 23:17:08'
group by p.id, p.nombre