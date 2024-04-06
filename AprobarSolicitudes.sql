/****** Script for SelectTopNRows command from SSMS  ******/
SELECT hv.[idAgente]
      ,hv.[FechaSolicitud]
      ,hv.[FechaInicio]
      ,hv.[FechaFin]
      ,hv.[Status]
      ,hv.[DiasTomados]
	  ,vd.Area
  FROM [DC REPORT].[dbo].[DC_Historial_Vacaciones] AS hv
  LEFT JOIN [DC_Vaciones_Disponibles] AS vd
  ON hv.[idAgente]=vd.idAgente
  WHERE CONVERT(DATE,[FechaInicio])>=CONVERT(DATE,GETDATE())
  AND [Status]='ESPERA'
  AND vd.Area='DC'