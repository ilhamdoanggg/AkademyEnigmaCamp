SELECT * FROM peserta;
SELECT * FROM paket;
SELECT * FROM registrasi;

-- siapa yang berangkat ke thailand

select "name" from ((registrasi INNER JOIN peserta on peserta.id_peserta = registrasi.id_peserta) 
INNER JOIN paket on paket.id_paket = registrasi.id_peket)
where destination='thailand';

-- mencari yang belum berangkat liburan
select * from ((registrasi INNER JOIN peserta on peserta.id_peserta = registrasi.id_peserta) 
INNER JOIN paket on paket.id_paket = registrasi.id_peket)
where date_flaght BETWEEN '2019-09-22' and '2019-10-13';


select * from ((registrasi LEFT JOIN peserta on peserta.id_peserta = registrasi.id_peserta) 
LEFT JOIN paket on paket.id_paket = registrasi.id_peket)
where date_flaght <= CURRENT_DATE;

select * from ((registrasi LEFT JOIN peserta on peserta.id_peserta = registrasi.id_peserta) 
LEFT JOIN paket on paket.id_paket = registrasi.id_peket)
where date_flaght >= CURRENT_DATE;

select * from ((registrasi LEFT JOIN peserta on peserta.id_peserta = registrasi.id_peserta) 
LEFT JOIN paket on paket.id_paket = registrasi.id_peket)
where date_flaght BETWEEN CURRENT_DATE and '2019-10-30';

SELECT * from ((registrasi LEFT JOIN peserta on peserta.id_peserta = registrasi.id_peserta) 
LEFT JOIN paket on paket.id_paket = registrasi.id_peket)
WHERE (SELECT date_flaght <= CURRENT_DATE);

-- mencari yang berangkat 2 minggu setelah booking
SELECT * from registrasi 
LEFT JOIN peserta on peserta.id_peserta = registrasi.id_peserta 	
LEFT JOIN paket on paket.id_paket = registrasi.id_peket
WHERE date_flaght >= date_registrasi + interval '14 days';

-- menghitung total yang sudah bayar dan berangkat
SELECT sum(bayar) as total from registrasi where date_flaght <= CURRENT_DATE ;

SELECT sum(bayar) as total from ((registrasi 
	LEFT JOIN peserta on peserta.id_peserta = registrasi.id_peserta) 	
	LEFT JOIN paket on paket.id_paket = registrasi.id_peket)
	where date_flaght <= CURRENT_DATE ;

-- harus di group jika ada sum avg dll
SELECT sum(bayar) as total, peserta.name from ((registrasi 
LEFT JOIN peserta on peserta.id_peserta = registrasi.id_peserta) 
LEFT JOIN paket on paket.id_paket = registrasi.id_peket)
where date_flaght <= CURRENT_DATE
GROUP BY peserta."name";

-- membuat table dari tabel
create tabel nama_table_backup
	select * from tabel yang_mau_di_backup;
