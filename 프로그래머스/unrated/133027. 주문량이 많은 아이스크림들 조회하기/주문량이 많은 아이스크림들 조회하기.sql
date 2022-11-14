-- 코드를 입력하세요
 SELECT j.flavor
from july j, FIRST_HALF f
where j.flavor = f.flavor
group by j.flavor
order by sum(j.total_order + f.total_order) desc
limit 3