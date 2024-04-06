/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP (1000) [Creation_Day]
      ,[idAgente]
      ,[FechaSolicitud]
      ,[FechaInicio]
      ,[FechaFin]
      ,[Status]
      ,[DiasTomados]
  FROM [DC REPORT].[dbo].[DC_Historial_Vacaciones]


SELECT
[FechaSolicitud]
,[FechaInicio]
,[FechaFin]
,[Status]
,[DiasTomados]
FROM [DC REPORT].[dbo].[DC_Historial_Vacaciones]
WHERE [idAgente]='DC:Andrea:2024-04-02 17:33:58:2023-08-07'
AND YEAR(CONVERT(DATE,[FechaInicio]))=YEAR(CONVERT(DATE,GETDATE()))
ORDER BY [FechaInicio] DESC


SELECT
vd.[NombreCompletoAgente]
,hv.[FechaSolicitud]
,hv.[FechaInicio]
,hv.[FechaFin]
,hv.[Status]
,hv.[DiasTomados]
FROM [DC REPORT].[dbo].[DC_Historial_Vacaciones] AS hv
LEFT JOIN [DC_Vaciones_Disponibles] AS vd
ON hv.[idAgente]=vd.[idAgente]
WHERE hv.[idAgente]='DC:Fabiola:2024-04-02 17:26:32:2022-02-21'
AND  hv.[FechaInicio]='2024-03-29'
AND  hv.[FechaFin]='2024-03-30'
AND CONVERT(DATE,hv.[FechaInicio])>=CONVERT(DATE,GETDATE())


--use [DC REPORT]
  --DELETE FROM [DC_Historial_Vacaciones] WHERE [idAgente]='DC:Andrea:2024-04-02 17:33:58:2023-08-07'