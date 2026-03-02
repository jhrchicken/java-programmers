SELECT COUNT(*) AS fish_count
FROM fish_info
JOIN fish_name_info
USING (fish_type)
WHERE fish_name = 'BASS' or fish_name = 'snapper';