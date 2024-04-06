/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP (1000) [idAgente]
      ,[Usuario]
      ,[Contrasenia]
      ,[TipoUsuario]
  FROM [DC REPORT].[dbo].[DC_Users_Vacaciones]

  --UPDATE [DC_Users_Vacaciones] SET [TipoUsuario]='ADMIN' WHERE [idAgente]='DC:Juls:2024-04-03 13:10:17:2024-04-01'

  SELECT TOP (1000) [idAgente]
      ,[Usuario]
      ,[Contrasenia]
      ,[TipoUsuario]
  FROM [DC REPORT].[dbo].[DC_Users_Vacaciones]