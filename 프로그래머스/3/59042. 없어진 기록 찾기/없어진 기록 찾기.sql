-- 코드를 입력하세요
SELECT ANIMAL_ID
     , NAME
  from ANIMAL_OUTS ao
 where ANIMAL_ID not in(
            select ao.ANIMAL_ID
            from ANIMAL_OUTS ao
               , ANIMAL_INS ai
            where ao.ANIMAL_ID = ai.ANIMAL_ID
 )