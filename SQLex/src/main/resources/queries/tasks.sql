--Найдите номер модели, скорость и размер жесткого диска для всех ПК стоимостью менее 500 дол. Вывести: model, speed и hd

SELECT PC.model,PC.speed,PC.hd
FROM PC
WHERE PC.price < 500;



