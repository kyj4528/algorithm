-- 코드를 입력하세요
SELECT b.BOOK_ID
     , a.AUTHOR_NAME
     , date_format(b.PUBLISHED_DATE,'%Y-%m-%d')
  from BOOK b
     , AUTHOR a
 where a.AUTHOR_ID = b.AUTHOR_ID
   and b.CATEGORY = '경제'
 order by b.PUBLISHED_DATE asc;