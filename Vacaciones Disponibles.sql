USE [DC REPORT]
GO

/****** Object:  Table [dbo].[DC_HIS_ASIG]    Script Date: 01/04/2024 04:58:02 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DC_Vaciones_Disponibles](
    [idAgente] [varchar](250) NOT NULL,
    [NombreCompletoAgente] [varchar](250)  NULL,
	[Agente] [varchar](250)  NULL,
	[Area] [varchar](250)  NULL,
    [FechaIngreso] [date] NULL,
    [DiasVacaciones] [int] NULL,
    CONSTRAINT PK_DC_Historial_Vacaciones PRIMARY KEY CLUSTERED ([idAgente])
) ON [PRIMARY];
GO


