USE [DC REPORT]
GO
/****** Object:  Trigger [dbo].[tr_CalculoVacacionesTotales]    Script Date: 05/04/2024 09:11:35 a. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
ALTER TRIGGER [dbo].[tr_CalculoVacacionesTotales]
ON [dbo].[DC_Historial_Vacaciones]
FOR INSERT
AS
BEGIN
    DECLARE @idAgente VARCHAR(250)
    SELECT @idAgente = [idAgente] FROM inserted
    
    UPDATE [DC_Vaciones_Disponibles] 
    SET [VacacionesTomadas] = 
		(SELECT SUM([DiasTomados]) 
			FROM [DC_Historial_Vacaciones] 
			WHERE [idAgente] = @idAgente
			AND YEAR([FechaFin])=YEAR(GETDATE()))
    WHERE [idAgente] = @idAgente

    UPDATE [DC_Vaciones_Disponibles] 
    SET [VacacionesDisponibles] = ([VacacionesPorAnio] - [VacacionesTomadas])
    WHERE [idAgente] = @idAgente
END