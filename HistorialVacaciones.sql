USE [DC REPORT]
GO

/****** Object:  Table [dbo].[DC_Historial_Vacaciones]    Script Date: 03/04/2024 09:08:08 a. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[DC_Historial_Vacaciones](
	[Creation_Day] [datetime] NULL,
	[idAgente] [varchar](250) NOT NULL,
	[FechaSolicitud] [date] NULL,
	[FechaInicio] [date] NULL,
	[FechaFin] [date] NULL,
	[Status] [varchar](250) NOT NULL,
	[DiasTomados] [int] NULL
) ON [PRIMARY]
GO


