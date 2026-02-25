SELECT DISTINCT d.id, d.email, d.first_name, d.last_name
FROM developers d
JOIN skillcodes d
ON (d.skill_code & s.code) = s.code
WHERE S.name IN ('Python', 'C#')
ORDER BY d.id;