/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP (1000) [idAgente]
      ,[NombreCompletoAgente]
      ,[Agente]
      ,[Area]
      ,[FechaIngreso]
      ,[VacacionesPorAnio]
      ,[VacacionesTomadas]
      ,[VacacionesDisponibles]
  FROM [DC REPORT].[dbo].[DC_Vaciones_Disponibles]


SELECT 
vd.[NombreCompletoAgente] AS NombreCompletoAgente
,vd.[VacacionesDisponibles] AS VacacionesDisponibles
,a.[DescArea] AS DescArea
FROM [DC_Vaciones_Disponibles] AS vd
LEFT JOIN [DC_Areas] AS a
ON vd.[Area]=a.[idArea]
WHERE [idAgente]='DC:Areli:2024-04-02 17:28:50:2021-12-28'



