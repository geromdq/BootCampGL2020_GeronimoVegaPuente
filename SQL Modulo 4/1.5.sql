use BOOTCAMP;
select  species,id,name FROM ANIMALS GROUP BY species,name order by species,CAST(id AS decimal) desc;