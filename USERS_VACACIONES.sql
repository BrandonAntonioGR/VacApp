USE [DC REPORT]
GO

/****** Object:  Table [dbo].[Users_Vacaciones]    Script Date: 02/04/2024 09:10:32 a. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DC_Users_Vacaciones](
	[idAgente] [varchar](250) NOT NULL,
	[Usuario] [varchar](250) NULL,
	[Contrasenia] [varchar](250) NULL,
	[TipoUsuario] [varchar](250) NULL
) ON [PRIMARY]
GO


