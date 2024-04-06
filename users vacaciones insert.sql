/****** Script for SelectTopNRows command from SSMS  ******/
SELECT TOP (1000) [idAgente]
      ,[Usuario]
      ,[Contrasenia]
      ,[TipoUsuario]
  FROM [DC REPORT].[dbo].[DC_Users_Vacaciones]

  use [DC REPORT]
      INSERT INTO [DC_Users_Vacaciones]
  ([idAgente],[Usuario],[Contrasenia],[TipoUsuario]) 
  VALUES('DC:Brandon:2024-04-02 17:35:42:2024-02-21','p','123','')
