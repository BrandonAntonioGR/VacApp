USE [DC REPORT]
GO

/****** Object:  Trigger [dbo].[tr_CalculoVacacionesTotalesUpdate]    Script Date: 05/04/2024 06:02:19 p. m. ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


CREATE TRIGGER [dbo].[tr_CalculoVacacionesTotalesUpdate]
ON [dbo].[DC_Historial_Vacaciones]
FOR UPDATE 
AS
BEGIN
    DECLARE @idAgente VARCHAR(250)
    SELECT @idAgente = [idAgente] FROM inserted
    
    UPDATE [DC_Vaciones_Disponibles] 
    SET [VacacionesTomadas] = 
		(SELECT COALESCE(SUM([DiasTomados]), 0) AS TotalDiasTomados
			FROM [DC_Historial_Vacaciones] 
			WHERE [idAgente] = @idAgente
			AND YEAR([FechaFin]) = YEAR(GETDATE())
			AND [Status] = 'APROBADO')
    WHERE [idAgente] = @idAgente

    UPDATE [DC_Vaciones_Disponibles] 
    SET [VacacionesDisponibles] = ([VacacionesPorAnio] - [VacacionesTomadas])
    WHERE [idAgente] = @idAgente
END
GO

ALTER TABLE [dbo].[DC_Historial_Vacaciones] ENABLE TRIGGER [tr_CalculoVacacionesTotalesUpdate]
GO


