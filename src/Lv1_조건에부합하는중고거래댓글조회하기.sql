SELECT title, board_id, reply_id, reply.writer_id, reply.contents, DATE_FORMAT(reply.created_date, '%Y-%m-%d') AS created_date
FROM USED_GOODS_BOARD board
JOIN USED_GOODS_REPLY reply
USING (board_id)
WHERE board.created_date >= '2022-10-01' AND board.created_date < '2022-11-01'
ORDER BY reply.created_date ASC, title ASC;