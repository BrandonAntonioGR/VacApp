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

use [DC REPORT]
UPDATE [DC_Vaciones_Disponibles]
SET [VacacionesTomadas]=5
WHERE [NombreCompletoAgente]like'%prueba%'


delete from [DC_Vaciones_Disponibles] where [Agente]like'%prueba%'
