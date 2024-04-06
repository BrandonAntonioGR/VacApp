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
  --Elimina 
  --UPDATE [DC_Vaciones_Disponibles] SET [VacacionesDisponibles]=[VacacionesPorAnio] -- where [idAgente]='DC:Andrea:2024-04-02 17:33:58:2023-08-07'
--  UPDATE [DC_Vaciones_Disponibles] SET [VacacionesTomadas]=0
--Elimina las priebas realizadas 
--DELETE [DC_Vaciones_Disponibles] WHERE [Agente] LIKE '%prueba%'
--DELETE [DC_Vaciones_Disponibles] WHERE [idAgente] LIKE 'DC::2024-04-05 11:20:19:2024-04-01'

  SELECT SUM([DiasTomados]) 
			FROM [DC_Historial_Vacaciones] 
			WHERE [idAgente] = 'DC:Andrea:2024-04-02 17:33:58:2023-08-07'
			AND YEAR([FechaFin])=YEAR(GETDATE())
			AND [Status]='APROBADO'


use [DC REPORT]
SELECT vd.[idAgente]
,vd.[NombreCompletoAgente]
,vd.[Agente]
,vd.[Area]
,vd.[FechaIngreso]
,vd.[VacacionesDisponibles]
FROM [DC REPORT].[dbo].[DC_Vaciones_Disponibles] AS vd
LEFT JOIN [DC_Users_Vacaciones] AS uv
ON vd.idAgente=uv.[idAgente]
WHERE [Area]='DC'  AND uv.[TipoUsuario] !='ADMIN'